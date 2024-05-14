public class Animal {
// Creamos la clase de Animal aplicando atributos, constructores y métodos
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido() {
        return "Grrr";
    }
}