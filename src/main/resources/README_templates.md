## BraidsTribe application

Braids Tribe application is a web-based application intended to be used for ecommerce purposes by business owner and
customers, to keep track of the orders placed by the customers and also to have the information
available for the Admin to view and to fulfill the order(s) on the promised date and time.

The design of this app is very similar to a general shopping app having products, shopping carts, orders, and customer
information, so it can be modified to be used with any type of product(s).

The purpose of an e-commerce application is to provide a convenient and accessible way for businesses to showcase their 
products or services and for customers to find and purchase what they need.

## Contents


## Daily Progress
- June 19th and 20th (Just getting started had to start over a few times)
    - Added product class
    - Added product Repository
    - Minor edits
    - Added productNotFoundException
    

- June 21st (5% done)
    - Added product service.
    - Added product controller
    - Debugging.
    - Rearranged files into packages according to models.
    - Added productServiceImpl.
    - Completed product model.

- June 22nd
    - Added Cart class
    - Added Cart Repository
    - Edits and debugging

- June 23rd (10% done)
    - Added product.html.
    - Fixed bugs.
    - Mapped cart controller methods.
      


- June 26th 
    - Added index.html
    - fixed product.html


- June 27th (12% done)
    - Added Account.html
    - Made Cart to Product relationship one to many.


- June 28st (15% done)

    - Fixed bugs
    - Added application.properties 
    - Rearranged cart entity
    - Fixed and updated files lots of debugging


- June 29th (20% done)
    - Added User package
    - Lots of debugging app not running.


- June 30th 25% done)
    - Added UserController.
    - Updated README.md file.


- July 3rd (30% done)
    - fixed Pom.xml file
    - rename things to match the requirements
    - Lots of debugging, App not running getting Errors 


- July 4th (35% done)
    - Replaced Pom.xml file
    - App running
    - Added UserNotFoundException


- July 5th (40% done)
    - created Security package
    - Worked on Security models
    - Spring security User 


- July 6th, 7th (45% done)
    - add Spring security login from class example.
    - added Role, security configuration, etc 


- July 9th (50% done)
- Added Users.html
- Edited Cart.html and incorporated Thymeleaf

- July 10th
- Cleaned up CSS
- removes security package to focus on crud in product model


- July 11th
- worked on crud in cart model
- Added Checkout.html

- July 12th
- Controller mapping edits
- Thymeleaf errors 404

- July 13th
- Edited Thymeleaf 
- worked on mapping 

- July 14th
- Database created for BraidsTribe Products
- added About Us Html
- added registration.html

- July 15th
- Added New product html
- brought back security 

- July 16th
- created security roles for user, admin and super admin
- debugging and finishing touches

## User Stories

### Admin

- As an admin, I want to log in with an admin privilege so that I can edit the list of products, update
  the prices/products and perform CRUD.

    - Tasks:
        1. Create a database and a User table containing username, password and privilege.
        2. Login screen asking for username and password.
        3. Check if the username exists in the User table
        4. Check if the password matches the entry in the table
        5. Assign privileges to the current user(s)
        6. If login is successful, show the main screen with options according to login privilege.
   

#### Admin
1. View Quantity Ordered for Each Product
   As an admin, I can easily view the quantity ordered for each braiding hair product(s). This information allows me to identify the popular items and make informed decisions regarding stock management and future orders.
2. Add New Braiding Hair Product
   To expand the product catalog, as an admin, I have the privilege to add new braiding hair products. This feature enables me to specify the product details, such as name, description, price, and available stock.
3. View List of Braiding Hair Products
   As an admin, I can access a comprehensive list of all available products. This list provides an overview of the product catalog and allows me to stay informed about the current inventory.
4. Edit Braiding Hair Product Details
   Admins have the ability to edit the details of any braiding hair product(s). This feature ensures that you can keep the product information up to date, including making changes to the product name, description, price, or any other relevant details.
5. Delete Braiding Hair Product
   In case a braiding hair product is no longer available or has been discontinued, as an admin, you can easily delete the product from the catalog. This action removes the product from the list and ensures accurate representation of the available inventory.
6. As an Admin, I want to have the ability to view and filter orders based on a specific day. This feature helps me identify the orders that need to be prepared and fulfilled by me.
7. Lastly, I want to generate an invoice from the completed order in a PDF format. This invoice will serve as a formal record of the transaction for both the customer and the business.


### User

- As a user/customer, I want to create an account and log in to my account.
    
- As a user or customer of the e-commerce braids shop, I want to be able to add items to my order, specifying the name of the product and the desired quantity.

- Once I have added all the desired items to my cart, I want to proceed to the checkout process, where I can provide my information such as name, shipping address, and payment details.

- Throughout the order process, I want to see the total amount dynamically updated as I add or remove products from my cart. 

