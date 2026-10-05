# Day-01: Employee Management System

## Project Description

An in-memory Java CLI/console application for managing employee records. It uses Core Java and runs in a terminal; it is not a web application.

## Features

- Add employees and prevent duplicate IDs
- Update employee name, department, and salary by ID
- Delete employees by ID
- Search and display an employee by ID
- List all employees, with a message when the list is empty
- Find the employee with the highest salary
- Calculate the average salary
- Filter by department with case-insensitive matching
- Exit through the application menu
- Retry basic invalid input

## Technologies Used

- Java Core
- `ArrayList` for in-memory employee records
- `Scanner` for console input

## Project Structure

```text
Day-01/
├── exercises/
├── employee-management/
│   ├── Employee.java
│   └── EmployeeManagement.java
├── README.md
└── .gitignore
```

## How to Compile

Open a terminal in the `employee-management` folder and run:

```text
javac Employee.java EmployeeManagement.java
```

## How to Run

From the same folder, run:

```text
java EmployeeManagement
```

## Example Usage

Select `1. Add Employee` and enter an ID, name, department, and salary. Add more employees, then select `5. List Employees`, `6. Highest Salary`, or `7. Average Salary`. Select `8. Department Filter` and enter a department such as `engineering` to match employees in `Engineering`. Use options `2`, `3`, and `4` to update, delete, and search by ID. Select `9. Exit` to close the program.

## Author

Sakshi