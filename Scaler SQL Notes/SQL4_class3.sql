use sakila; 

Let's take an example of this on the Sakila database. 
Let's say for every film, we want to print its name and the language. 


SELECT film.title, language.name
FROM film 
JOIN language 
ON film.language_id = language.language_id


Display the first_name, last_name, 
and email of the customers who have ever rented a movie. 
Also, bring the film title and the date of rent.

Customer
Rental 
Film 

Customer -> Rental -> Inventory -> Film 


Customer has come to video parlor 
He has selected a CD (Inventory) of a movie 
He has asked the operator to create receipt (Rental Receipt)


SELECT 
	*
FROM Customer c
JOIN Rental r 
	on c.customer_id = r.customer_id 
JOIN inventory i 
	on r.inventory_id = i.inventory_id
JOIN film f 
	on i.film_id = f.film_id


-- List all customers from the city "London" who have never made any payments.
-- Display customer names (first and last), email, and city name. 
-- Sort alphabetically by the customer's last name.


SELECT * 
FROM Customer c
LEFT JOIN payment p 
	on p.customer_id = c.customer_id
where p.payment_id is NULL;


SELECT 
	c.first_name,
    c.last_name,
    c.email,
    ct.city
FROM customer c 
JOIN address a 
	on c.address_id = a.address_id
JOIN city ct
	on ct.city_id = a.city_id 
LEFT JOIN payment p 
	on p.customer_id = c.customer_id
WHERE p.payment_id is null 
ORDER BY c.last_name, c.first_name;

Identify all films that are currently not rented out 
from Store 1 (store_id = 1). 
Display film title, film category, and store ID clearly. 
Sort results alphabetically by film title.

FILM 
RENTAL
INVENTORY
STORE
FILM CATEGORY


SELECT 
	f.title, 
    c.name, 
    i.store_id
FROM film f 
JOIN film_category fc 
	on fc.film_id = f.film_id
JOIN category c 
	on fc.category_id = c.category_id
JOIN inventory i
	on i.film_id = f.film_id 
LEFT JOIN rental r 
	on r.inventory_id = i.inventory_id
WHERE r.rental_id is null
ORDER BY f.title ASC; 

Films with Same Release Year and Rating 
List pairs of distinct films released in the same year 
that share the same rating. 
Each pair of films should appear only once. 
Display clearly as Film1_Title, Film2_Title, Release_Year, Rating. 
Sort by release year, then alphabetically by film titles.


SELECT DISTINCT 
	f1.title,
    f2.title,
    f1.release_year,
    f1.rating
FROM film f1 
JOIN film f2
	on f1.title < f2.title 
    AND f1.release_year = f2.release_year 
    AND f1.rating = f2.rating
    
    
    
ORDER BY 
	f1.release_year, 
    f1.title, 
    f2.title




SELECT * 
FROM inventory i
LEFT JOIN rental r 
	on r.inventory_id = i.inventory_id
WHERE r.rental_id is null



HOME WORK 

Find pairs of different customers from the same city who have rented the same film at least once. 
Clearly show the customer names (first and last), city name, and the common film title. 
Ensure each customer pair appears only once per film, sorted by city, film title, then customer names.

