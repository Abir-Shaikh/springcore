# 🌱 Spring Core Project

This project demonstrates the basics of **Spring Framework Core**, including:
- XML-based configuration
- Bean creation
- Dependency Injection (DI)
- ApplicationContext usage
- Simple service classes

---

## 📁 Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com.example.springcore/
     │         ├── App.java
     │         ├── Student.java
     │         └── StudentService.java
     └── resources/
          └── config.xml
```

---

## ⚙️ Features

- Spring Beans configured using **XML**
- Setter-based and constructor-based DI
- Lightweight and easy to understand
- Perfect for beginners learning Spring Core

---

## 🛠 Technologies Used

- Java 24
- Spring Framework (Core)
- Maven
- IntelliJ IDEA / VS Code

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/Abir-Shaikh/springcore.git
```

2. Open the project in IntelliJ IDEA.

3. Build the project:

```bash
mvn clean install
```

4. Run the main class:

```bash
java -cp target/classes com.example.springcore.App
```

---

## 📄 Spring XML Configuration (config.xml)

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="student" class="com.example.springcore.Student">
        <property name="name" value="Abir"/>
        <property name="age" value="21"/>
    </bean>

</beans>
```

---

## 🧑‍💻 Main Class Example (App.java)

```java
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
```

---

## 🧑‍🎓 Student Class Example

```java
public class Student {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
```

---

## 🤝 Contributing

Feel free to open issues or submit pull requests.

---
