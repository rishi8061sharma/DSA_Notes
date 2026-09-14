import java.util.spi.ToolProvider;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class Build {
  public static void main(String[] a) throws Exception {
    var javac = ToolProvider.findFirst("javac").orElseThrow(() -> new RuntimeException("no javac tool"));
    List<String> srcs = Files.walk(Path.of("chess"))
        .filter(p -> p.toString().endsWith(".java"))
        .map(Path::toString).collect(Collectors.toList());
    Files.createDirectories(Path.of("out"));
    List<String> args = new ArrayList<>(List.of("-d", "out"));
    args.addAll(srcs);
    int rc = javac.run(System.out, System.err, args.toArray(new String[0]));
    System.out.println("javac exit code: " + rc);
    System.exit(rc);
  }
}
