import java.util.ArrayList;
import java.util.List;


public class Vuelo {
    private String codigo;
    private List<Asiento> asientos;


    public Vuelo(String codigo) {
        this.codigo = codigo;
        this.asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }
    public boolean reservarAsiento(int numeroAsiento) {
        for (Asiento asiento : asientos) {

            if (asiento.getNumero() == numeroAsiento) {

                if (!asiento.isOcupado()) {
                    asiento.ocupar();

                    System.out.println("Reserva confirmada.");
                    System.out.println("Vuelo: " + codigo);
                    System.out.println("Asiento: " + asiento.getNumero());
                    System.out.println("Clase: " + asiento.getClase());

                    return true;
                } else {
                    System.out.println("Rechazo: el asiento ya está ocupado.");
                    return false;
                }
            }
        }

        System.out.println("Rechazo: el asiento no existe.");
        return false;
    }
}
