public class Rectangulo extends Figura{

    // Atributos
    private double base;
    private double altura;

    // Métodos
    // Constructor
    public Rectangulo (double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return (base + altura) * 2;
    }

    // toString()
    @Override
    public String toString(){
        return "La base del rectangulo es: " + base + " y su altura: " + altura + ".";
    }

}
