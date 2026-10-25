public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("AB123");
        vuelo.agregarAsiento(new Asiento(1, "Primera Clase"));
        vuelo.agregarAsiento(new Asiento(2, "Economica"));
        vuelo.agregarAsiento(new Asiento(3, "Economica"));

        Pasajero pasajero = new Pasajero("Gabriel Morales", "12345678");
        AgenciaDeViajes agencia = new AgenciaDeViajes();

        System.out.println("=== Reserva 1 ===");
        agencia.gestionarReserva(pasajero, vuelo, 2);

        System.out.println();
        System.out.println("=== Reserva 2 (mismo asiento) ===");
        agencia.gestionarReserva(pasajero, vuelo, 2);

        System.out.println();
        System.out.println("=== Reserva 3 (asiento inexistente) ===");
        agencia.gestionarReserva(pasajero, vuelo, 9);
    }
}
