-- Question 1
-- Products

-- Question 2
SELECT productID, productNAME, UnitPrice
FROM Products;

-- Question 3
SELECT productID, productNAME, UnitPrice
FROM Products
ORDER BY UnitPrice;

-- Question 4
SELECT *
FROM Products
WHERE UnitPrice <= 7.5;

-- Question 5
SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT *
FROM Products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;

-- Question 7
SELECT *
FROM Products
WHERE UnitsInStock = 0 AND UnitsOnOrder >= 1
ORDER BY productName;

-- Question 8
-- Categories 

-- Quesiton 9
SELECT *
FROM Categories;
-- Seafod Id - 8

-- Question 10
SELECT *
FROM Products
WHERE CategoryID = 8;

-- Question 11
SELECT FirstName, LastName
FROM Employees;

-- Question 12
SELECT FirstName, LastName, Title
FROM Employees
WHERE Title LIKE "%manager%";

-- Question 13 (removing duplicates)
SELECT DISTINCT Title 
FROM Employees;

-- Question 14
SELECT FirstName, LastName, Salary
FROM Employees
WHERE Salary BETWEEN 2000 and 2500;

-- Question 15
SELECT * 
FROM Suppliers;

-- Question 16
SELECT *
FROM Products
WHERE SupplierID =4;





