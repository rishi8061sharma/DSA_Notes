use sakila; 

Find rental_duration which is rental_duration of more than 200 movies

SELECT rental_duration, count(*) as movie_count
from film
Group by rental_duration
having movie_count > 200

-- List the customers who have made at least 30 rentals, 
-- and for each of these customers, display their customer ID, name 
-- and the count of rentals they've made

SELECT customer.customer_id, customer.first_name, COUNT(*) as cont
FROM rental 
JOIN customer 
	on customer.customer_id = rental.customer_id 
GROUP BY customer.customer_id
HAVING cont >= 30

Retrieve the total revenue earned by each film category, 
but only include categories where the total revenue is greater than $1,000. 
Order the results by revenue in descending order.


SELECT 
	c.name, 
    SUM(p.amount) as revenue 
FROM payment p 
JOIN rental r 
	ON p.rental_id = r.rental_id 
JOIN inventory i 
	ON r.inventory_id = i.inventory_id 
JOIN film f 
	ON f.film_id = i.film_id 
JOIN film_category fc 
	ON f.film_id = fc.film_id 
JOIN category c 
	ON fc.category_id = c.category_id 
GROUP BY c.name
HAVING SUM(p.amount) > 1000
ORDER BY revenue DESC




