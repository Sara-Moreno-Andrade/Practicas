Una empresa de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodia y otro por la noche. Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. Por ejemplo:

|           |   Mañana  |  Mediodia |   Noche   | 
|-----------|-----------|-----------|-----------| 
| Rio de Janeiro|120|15|30| 
|Cancun| 65 | 1 | 2 |
|Madrid| 4 | 52 | 7 |
|Roma| 46 | 32 | 16 |
|Milán| 64 | 23 | 11 |
|Iguazú| 61 | 12 | 91 |

I. Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.

II. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la mañana, al mediodia o a la noche) y la cantidad de pasajes que necesita.

III. A partir de la solicitud del usuario, el programa debe controlar si hay cantidad suficiente de asientos para la cantidad de pasajes que se requiere.En caso de que asi sea, se debe mostrar un cartel por pantalla que diga "Su reserva fue realizada con éxito" y se debe descontar del total de asientos los solicitados por el usuario. En caso de no haber más asientos disponibles, se debe infromar otro cartel que diga "disculpe, no se pudo completar su operación dado que no hay asientos disponibles".

Desde la compañia de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se hace por día. Por lo cual, para finalizar las ventas se ingresa la palabra finish.