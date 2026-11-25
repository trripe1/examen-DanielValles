public abstract class Vehiculo {

    private final String matricula;
    private final double precioDia;

    public Vehiculo(String matricula, double precioDia) {
        this.matricula = matricula;
        this.precioDia = precioDia;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public abstract double precioAlquiler(int dias);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + matricula;
    }
}
