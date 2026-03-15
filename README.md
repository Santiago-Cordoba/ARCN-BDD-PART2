# BDD-Lab

Laboratorio práctico en Java para aplicar la metodología **Behavior-Driven Development (BDD)** mediante la automatización de un escenario de búsqueda en Google utilizando **Cucumber, Selenium WebDriver, Maven y Java 17+**.

---

##  Objetivo

Implementar pruebas automatizadas basadas en comportamiento usando **Gherkin** y Cucumber, validando la funcionalidad de búsqueda en Google mediante Selenium en modo headless.

El laboratorio demuestra cómo estructurar un proyecto BDD profesional con:

- Features en lenguaje natural  
- Step Definitions en Java  
- Ejecución con Maven  
- Generación automática de reporte HTML  

---

##  Metodología Aplicada: BDD

1.  Escribir el comportamiento en lenguaje Gherkin (Feature).  
2.  Implementar los Step Definitions en Java.  
3.  Ejecutar los escenarios con Maven.  
4.  Validar resultados mediante reporte HTML.  

---

##  Escenario Implementado

```gherkin
Feature: Google Search

  Scenario: Search for a term
    Given I am on the Google search page
    When I search for "GitHub"
    Then I should see "GitHub" in the results
```
--- 

## Como ejecutarlo

```javac
mvn clean test
```
## Prueba de su funcionamiento

<img width="444" height="67" alt="image" src="https://github.com/user-attachments/assets/b44cd734-0b05-4703-95f3-76225cb1dcad" />

<img width="1865" height="431" alt="image" src="https://github.com/user-attachments/assets/dc764824-63c6-4ef4-8416-adf88f766746" />

