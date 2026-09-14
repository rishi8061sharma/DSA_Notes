use sakila;

SELECT rental_rate from FILM;

SELECT distinct rental_rate from FILM;

SELECT distinct rating, release_year from FILM;

SELECT rating, distinct release_year from FILM;

ROUND(number, decimal)

SELECT ROUND(1234.456789, 2);

SELECT round(rental_rate, 1) from FILM;

WHERE 

SELECT * from FILM 
where NOT rating = 'PG-13' 
OR release_year = '2006';


SELECT * FROM FILM where rating = 'PG-13' OR release_year = '2006' AND rental_rate = 0.99;

-- >, <, >=, <=, !=, <> (!=)

SELECT * from FILM 
where  rating != 'PG-13'; 


SELECT * from film where rating NOT IN ('PG-13', 'R');

select * from film order by title desc, description desc;

select Distinct rating from film order by rating;



-- answer[] 
-- for each row in the film: 
-- 	if row.matches(conditions in the where clause)
-- 		answer.add(row)

LIKE 
% _
% match any number of characters (>=0 occurrence of any set of chars)
_ match exactly 1 char (any char)

cat% will match cat, caterpillar, wildcat X
%cat will match cat, caterpillar X, wildcat
%cat% will match cat, caterpillar, wildcat, wildcatwild
_at will match cat, caterpillar X, wilcat X, bat, hat
c_t will match cat, cot, cut, wildcat X

SELECT * FROM Film where title LIKE '%Academy%';


IS NULL
Select Distinct release_year from film 
SELECT NULL = NULL 
where release_year = NULL;

Select * from film  
where release_year IS NOT NULL;
        
LIMIT 

SELECT * from film LIMIT 10 OFFSET 10; 

SELECT * FROM film ORDER BY rental_rate DESC LIMIT 10; 

1234567891011

UPDATE table_name SET coumn_name = value where conditions; 

UPDATE film SET title = 'test' 
where film_id = 1; 
SELECT * from film where film_id = 1;

Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

DELETE from film where film_id = 1; 


