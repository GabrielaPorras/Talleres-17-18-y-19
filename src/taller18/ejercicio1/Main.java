package taller18.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Reparacion miTecnico = new Tecnico();
        Limpieza miPersonal = new PersonalLimpieza();

        System.out.println("--- Iniciando labores diarias ---");
        miTecnico.reparar();
        miPersonal.limpiar();
    }
}
