# U2-ejercicio10

### Sistema de Reserva de Vuelos y Validación de Asientos

Este ejercicio consiste en desarrollar un sistema de reservas de vuelos en Java mediante la colaboración entre objetos.

La clase `Asiento` almacena el número, la clase y el estado de ocupación de cada asiento. La clase `Vuelo` administra una colección de asientos y valida su disponibilidad antes de confirmar una reserva. La clase `Pasajero` permite solicitar reservas, mientras que `AgenciaDeViajes` coordina la solicitud entre el pasajero y el vuelo.

El sistema confirma la reserva cuando el asiento existe y está libre, actualizando su estado a ocupado. En caso contrario, informa el rechazo si el asiento ya está ocupado o no existe.

El objetivo es practicar la **comunicación entre objetos**, el uso de colecciones, la validación de reglas de negocio, los métodos y la modificación del estado de los objetos.

##Captura de pantalla
![Ejercicio 10](U2%20ejercicio10.png)
