public class Gato extends Animal{  
// Con EXTENS especificamos que GATO hereda atributos y métodos de ANIMAL
    public Gato(String nombre, int edad) {
        super(nombre, edad); 
// Con SUPER estamos asignando la información heredada
    }
    @Override
    public String hacerSonido() {
        return "Miau"; // En vez de "Grrr" ejecutará "Miau"
    } 
/* @Override: se utiliza para indicar que un método en una subclase está sobrescribiendo(reemplazando) un método de la superclase */

/* Decoradores: Son anotaciones (metadatos) que se pueden agregar al código fuente
y proporcionan información adicional sobre cómo debe procesarse ese código */
}