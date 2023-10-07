![image](https://github.com/Johann-George/Health_app/assets/103820529/6a699cfc-df6c-4d05-9bca-8d8db0d97187)
<br>
**Code Purpose**: This code calculates Body Mass Index (BMI), provides nutrition-related information, and stores user data in a MySQL database.

**BMI Calculation**: BMI is calculated using the formula BMI = weight (kg) / (height (m) * height (m)). The code first parses the input values and then applies this formula to calculate BMI.

**Gender-Based Calculations**: The code differentiates between male (g1 == 0) and female (g1 == 1) users. For males, it calculates BMR (Basal Metabolic Rate) and calorie intake using the Mifflin-St Jeor equation, while for females, it uses a similar equation adjusted for gender.

**Database Connection**: The code connects to a MySQL database.

**Database Insertion**: User data, including the username, date, time, height, and weight, is inserted into the "bmidetails" table in the MySQL database using SQL.

**Error Handling**: The code includes error handling to deal with exceptions. When invalid input is detected or an error occurs, it changes the text color to red and displays an error message on the user interface. Additionally, it prints error information to the console for debugging.

**Dependencies**: This code relies on the JDBC library for Java to establish a connection to the MySQL database. 

**Code Organization**: The code is organized in a try-catch block, with sections for BMI calculation, gender-based calculations, database connection, and error handling.

**Usage**: To use this code, you need to provide valid height and weight values as input. It calculates BMI, displays it on the user interface, and stores user data in the MySQL database.
