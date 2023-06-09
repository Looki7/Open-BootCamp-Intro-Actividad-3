
// Actividad 3


/* Para practicar la encapsulación:

    Crear clase Persona.

    Crear variables las privadas edad, nombre y telefono de la clase Persona.

    Crear gets y sets de cada propiedad.

    Crear un objeto persona en el main.

    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por
    consola.
 */


public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad (20);
        persona.setNombre("Antonio Machado");
        persona.setTelefono ("654398760");

        System.out.println ("Edad: " + persona.getEdad());
        System.out.println ("Nombre: " + persona.getNombre());
        System.out.println ("Teléfono: " + persona.getTelefono());

        }

public static class Persona {

    private int edad;
    private String nombre, telefono;

    public int getEdad() {
         return edad;
    }

    public void setEdad(int edad) {
            this.edad = edad;

    }

    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

}