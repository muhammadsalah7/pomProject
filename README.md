# 🧪 Page Object Model Practice with Selenium & TestNG

This project is a practice implementation of the **Page Object Model (POM)** design pattern using **Selenium WebDriver** and **TestNG** for automated UI testing. The tests are written for the demo e-commerce website [saucedemo.com](https://www.saucedemo.com/).

---

## 🚀 Project Overview

The project focuses on:

- Practicing test automation using **Selenium** and **TestNG**
- Structuring code with **Page Object Model** for maintainability and readability
- Validating different user login scenarios
- Testing cart functionality

---

## ✅ Features Tested

### 🔐 Login Page

- ✅ Login with `standard_user` (success)
- ❌ Login with `locked_out_user` (expected failure)

### 🛍️ Products Page

- ✅ Verify page load after successful login
- ✅ Add item to cart

## 🛠️ Tools & Technologies

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

## 🔑 Test Users

| Username         | Password      | Description              |
|------------------|---------------|--------------------------|
| `standard_user`   | `secret_sauce` | Valid login              |
| `locked_out_user` | `secret_sauce` | Login should be blocked  |

