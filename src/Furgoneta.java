public class Furgoneta extends Vehiculo {

    private static final double SUPLEMENTO = 15.0;

    public Furgoneta(String matricula, double precioDia) {
        super(matricula, precioDia);
    }

    @Override
    public double precioAlquiler(int dias) {
        return dias * getPrecioDia() + SUPLEMENTO;
    }
}
