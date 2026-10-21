public class EmpleadoHR extends Empleado{

    // Atributos

    // Métodos
    // Constructor
    public EmpleadoHR(String nombre, String apellidos, String puesto){ // no se puede inventar, se tienen que recibir
    super (nombre, apellidos, puesto);
    }

    // Método trabajar
    public void contratarEmpleado(Empleado empleado){
        System.out.println(nombre + " " + apellidos + " contrata a " + empleado.getNombre() + " " + empleado.getApellidos() + " en el puesto de " + empleado.getPuesto() + ".");
    }


}
