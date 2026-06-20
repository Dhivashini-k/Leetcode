# Write your MySQL query statement below
SELECT unique_id , name FROM Employees emp1 LEFT JOIN EmployeeUNI emp2 ON emp1.id = emp2.id;