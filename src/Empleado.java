public class Empleado extends Persona {

    private double remuneracion;
    static int id;
    private int empleadoId;


    public Empleado(String nombre,
                    String apellido,
                    String numeroFiscal,
                    String direccion,
                    double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        empleadoId = ++id;


    }


    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion = this.remuneracion + this.remuneracion * porcentaje / 100;


    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "remuneracion= " + remuneracion + '\'' +
                ", empleadoId= " + empleadoId;
    }
}
