public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    public final int HORAS_TRABAJADAS_DIA = 8;
    public final double PAGO_HORA = 20000;


    // Métodos
    // Constructor
    public Empleado (String nombre, String apellidos, String puesto){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto(){
        return puesto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Método trabajar
    public void trabajar(){
        System.out.println(nombre + " " + apellidos + " trabaja como " + puesto + ".");
    }

    public double calcularSalario(){
        int diasPorSemana = 5;
        int semanasPorMes = 4; // enunciado
        return HORAS_TRABAJADAS_DIA * PAGO_HORA * diasPorSemana * semanasPorMes;

    }
}
