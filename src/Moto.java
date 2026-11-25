public class Moto extends Vehiculo {

    private static final double CASCO_DIA = 2.0;

    public Moto(String matricula, double precioDia) {
        super(matricula, precioDia);
    }

    @Override
    public double precioAlquiler(int dias) {
        return dias * (getPrecioDia() + CASCO_DIA);
    }
}