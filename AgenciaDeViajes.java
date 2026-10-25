
public class AgenciaDeViajes {

    public void gestionarReserva(
            Pasajero pasajero,
            Vuelo vuelo,
            int numeroAsiento) {

        System.out.println("=== Agencia de Viajes ===");

        pasajero.solicitarReserva(vuelo, numeroAsiento);
    }
}
