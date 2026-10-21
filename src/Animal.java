public class Animal {

    // Atributos
    protected String orden;

    // Métodos
    // Constructor
    public Animal(String orden){
        this.orden = orden;
    }

    // Getters
    public String getOrden() {
        return orden;
    }

    // Setters
    public void setOrden(String orden) {
        this.orden = orden;
    }

    // Método hacer sonido
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}