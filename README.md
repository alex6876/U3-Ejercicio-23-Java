Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Cuentas Bancarias (Herencia, Sobrescritura y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🏦 Simulación de Cuentas Bancarias (Herencia y Sobrescritura en Java)

Este proyecto es una aplicación en Java que modela un sistema financiero bancario, implementando una jerarquía de cuentas para gestionar productos especializados como cajas de ahorro (con generación de intereses) y cuentas corrientes (con límites de sobregiro). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores mediante `super`, la sobrescritura de métodos polimórficos (`@Override`) y la validación de operaciones financieras en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general y sus respectivas subclases especializadas, acompañadas por un punto de ejecución:

* **`CuentaBancaria`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier cuenta financiera.
* **Atributos protegidos (`protected`)**: `numeroCuenta`, `saldo` y `titular`, permitiendo que las clases hijas accedan directamente a la información esencial de la cuenta.
* **Constructor**: Inicializa los datos comunes de la cuenta bancaria.
* **Métodos operativos**:
* `depositar(double monto)`: Valida que el monto sea positivo y lo suma al saldo actual de la cuenta.
* `extraer(double monto)`: Comprueba que el monto sea positivo y que el saldo sea suficiente antes de descontar los fondos.
* `mostrarInformacion()`: Imprime de forma estructurada los datos del titular, número de cuenta y saldo vigente.




* **`CajaAhorro`**: Extiende de `CuentaBancaria` para modelar cuentas de ahorro orientadas a la acumulación y rendimiento de capital.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados.
* **Método específico**: `aplicarIntereses(double porcentaje)` para calcular y sumar rendimientos financieros basados en el saldo actual.


* **`CuentaCorriente`**: Extiende de `CuentaBancaria` para modelar cuentas que permiten extracciones por encima del saldo disponible mediante un límite de sobregiro.
* **Atributo privado (`private`)**: `limiteSobregiro`.
* **Constructor**: Utiliza `super(...)` y asigna el tope de sobregiro autorizado.
* **Sobrescritura (`@Override`)**: Modifica el comportamiento de `extraer(double monto)` para permitir retiros utilizando tanto el saldo real como la línea de sobregiro disponible.


* **`Main`**: Punto de entrada del programa. Instancia una caja de ahorro y una cuenta corriente, ejecuta operaciones de depósito, aplicación de intereses, extracciones válidas e inválidas (superando los límites de sobregiro), y muestra por consola el estado y los saldos finales de ambas cuentas.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización de Comportamientos Financieros:** Las operaciones básicas de depósito y visualización de información se centralizan en la superclase, evitando duplicar código en los distintos tipos de cuentas.
2. **Polimorfismo en las Extracciones:** La clase `CuentaCorriente` sobrescribe el método de extracción para incorporar la regla de negocio del sobregiro, ampliando la capacidad de retiro de forma segura y controlada.
3. **Validación Defensiva de Montos:** Todas las operaciones monetarias verifican estrictamente que los valores operados sean positivos y que existan los fondos o márgenes de crédito suficientes antes de alterar el saldo.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== CAJA DE AHORRO ===
Depósito realizado: $20000.0
Intereses agregados: $2400.0
Extracción realizada: $30000.0

=== CUENTA CORRIENTE ===
Depósito realizado: $10000.0
Extracción realizada: $80000.0
Se superó el límite de sobregiro.

=== SALDOS FINALES ===
Titular: Juan
Número de cuenta: CA001
Saldo: $92400.0

Titular: Pedro
Número de cuenta: CC001
Saldo: $-20000.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Herencia y Especialización:** Modelado de productos financieros mediante una jerarquía robusta donde `CajaAhorro` y `CuentaCorriente` heredan de `CuentaBancaria`.
* **Sobrescritura de Métodos (`@Override`):** Adaptación del comportamiento del método `extraer()` en la cuenta corriente para contemplar líneas de crédito adicionales.
* **Diseño Modular y Cohesión:** Clara separación entre la lógica del dominio financiero y la ejecución de casos de prueba simulados en el cliente (`Main`).
