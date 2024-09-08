## Exercise: Upcasting and Downcasting - Employee Hierarchy

#### Objective:

- Practice upcasting and downcasting in Java by creating a program that models an employee hierarchy.

#### Description:

- Create a set of classes representing different types of employees (e.g., Manager, Engineer, Intern) and their characteristics, and then use upcasting and downcasting to access specific features of these employees.

#### Instructions:

#### Employee Hierarchy:

- Create an abstract base class called Employee with common attributes shared by all employees (e.g., name, employeeId, salary).
- Create three subclasses: Manager, Engineer, and Intern, representing specific types of employees.
- Add unique attributes and behaviors to each subclass (e.g., Manager has a teamSize, Engineer has a programmingLanguage, Intern has a durationInWeeks).
- Implement an abstract method in the Employee class called calculateBonus() that calculates and returns the bonus amount for the employee.

#### Upcasting:

- In the main method, create instances of Manager, Engineer, and Intern objects.
- Use upcasting to assign these objects to references of the Employee class.
- Call the calculateBonus() method for each employee to calculate and display their bonus.

#### Downcasting:

- Use downcasting to access the specific attributes and behaviors of Manager, Engineer, and Intern objects.
- For example, if you upcast a Manager object to an Employee reference, downcast it back to a Manager reference and access the teamSize attribute.
