# Employee Management System

This Java program provides functionality to manage employee records using different constructors and accessors/mutators.

## Table of Contents
- [Introduction](#introduction)
- [Usage](#usage)
- [Classes](#classes)
- [Constructors](#constructors)
- [Accessors and Mutators](#accessors-and-mutators)

## Introduction

The **Employee Management System** is a Java program designed to manage employee records. It demonstrates the use of constructors, accessors, and mutators to manipulate employee data.

## Usage

To use this program, follow these steps:

1. Compile the Java files using a Java compiler such as `javac`.
2. Run the compiled `Employee` class file using `java Employee`.

The program will display the details of three employees, showcasing different constructor overloads and accessors/mutators.

## Classes

### `Employee`
- This class contains the main method and demonstrates the usage of the `EmployeeDetails` class.

### `EmployeeDetails`
- This class defines the attributes and methods related to employee details.
- It includes constructors for different parameter combinations, along with accessors and mutators.

## Constructors

The `EmployeeDetails` class provides three constructors:

1. **Four-Parameter Constructor**
   - Initializes the name, ID, department, and position of the employee.
   - Parameters: `empName`, `empId`, `empDept`, `empPosition`.

2. **Two-Parameter Constructor**
   - Initializes the name and ID of the employee, leaving department and position empty.
   - Parameters: `empName`, `empId`.

3. **Non-Parameterized Constructor**
   - Initializes all attributes to default values.
   - No parameters.

## Accessors and Mutators

- Accessors (`getName()`, `getIdNumber()`, `getDepartment()`, `getPosition()`) retrieve the values of private attributes.
- Mutators (`setName()`, `setIdNumber()`, `setDepartment()`, `setPosition()`) set the values of private attributes.