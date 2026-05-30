package taller18.ejercicio3;

public class Camion implements Conducible, Cargable {

    @Override
    public void conducir() {
        System.out.println("El camion se esta conduciendo por la autopista.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando 10 toneladas de mercancia en el remolque.");
    }
}
