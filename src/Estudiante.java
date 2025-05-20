public class Estudiante {
    String nombre;
    String matricula;
    String carrera;

    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void datos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Rafael Bautista", "69696969", "Ingeniería en Software");
        estudiante1.datos();
    }
}
