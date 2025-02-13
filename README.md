# Code Smells

Code smells are indicators of deeper problems in a software system. While they are not necessarily bugs, they make the code harder to maintain, understand, and extend. Below are some of the most common code smells categorized based on their impact.
In this repository you'll find some examples of code smells, find them.

---

## 🏋️ Bloaters
Bloaters are code, methods, and classes that have grown excessively large, making them difficult to work with. They often accumulate over time as the program evolves.

### 🔹 Long Method
Methods that contain too many lines of code, making them difficult to understand and maintain.
**Solution:** Extract methods to break the functionality into smaller, reusable units.

### 🔹 Large Class
Classes that try to do too much by having too many responsibilities.
**Solution:** Apply the **Single Responsibility Principle (SRP)** and break the class into smaller, more focused classes.

### 🔹 Primitive Obsession
Overuse of primitive data types instead of small objects for simple tasks (e.g., using strings instead of specific classes).
**Solution:** Replace primitives with appropriate value objects or domain-specific types.

### 🔹 Long Parameter List
Methods that require too many parameters, making them hard to read and modify.
**Solution:** Use parameter objects or encapsulate data in classes.

### 🔹 Data Clumps
Groups of variables that frequently appear together in different parts of the code.
**Solution:** Extract them into their own class to encapsulate related data.

---

## 🎭 Object-Orientation Abusers
These smells arise from incorrect or incomplete application of Object-Oriented Programming (OOP) principles.

### 🔹 Alternative Classes with Different Interfaces
Two classes that perform similar functions but have different method names, making code harder to integrate.
**Solution:** Unify their interfaces through refactoring or an abstraction.

### 🔹 Refused Bequest
A subclass that does not fully use its inherited behavior, making inheritance ineffective.
**Solution:** Consider using **composition** instead of inheritance.

### 🔹 Switch Statements
Frequent `switch` or `if-else` statements that handle multiple conditions, leading to rigid and hard-to-maintain code.
**Solution:** Replace with **polymorphism** by using classes and methods.

### 🔹 Temporary Field
Fields that are only used in some cases, making the class unclear.
**Solution:** Move the field to a separate object or create methods that only instantiate it when needed.

---

## 🚧 Change Preventers
These smells make modifications difficult, as changes in one place require multiple modifications elsewhere.

### 🔹 Divergent Change
When a class has to be changed in many different ways for different reasons.
**Solution:** Apply the **Single Responsibility Principle (SRP)** and separate concerns into different classes.

### 🔹 Parallel Inheritance Hierarchies
When adding a new subclass in one hierarchy requires adding a corresponding subclass in another.
**Solution:** Merge hierarchies where possible or use composition instead.

### 🔹 Shotgun Surgery
A change in one class requires multiple small changes in different places.
**Solution:** Consolidate related behavior in a single class.

---

## 🗑️ Dispensables
Code that is unnecessary and removing it improves readability and maintainability.

### 🔹 Comments
Excessive comments explaining **what** the code does instead of writing self-explanatory code.
**Solution:** Use meaningful variable and method names to make the code self-documenting.

### 🔹 Duplicate Code
Blocks of identical or similar code appearing in multiple places.
**Solution:** Extract duplicate logic into reusable methods or classes.

### 🔹 Data Class
A class that only contains fields with getters and setters without behavior.
**Solution:** Add meaningful behavior to the class or replace it with a simpler data structure.

### 🔹 Dead Code
Code that is never executed but remains in the codebase.
**Solution:** Remove it to keep the codebase clean.

### 🔹 Lazy Class
A class that does very little work and doesn’t justify its existence.
**Solution:** Merge it with another class or remove it.

### 🔹 Speculative Generality
Code designed for scenarios that do not yet exist, making it complex and unnecessary.
**Solution:** Remove unused abstractions and implement functionality as needed.

---

## 🔗 Couplers
These smells create excessive dependencies between classes, making the system rigid and difficult to modify.

### 🔹 Feature Envy
A method that accesses the data of another class more than its own.
**Solution:** Move the method to the class it is closely related to.

### 🔹 Inappropriate Intimacy
Two classes that are too tightly coupled, relying on each other's internals.
**Solution:** Reduce coupling by refactoring and applying **encapsulation**.

### 🔹 Incomplete Library Class
A library class that doesn’t provide necessary functionality, forcing users to write workarounds.
**Solution:** Extend the class properly or use **adapter patterns**.

### 🔹 Message Chains
A long chain of method calls to access data.
**Solution:** Apply the **Law of Demeter** by restructuring interactions between objects.

### 🔹 Middle Man
A class that delegates too much responsibility to other classes without adding value.
**Solution:** Remove the middleman and have the original class interact directly.

---

## 📌 Conclusion
Code smells are not bugs, but they indicate deeper design problems. By identifying and refactoring these smells, you can create cleaner, more maintainable, and scalable code.

🛠️ **Best Practices to Avoid Code Smells:**
- Follow **SOLID principles**
- Use **design patterns** appropriately
- Write **self-explanatory code**
- Apply **encapsulation and modularization**
- Keep **methods and classes small and focused**

🚀 *Keep refactoring, keep improving!*

