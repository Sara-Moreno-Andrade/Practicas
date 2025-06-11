# TEORIA PROGRAMACIÓN II
## POO (Programación Orientada a Ojetos):
- Abstracción 
- Encapsulamiento
- Polimorfismo
- Herencia
- UML
## 📋CLASES:
### Atributos:
Características de los elementos de la clase.

## 🛠️MÉTODOS:
- Acciones contenidas en una clase y define su comportamiento.

- Son verbos en infinitivo que representan la acción que harán (minusculaMayuscula).

- Pueden tener valores de entrada (parámetros) y valores de salida (valores de retorno).

- Pueden ser Porcedimientos (no retornan valor) o Funciones (retornan unn valor).


## 🎈OBJETOS:
- Un objeto es una instancia de una clase.
Instanciar: crear un objeto de ese tipo
- Es la representación de un objeto de la vida real.
- Posee un _estado_ (atributos).
- Posee un _comportamiento_ (métodos).
### Instancia: 
Crear un ejemplar real de una clase.

## ✋🏼 CONSTRUCTORES:
- Permiten la cración de objetos.
- Puede recibir parámets o no (vacío).
- Se nombra igual que la clase.
- No devuelve nigún valor.
- this = este parámetro.

## 😶‍🌫️ GETTERS Y SETTERS:
-Antes de los métodos o después, pero siempre después del constructor.
-Métodos especiales que nos permitene extraer los valores de los atributos de una clase.
-Un get(traer) y un set (colocar) por cada atributo.

## 👨🏼‍🍼 HERENCIA:
- Clases que comparten gran parte de sus características.
- Permite reutilizar clases. Crea una nueva clase que extiende la funcionalidad de una clase existentes sin tener que reescribir el código asociado a esta última.
- Nueva clase -> subclase (puede tener atributos y métodos que no esten en la original).
- Clase inicial -> superclase/clase padre.
- Los objetos de la nueva clase _herdan los atributos y métodos de la clase padre_.

        spublic class nombreHijo extends nombrePadre{
            public nombreHijo(paramtros hijo y padre){
                super(parametrosPadre);
                this.parametroHijo= parametroHijo;
            }
        }
## 🗂️ POLIMORFISMO:
- "Muchas formas".
