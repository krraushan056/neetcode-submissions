-- Write your query below
Select name from customers where name not in (Select ct.name from customers as ct right join orders as ot on ot.customer_id=ct.id);
