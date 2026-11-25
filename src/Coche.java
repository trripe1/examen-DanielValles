public class Coche extends Vehiculo {

    public Coche(String matricula, double precioDia) {
        super(matricula, precioDia);
    }

    @Override
    public double precioAlquiler(int dias) {
        double precio = dias * getPrecioDia();
        if (dias >= 7 {
            precio = precio * 0.9;
        }
        return precio;
    }
}
