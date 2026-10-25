
    public class Pasajero {
        private String nombre;
        private String documento;

        public Pasajero(String nombre, String documento) {
            this.nombre = nombre;
            this.documento = documento;
        }

        public String getNombre() {
            return nombre;
        }

        public void solicitarReserva(Vuelo vuelo, int numeroAsiento) {
            System.out.println("Pasajero: " + nombre);
            System.out.println("Solicitando reserva...");

            vuelo.reservarAsiento(numeroAsiento);
        }
    }


