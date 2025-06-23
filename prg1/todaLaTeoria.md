# ☕ JAVA para principiantes

## 📌 Índice
- [Estructura básica de Java](#estructura-básica-de-java)
- [Salida por consola](#salida-por-consola)
- [Variables y tipos de datos](#variables-y-tipos-de-datos)
- [Operadores](#operadores)
- [Entrada por consola](#entrada-por-consola)
- [Condicionales](#condicionales)
- [Bucles o estructuras repetitivas](#bucles-o-estructuras-repetitivas)
- [Arrays y Matrices](#arrays-y-matrices)
- [Números aleatorios](#números-aleatorios)
- [Métodos estáticos](#métodos-estáticos)

---

## 🧱 Estructura básica de Java

```java
public class Clase {
    public static void main(String[] args) {
        // Código aquí
    }
}
```

---

## 💬 Salida por consola

```java
System.out.println("Hola Mundo!");
System.out.println("Mi nombre es: " + variable);
```

---

## 🗃️ Variables y tipos de datos

Una **variable** es un contenedor para almacenar datos.  
Una **constante** es un valor fijo que no cambia (usa `final`).

### 📌 Tipos primitivos:
- `int`: números enteros
- `double`: números con decimales
- `boolean`: `true` o `false`
- `char`: un solo carácter
- `String`: texto (objeto)
- `long`: enteros largos

```java
int edad = 25;
final double PI = 3.14;
```

---

## ➕ Operadores

### Aritméticos
| Operador | Descripción         |
|----------|---------------------|
| `+`      | Suma / concatenación|
| `-`      | Resta               |
| `*`      | Multiplicación      |
| `/`      | División            |
| `%`      | Módulo (resto)      |

### Relacionales
| Operador | Significado         |
|----------|---------------------|
| `==`     | Igual               |
| `!=`     | Distinto            |
| `<`      | Menor               |
| `<=`     | Menor o igual       |
| `>`      | Mayor               |
| `>=`     | Mayor o igual       |

### Lógicos
| Operador | Significado         |
|----------|---------------------|
| `&&`     | Y (ambas verdaderas)|
| `||`     | O (una verdadera)   |
| `!`      | Negación            |

### Ternario
```java
variable = (condicion) ? valor_si_verdadero : valor_si_falso;
```

---

## 📥 Entrada por consola

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

int numero = scanner.nextInt();
String texto = scanner.nextLine();
double decimal = scanner.nextDouble();

scanner.close();
```

---

## 🧭 Condicionales

### if
```java
if (condicion) {
    // Código si se cumple
}
```

### if - else
```java
if (condicion) {
    // Verdadero
} else {
    // Falso
}
```

### if - else if - else
```java
if (cond1) {
    // Código
} else if (cond2) {
    // Otro código
} else {
    // Ninguna se cumplió
}
```

### switch
```java
switch (variable) {
    case valor1:
        // acción
        break;
    case valor2:
        // otra acción
        break;
    default:
        // acción por defecto
}
```

---

## 🔁 Bucles o estructuras repetitivas

### while
```java
while (condicion) {
    // Código mientras sea verdadera
}
```

### do - while
```java
do {
    // Código ejecutado al menos una vez
} while (condicion);
```

### for
```java
for (int i = 0; i < 10; i++) {
    // Código repetido
}
```

### Bucle infinito
Cuidado con este patrón:
```java
while (true) {
    // Nunca termina
}
```

---

## 🗂️ Arrays y Matrices

### Arrays (vectores)
```java
int[] vector = new int[5];
vector[0] = 10;

for (int i = 0; i < vector.length; i++) {
    System.out.println(vector[i]);
}
```

### Matrices (bidimensionales)
```java
int[][] matriz = new int[3][3];
matriz[0][0] = 5;

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.println(matriz[i][j]);
    }
}
```

---

## 🎲 Números aleatorios

Generar un número entero entre `min` y `max`:

```java
int min = 1;
int max = 10;
int aleatorio = (int)(Math.random() * (max - min + 1)) + min;

System.out.println(aleatorio);
```
## Comparar palabras

        while(palabra.eguals("algo"){
            
        }
---

## 🧱 Métodos estáticos

### ¿Qué son?
Funciones dentro de una clase que **no requieren crear un objeto** para ser usadas.

### ¿Por qué usarlos?
- Reutilización de código
- Organización lógica
- No dependen del estado de un objeto

### Declaración y uso:
```java
public class Utilidad {

    public static void saludar() {
        System.out.println("Hola desde un método estático");
    }

    public static void main(String[] args) {
        saludar(); // No necesita crear objeto
    }
}
```

---

### Buenas prácticas
- Cada método debe tener una sola responsabilidad (**cohesión**).
- Los métodos deben estar **organizados lógicamente**.
- Diseñarlos para que sean **independientes del estado**.
- **Reutilizables** y fáciles de **probar**.
- Úsalos como **puente hacia la programación orientada a objetos**.