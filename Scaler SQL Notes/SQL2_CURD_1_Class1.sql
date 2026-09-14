show databases; 
create database scaler;
use scaler;
CREATE TABLE students (
	id INT auto_increment, 
    name varchar(50) NOT NULL, 
    email varchar(50) NOT NULL, 
    enrollmentDate timestamp default current_timestamp, 
    psp DECIMAL(3,2) CHECK (psp BETWEEN 0.00 AND 100.00), 
    batchId INT, 
    isActive boolean default true,
    primary key (id)
);

INSERT INTO students (name, email, psp, batchId)
VALUES('Na1', 'n@scaler.com', 8, 101);


SELECT name,email as emailAddress FROM Students; 

create table departments ( 
    deptID INT auto_increment
    PRIMARY KEY, deptName VARCHAR(50) NOT NULL
);

create table employees ( 
    employeeID INT AUTO_INCREMENT,
    firstName VARCHAR(50) NOT NULL, 
    lastName VARCHAR(50), 
    deptId INT, 
    PRIMARY KEY (employeeID), 
    FOREIGN KEY (deptID) references departments(deptID) on delete cascade
);

INSERT into departments (deptName) values ("HR"), ("TECH"), ("PRODUCT"), ("MARKETING");

INSERT INTO employees (firstName , lastName, deptID) 
values ("Mohit" , "Sharma" , 1), 
("Abdul" , "Ahad" , 2), 
("Naman", "Bhalla" , 3), 
("Rahul" , "Sharma" , 1);


delete from departments where deptID = 3;

