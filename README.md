
# SpringBoot REST API using Spring Boot, Data JPA and MySQL - Monolithic project

## Implementing some use cases for Inventory Management System

### Steps to run project and test API

```
i. download the zip or  clone the repository from Git Hub

ii. import as existing maven project into Eclipse

iii. Maven update 
  Project - Right click - Maven -> Update Projects 

iii. Run MySQL 

iv. create a schema in MySQL database . Schema Name - inventory

v. Ensure below entry in application.properties is available, while running the project first time. This will create the necessary tables in mysql database

	spring.jpa.hibernate.ddl-auto=create

Once tables created, change it to below

	spring.jpa.hibernate.ddl-auto=update

Run the Project  

IMSApplication - Right click - Run As -  Java Application

```

## REST API TESTING WITH POSTMAN USING FOLLOWING ENDPOINTS

```
1. Add supplier API (Will add a supplier into supplier table into inventory database)

Method : POST

URL: 

http://localhost:8080/supplier/add

Add header: Key : Content-Type Va;ie: application/json

Body: Select raw

Add below json content :

	{
       "name": "BCD Suppliers",
       "contactInfo": "11111111",
       "address": "bcd street"
	}
	
Hit Send button

Add another supplier  	

	{
       "name": "XYZ Suppliers",
       "contactInfo": "22222222",
       "address": "xyz street"
	}


2. Get All Suppliers API  (Fetch all suppliers from inventory database)

Method: Get

URL: 

http://localhost:8080/supplier/all


3. Add Product API (Will add a product )

Method: POST

URL: 

http://localhost:8080/product/addOrUpdate

	{
	  
       "itemName": "TV",
       "quantityInStock": 3,
       "price": 15500.00,
       "supplier": {"supplierId": 1}
     }
Note: replace supplierId as available

Add another product 

	 
	 {
       "itemName": "Mobile",
       "quantityInStock": 10,
       "price": 10234.00,
       "supplier": {"supplierId": 2}
     }

Note: replace supplierId as available

3. Update Product API (Will update existing product)

Method: POST

URL: 

http://localhost:8080/product/addOrUpdate

{
       "productId":3,
       "itemName": "TV",
       "quantityInStock": 5,
       "price": 15500.00,
       "supplier": {"supplierId": 1}
 }
 
 Note: replace productId and supplierId as available


4. Get ALl Products API

Method: GET

URL: 

 http://localhost:8080/product/all

 
 ```
