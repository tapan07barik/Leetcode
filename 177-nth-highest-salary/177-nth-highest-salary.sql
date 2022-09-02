CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    RETURN (
        /* Write your T-SQL query statement below. */
        
     
       
      SELECT (
      
        SELECT DISTINCT Salary as 'getNthHighestSalary'
        
        from Employee 
        
        order by salary desc
       
        
        OFFSET @N-1 ROWS 
           FETCH NEXT 1 ROWS ONLY
      )
       
        
    );
END