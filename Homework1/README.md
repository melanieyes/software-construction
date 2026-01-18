# Homework 1 — OOP Practice (Student & Course)

## Overview
This homework is about practicing **Object-Oriented Programming (OOP)** basics in Java.

I created 2 classes:
- `Course` — stores course information (id, name, lecture hours, practice hours)
- `Student` — stores student info (name, studentId) and the list of courses the student takes in a semester

Main idea: a student can take **maximum 6 courses per semester**, and we can calculate the **total study hours** for the semester.

---

## Practice 3 — Problem Restatement
In this practice, we need to model a student and the courses they take in a semester using OOP.

- A student named **Minh** has:
  - `name`
  - `studentId`
- In the current semester, Minh takes **5 courses**.
- The university allows a student to register **maximum 6 courses per semester**.
- Each course has:
  - `id`
  - `name`
  - `lectureTotalHour`
  - `practiceTotalHour`

The program should store Minh’s courses and be able to:
- add courses (but not exceed 6)
- calculate the **total hours** Minh studies in the semester
- print the course details in a readable way

---

## What I learned (short)
- How to design classes with **private attributes** and **public methods**
- How to use a **constructor** to initialize objects
- Why we use **getters** instead of accessing fields directly
- How `toString()` helps printing objects nicely
- How to store objects in an **array** and loop through them

---



