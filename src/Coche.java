public class Coche extends Vehiculo {

    public Coche(String matricula, double precioDia) {
        super(matricula, precioDia);
    }

    @Override
    public double precioAlquiler(int dias) {
        return dias * getPrecioDia();
    }
}
