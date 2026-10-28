-- Write your query below
Select employee_id , 
case 
when employee_id%2!=0 and name not like 'M%' THEN salary 
Else 0
End as bonus
from employees order by employee_id; 
