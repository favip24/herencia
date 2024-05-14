public class Herencia {
    public static void main(String[] args) throws Exception {
// Herencia: Permite que una clase (subclase) herede atributos y métodos de otra clase (superclase)

        Animal animal = new Animal("Bestia", 8);
        Gato gato = new Gato("Lanita", 4);
        Perro perro = new Perro("Kratos", 6);

        System.out.println("El animal llamado " + animal.nombre + " hace " + animal.hacerSonido());
        System.out.println("El animal llamado " + gato.nombre + " hace " + gato.hacerSonido());
        System.out.println("El animal llamado " + perro.nombre + " hace " + perro.hacerSonido());
    }
// Tenemos tres instancias distintas, dos de ellas heredan atributos y métodos de una
}