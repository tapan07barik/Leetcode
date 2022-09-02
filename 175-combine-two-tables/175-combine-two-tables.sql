/* Write your T-SQL query statement below */

SELECT p.firstName, p.lastName,
A.city,a.state
FROM Person as p

LEFT JOIN Address as a

ON P.personID=a.personID
