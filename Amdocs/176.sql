# Write your MySQL query statement below
SELECT
    IFNULL(
      (#select all unique values
        SELECT DISTINCT Salary
       FROM Employee
       #sort in descending order
       ORDER BY Salary DESC
       #offset 1 means skip first record and return remaining records but limit is 1 so return only one record
        LIMIT 1 OFFSET 1),
    NULL) AS SecondHighestSalary
