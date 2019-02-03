# Lab 10: Spring Framework

## Introduction

When you are developing any spring based complex application, the size of the xml based configuration file grows unmanageable. It is a standard practice to split the configuration file into multiple small configuration files based on functionality.

## Task

- This Lab helps you to understand how to handle multiple spring bean configurations files, we can achieve this by using <import> tag. Lets take a simple example, you have separated your configurations into two files, one is to manage bean for company name, company creation date, number of employees, and another one is to manage bean for list of all employees. (You need to create one bean each for both of the xml files).
- Write test to print all the beans.