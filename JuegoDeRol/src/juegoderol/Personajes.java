package juegoderol;

public class Personajes {
    String nombre;
    int vida = 100;
    int minPower;
    int maxPower;
    
    public Personajes (String nuevoNombre, int nuevoMinPower, int nuevoMaxPower) {
        this.nombre = nuevoNombre;
        this.minPower = nuevoMinPower;
        this.maxPower = nuevoMaxPower;
    }
    
    public String mostrarVida() {
        String mensaje;
        
        mensaje = this.nombre + "---> VIDA: " + this.vida;
        
        return mensaje;
    }
    
}
