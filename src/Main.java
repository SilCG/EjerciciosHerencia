public class Main {

    public static void main (String[] args){
        Animal animal = new Animal ("Genérico");
        animal.hacerSonido();

        Gato gato = new Gato ("Felidae","Felis","Felis catus");
        gato.hacerSonido();

        //El animal hace un sonido.
        //El animal hace un sonido. - esta segunda fila porque: porque super.hacerSonido() ejecutó primero la versión de Animal.
        //El gato hace: ¡Miau!


        Figura figura = new Figura();
        Rectangulo rectangulo = new Rectangulo(4, 3);
        Circulo circulo = new Circulo(2);

        System.out.println("\nFigura - área: " + figura.calcularArea() + ", perímetro: " + figura.calcularPerimetro());
        System.out.println("Rectangulo - área: " + rectangulo.calcularArea() + ", perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Figura - área: " + circulo.calcularArea() + ", perímetro: " + circulo.calcularPerimetro());

        Empleado empleado = new Empleado("Marcela", "Castro Perez", "Profesora de Ciencias");
        empleado.trabajar();
        System.out.println("Salario: " + empleado.calcularSalario());

        EmpleadoHR hr = new EmpleadoHR("Maria", "Rojas Barahona", "Generalista de HR");
        hr.trabajar();
        hr.contratarEmpleado(empleado);

        // Qué pasa cuando Java lee hr.trabajar()
        //Java hace esto, en orden:
        //
        //1. Mira el objeto hr, que es un EmpleadoHR.
        //2. Busca trabajar() en EmpleadoHR. No la encuentra (no se puso ahí).
        //3. Sube a la clase madre, Empleado, y busca ahí. La encuentra.
        //4. Ejecuta esa versión.
        //5. Y la ejecuta con los datos de hr, así que imprime:
        // Maria Rojas Barahona trabaja como Generalista de HR.

    }
}
