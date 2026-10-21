public class Gato extends Animal{

    // Atributos
    protected String familia;
    protected String genero;
    protected String especie;

    // Métodos
    // Constructor
    public Gato (String familia, String genero, String especie){
        super("Carnívoro");
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    // Getters
    public String getFamilia() {
        return familia;
    }

    public String getGenero() {
        return genero;
    }

    public String getEspecie() {
        return especie;
    }

    // Setters
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Método maullar()
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato hace: ¡Miau!");
    }
}
