# THP
Taller herramientas de programacion

Instituto de Tecnología ORT
Carrera de Analista de Sistemas
Materia: Algoritmos / Taller 1
TRABAJO PRÁCTICO Nº3
Programación orientada a objetos
Resolvé los siguientes ejercicios
1. Crear una clase llamada Persona. La misma estará compuesta por:
· Atributos privados:
- String nombre
- String apellido
- String dirección
· Métodos públicos: setters y getters para cada atributo, y el método toString().
Codificar la función main(), creando dos objetos Persona p1, Persona p2 con valores en sus atributos.
Deberá utilizar los métodos setters e imprimir por pantalla los valores de los atributos de cada objeto
y mostrarlos por pantalla utilizando toString().
El método toString debe ser igual al siguiente ejemplo:
@Override
public String toString() {
return "[Nombre:" + nombre + ", Apellido:" + apellido + “, Direccion:” + direccion ]";
}
La salida será:
persona1 [Nombre:Diego, Apellido:Diaz, Direccion: Roosevelt 3313]
persona2 [Nombre:Pablo, Apellido:Gomez, Direccion: Virrey del pino 2284]
2. Crear una clase llamada Tarjeta de Credito.
· Atributos privados:
- String numero
- String titular
- double limite
- double disponible
· Métodos públicos: setters y getters para cada atributo, y el método toString().
1
Instituto de Tecnología ORT
Carrera de Analista de Sistemas
Materia: Algoritmos / Taller 1
· Constructor que asigne número, titular y limite. El disponible será igual al límite.
Crear los métodos:
- puedoComprar, método privado que según un monto devuelve true si puede
hacer la compra, o false en caso contrario.
- realizarCompra, método público que dado un monto devuelve un booleano si lo
pudo realizar, actualizando los atributos que corresponda.
- actualizarLimite, método público que recibe el nuevo límite y actualiza a la vez el
disponible. Si el límite es menor al anterior debe decrementar el disponible. Si el
mismo resulta menor a 0, se lo debe poner en 0.
Crear la clase Test para crear un objeto tarjeta y probar los métodos con la siguiente información
- Numero 4145414122221111
- Titular Juan Perez
- Limite 10000
Hacer una compra de 4000
Ver la información con toString
- Debe quedar disponible en 6000
Bajar límite a 3000
Ver la información con toString
- Debe quedar disponible en 0
3. Crear una clase Superhéroe con atributos:
- String nombre
- int fuerza
- int resistencia
- int superpoderes
Tendrán
· Métodos públicos: setters y getters para cada atributo, y el método toString().
· Constructor que asigne todos los datos por parámetro
Crear el método:
- jugar que dado un superhéroe como parámetro, devuelve 1 si ganó, 2 si perdió o
3 si empató. Para triunfar un superhéroe debe ganar en al menos 2 de los 3
ítems.
Realizar una clase Test que contenga el main para probar el correcto funcionamiento de los métodos
de la clase previamente realizada con el siguiente ejemplo.
superHeroe1
- Nombre Batman
- Fuerza 90
- Resistencia 70
- Superpoderes 0
superHeroe2
- Nombre Superman
2
Instituto de Tecnología ORT
Carrera de Analista de Sistemas
Materia: Algoritmos / Taller 1
- Fuerza 95
- Resistencia 60
- Superpoderes 70
Hacer jugar al superheroe2 contra el superheroe1 y mostrar el resultado por pantalla.
Debe mostrar 2(Perdió)
Hacer jugar al superheroe1 contra el superheroe2 y mostrar el resultado por pantalla. Debe mostrar 1(ganó)
Crear más superhéroes y jugar
4. Crear una clase Cafetera con los siguientes atributos:
- capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
- cantidadActual (la cantidad actual de café que hay en la cafetera).
Implementar, al menos, los siguientes métodos:
a) Constructor predeterminado: establece la capacidad máxima en 1000 y la actual en cero
(cafetera vacía).
b) Constructor con la capacidad máxima de la cafetera: inicializa la cantidad actual de café igual
a la capacidad máxima.
c) Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que
la capacidad máxima de la cafetera, la ajustará al máximo.
d) Setters y Getters.
e) llenarCafetera():hace que la cantidad actual sea igual a la capacidad máxima.
f) servirTaza(int): simula la acción de servir una taza con la capacidad indicada por parámetro.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
g) vaciarCafetera(): setea la cantidad de café actual en cero.
h) agregarCafe(int): añade a la cafetera la cantidad de café indicada
Realizar una clase Test que contenga el main para probar el correcto funcionamiento de los métodos
de la clase previamente realizada.
5. Clase una clase Hotel con los siguientes atributos:
- nombre,
- localidad,
- habitaciones.
- habitaciones disponibles.
Implementar los siguientes métodos y constructores:
a) Constructores: vacío y parametrizado completo
b) ocuparHabitaciones, recibe la cantidad de habitaciones a ocupar, devuelve true o false y
ocupa o no las habitaciones según las cantidades.
c) getters, setters y toString
Crear el objeto en una clase Test con los siguientes datos "Hilton", "CABA", 200, 15
y probar todos los métodos.
3
Instituto de Tecnología ORT
Carrera de Analista de Sistemas
Materia: Algoritmos / Taller 1
6. Crear una clase Vuelo con los siguientes atributos:
- origen
- destino
- fecha
- numero
- capacidad
- asientosOcupados
Implementar los siguientes métodos y constructores:
a) Constructores con origen, destino, fecha, número, capacidad
b) reservar , recibe la cantidad de personas que quieren reservar asientos . Actualiza la
cantidad de asientos ocupados, devuelve true o false.
c) getters, setters y toString
Crear el objeto en la clase Test con la siguiente informacion "Aeroparque","Miami",
"01/06/2018",1234,250 , utilizando constructor
Asientos ocupados:15 (con setter)
Probar el metodo reservar (con los casos para que edvuelva true o false)
7. Crear una clase Automovil con los siguientes atributos:
- marca
- modelo
- patente
- capacidadCombustible
- cantidadCombustible
- kmPorLitro(representa cuantos kilometros recorre con un litro de combustible)
Implementar los siguientes métodos y constructores:
a) Constructores: vacío y otro con marca, modelo, patente
b) viajar , recibe la cantidad de kilometros. Actualiza la cantidad de Nafta, devuelve true o false.
c) cargarCombustible, devuelve true o false, recibe la cantidad que se quiere cargar, llama a
verificarCantidad para ver si puede cargar dicha cantidad. si puede actualiza la cantidad de
nafta.
d) verificarCantidad combustible (metodo privado que va a ser llamado por cargrCombustible)
devuelve true o false, recibe la cantidad que se quiere verificar.
e) getters, setters y toString
Cuando se cree el objeto, la información debe enviarse a traves del constructor, la capacidad y la
cantidad de combustible se dará de alta con el setter,
Crear el objeto "Ford","Fiesta", "ABCD123"
Capacidad:40
Cantidad: 20
Kilometros por litro: 10
Probar todos los métodos
4
Instituto de Tecnología ORT
Carrera de Analista de Sistemas
Materia: Algoritmos / Taller 1
8. Crear una clase Gato y una clase Raton
Ambos tienen como atributo energía.
Un gato puede correr mientras le de la energía, descontando un punto de energía por metro corrido.
Lo mismo el ratón pero se le descuentan 2 puntos de energía por cada metro corrido. Es decir un gato
o un ratón corren x cantidad de metros según la energía
implementar un método en Gato que se llame alcanzar y reciba como parámetro un ratón y la
distancia que debe recorrer para alcanzarlo, si lo alcanza devuelve true, caso contrario false.
Ejemplo, un gato con 100 de energía puede correr 100 metros, un ratón con 100 de energía puede
correr 50 metros. O sea que si el ratón está a más de 50 metros del gato y ambos tienen 100 de
energía, no lo va a alcanzar.
Crear un gato y un ratón en una clase Test y jugar
5
