import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Alquiler de vehículos v2.0 - Oficina Xàbia");

        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Coche("1234ABC", 40));
        flota.add(new Furgoneta("5678DEF", 60));
        flota.add(new Moto("9012GHI", 25));

        int dias = 3;
        double total = 0;
        for (Vehiculo v : flota) {
            double precio = v.precioAlquiler(dias);
            System.out.printf("%s: %.2f €%n", v, precio);
            total += precio;
        }
        System.out.printf("Total por %d días: %.2f €%n", dias, total);
    }
}
