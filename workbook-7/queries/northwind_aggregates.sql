-- Question 1
SELECT COUNT(*)
FROM Suppliers;

-- Question 2
SELECT SUM(Salary) AS total_salary
FROM Employees;

-- Question 3
SELECT MIN(UnitPrice) As cheapest_product
FROM Products;

-- Question 4
SELECT AVG (UnitPrice) As average_price
FROM Products;

-- Question 5

SELECT MAX(UnitPrice) AS most_expensive
FROM Products;

-- Question 6
SELECT SupplierID, COUNT(*) AS number_of_items
FROM Products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(UnitPrice) AS average_price
FROM Products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) AS number_of_items
FROM Products
GROUP BY SupplierID
HAVING COUNT(*) >=5;

-- Question 9
SELECT ProductID, ProductName, (UnitPrice * UnitsInStock) AS inventory_value
FROM Products
ORDER BY inventory_value DESC, ProductName;
