# ✋🏼 JAVA para principiantes ✋🏼
## Main:

        public class Clase {
            public static void main(String[] args) {
            }
        }

Escribir texto:

        System.out.println("Hola Mundo!");

Escribir texto y variables (concatenación):

        System.out.println("Mi nombre es:" + variable);


## Variables y Constantes:

- *Una variable* es un nombre que se asocia con una porción de la memoria de la computadorea, en la que s eguarda un valor determinado.
- *Las constantes* son valores que se mantienen siempre de igual manera y que no dependen de una asginación para obtener el mismo.

## Tipos de datos:

Definen que puede almacenarse dentro de una variable y los limites de lo que allí se almacena.
Son:

- Entero: int 
- Decimales: double
- Booleanos(T o F): boolean
- Caracteres: char
- Cadena de Caracteres: String
- Entero Largo: long


¿Cómo se declara?:  

        tipodedato + nombre;

## Operadores Aritméticos:

Un operador es un símbolo especial que indica que se hace entre una o más varibles.

Tipos:
- Aritméticos (+, -, *, /).
- Relacionales(==, <, >, <=, >=, !=).
- Condicionales(&&, ||, !).

## Condicional If (si):

Una extructura para decidir entre dos opciones.
Si la condición se cumple o no se realiza una cosa u otra.

## Condicional If-else (si + sino):
Es la extensión del If. Significa "de lo contrario" y permite la ejecucción de un bloque de código si la condición del if es falsa.
## Condicional If-else + if-else / Condicional múltiple:
Se utilizan cuando se necesitan anidar varias condiciones if si no se cumple la primera.
Consiste realizar una primera evaluación de una condición y asi sucesivamente las veces necesarias.
## Estructura Switch:
Permite múltiples caminos a partir de la evaluación de una sola expresión/condición.

La expresión puede ser una variable o cualquier otro tipo, siempre y cuando se evalúe un valor simple.

La  construcción se ejecuta medainte la evaluación de la condición y el conjunto de sentendcias case. Cada case es una posible respuesta a ala evaluación de esa condición, si el valor que se busca coincide con alguna, se ejecuta el mismo hasta hacer break o hasta el final del Switch.


        switch (variableAEvaluar){
            case valorVariable: accion ;
            break;

            case valorVariable: accion;
            break;

            default: accion no valida;
            break;
        }

## Operador ternario:
El operador ternario se utiliza para tomar decisiones simples en una sola línea de código.

Permite tomar decisiones basadas en una condición y asiganr un valor a una variables o expresión en función de si la condición es verdadera o falsa.

                variable = (condicion) ? valor_si_verdadero : valor_se_falso;

## ➰ Estructuras repetitivas:
Nos permiten ejecutar cierto bloque de código por una determianda cantidada de veces. Esta repetición se conoce como bucle.
Hay dos tipos de bucles:

- Controlados por un contador.
- Controlados por un centinela.

###  - Bucle While:
Permite ejecutar un bloque de código en forma repetetitiva "mientras" se cumpla una determinada condición.
Si la condición se evalúa SIEMPRE al inicio.
Si la condición es válida, ingresa al bucle y ejecuta el código.
Cuando deja decumplirse, el programa sale del bucle y continúa con el resto.

### - Bucle infinito:
Un bucle infinito se produce cuando por algún motivo el programa entra en bucle pero el mismo no tienen una condición de salida.
Esto puede suceder tanto en los bucles controlados por contador como por centinela.
Se llama bucle infinito porque, al no haber una condición, el bucle continúa ejecutandose sin fin.

### - Estructura for:
Se caracteriza por estar controlada por un contador. Realiza un bucle de una determinada cantidad de veces. Se lo puede considerar un bucle controlado por contador; sin embargo posee su variable cpntadoraa propia.
Compuesto por:
- Inicialización de la varibale (utilizada en ella).
- Condición de fin del ciclo (evaluada en cada repetición).
- Modificación de la variable (al final).

                for (inicialización ; condicion; modificacion){
                        sentencia;
                }

## ☕ Arrays:
Los arreglos (Arrays) son un conjunto de datos que se almacenan en memoria de manera contigua con el mismo nombre, pero con diferentes índices para diferenciar cada uno de ellos.
Los arreglos son estructuras fijas que se declaran y que mantienen su tamaño durante toda la ejecución del programa.
Cada arreglo puede ser de un tipo determinado de datos y puede almacenar solo valores de este tipo.
| Posición 0 | Posición 1 | Posición 2 | Posiciones totales=3
|------------|------------|------------|-----------|
| Valor 1    | Valor 2    | Valor 3    | Valores   |

Tipos de arreglos:
- *Unidimensionales (Vectores):* Poseen solamente filas o columnas.
- *Bidimensionales (Matrices):* Comprenden tablas de valores, elemento con fila-columna.

#### - Vectores :

Declaración vector:

        int vector[] = new int [numeroCasillas];

Asignacion de valor:

        vector [numeroCasilla] = valor;

Recorrido y Carga:

        for (int i = 0; i < vector.length ; i++){
            
        }

#### -Matrices : 

Declaración Matrices:

        int matriz [][] = new int [numeroFila][numeroColumna];

Asignación Vlaor:

        matriz[numeroFila][numeroColumna] = valor;

Recorrido :

        for (int i = 0; i < matriz.length ; i++){
            for (int j = 0; j < matriz.length ; j++){
            
            }
        }

## Número aleatorio:

        int min = 1;
        int max = 10;
        int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println(numeroAleatorio); // Número entre 1 y 10
