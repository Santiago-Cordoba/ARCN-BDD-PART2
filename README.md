# BDD-Lab

Laboratorio práctico en Java para aplicar la metodología **Behavior-Driven Development (BDD)** mediante la automatización de pruebas web utilizando **Cucumber, Selenium WebDriver, PageFactory, Maven y Java 17+**.

---

# Objetivo

Implementar pruebas automatizadas basadas en comportamiento utilizando **Gherkin** y **Cucumber**, validando diferentes funcionalidades web mediante **Selenium WebDriver** ejecutándose en **modo headless**.

Este laboratorio demuestra cómo estructurar un proyecto BDD profesional con:

* Features escritas en lenguaje natural (Gherkin)
* Step Definitions implementadas en Java
* Automatización con Selenium WebDriver
* Uso del patrón **PageFactory**
* Ejecución automatizada con Maven
* Generación automática de **reportes HTML**

---

# Tecnologías Utilizadas

* Java 17+
* Maven
* Cucumber
* Selenium WebDriver
* PageFactory
* Chrome Headless

---

# Metodología Aplicada: BDD

El desarrollo sigue el flujo clásico de **Behavior-Driven Development**:

1. Definir el comportamiento esperado en **Gherkin (Feature)**
2. Implementar los **Step Definitions en Java**
3. Automatizar la interacción con la UI usando **Selenium WebDriver**
4. Ejecutar los escenarios con **Maven**
5. Validar los resultados mediante **reportes HTML**

---

# Estructura del Proyecto

```
bdd-java
│
├── src
│   ├── test
│   │   ├── java
│   │   │   └── com/eci/myproject
│   │   │       ├── pages
│   │   │       │   ├── GooglePage.java
│   │   │       │   ├── DropdownPage.java
│   │   │       │   └── LoginPage.java
│   │   │       │
│   │   │       └── steps
│   │   │           ├── GoogleSteps.java
│   │   │           ├── DropdownSteps.java
│   │   │           └── LoginSteps.java
│   │   │
│   │   └── resources
│   │       └── features
│   │           ├── google.feature
│   │           ├── dropdown.feature
│   │           └── login.feature
│
└── pom.xml
```

---

# Escenarios Implementados

## 1️⃣ Google Search

```gherkin
Feature: Google Search

  Scenario: Search for a term
    Given I am on the Google search page
    When I search for "GitHub"
    Then I should see "GitHub" in the results
```

---

## 2️⃣ Dropdown Selection

```gherkin
Feature: Dropdown functionality

  Scenario: Select an option from the dropdown
    Given I open the dropdown page
    When I select "Option 1"
    Then "Option 1" should be selected
```

---

## 3️⃣ Login Authentication

```gherkin
Feature: Login functionality

  Scenario: Successful login
    Given I open the login page
    When I enter valid username and password
    And I click the login button
    Then I should see the secure area
```

---

# Cómo ejecutar el laboratorio

Para ejecutar todas las pruebas automatizadas:

```bash
mvn clean test
```

Esto ejecutará todos los escenarios definidos en las **features**.

---

# Reporte de Resultados

Después de ejecutar las pruebas, Maven generará un **reporte HTML** con los resultados.

Ubicación del reporte:

```
target/HtmlReports/report.html
```

Este reporte muestra:

* Escenarios ejecutados
* Escenarios exitosos
* Errores encontrados
* Tiempo de ejecución

---

# Ejemplo de Ejecución

```bash
mvn clean test
```

Salida esperada:

```
Tests run: X
Failures: 0
Errors: 0
BUILD SUCCESS
```

---

# Prueba de su funcionamiento

![image](/workspaces/ARCN-BDD-PART2/images/bdd1.png)

![image](/workspaces/ARCN-BDD-PART2/images/bdd2.png)

---

# Conclusión

Este laboratorio demuestra la implementación de **BDD con Cucumber y Selenium**, utilizando el patrón **PageFactory** para mejorar la organización del código y facilitar el mantenimiento de las pruebas automatizadas.

El enfoque BDD permite que los escenarios de prueba sean **legibles tanto para desarrolladores como para stakeholders**, facilitando la comunicación y la validación del comportamiento esperado del sistema.
