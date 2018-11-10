package juegoderolv3;

import java.util.Random;

public class Personaje {
    //ATRIBUTO VARIABLE
    String nombre;
    String clase;
    //ATRIBUTO CONSTANTE
    private int vida = 100;
    private int energia = 40;
    private int minPower = 5;
    private int maxPower = 15;
    private boolean defensa = false;
    //CONSTRUCTORES
    public Personaje (String nombre, String clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.energia = energia;
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.defensa = defensa;
    }
    //GETTER y SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClase() {
        return clase;
    }
    public void setClase() {
        this.clase = clase;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getMinPower() {
        return minPower;
    }
    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }
    public int getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
    public boolean isDefensa() {
        return defensa;
    }
    public void setDefensa(boolean defensa) {
        this.defensa = defensa;
    }
    //METODOS
    public int golpear () {
        int danio;
        Random aleatorio = new Random();
        
        danio = aleatorio.nextInt(this.maxPower - this.minPower) + this.minPower;
        
        return danio;
    }
    public boolean defender () {
        if (this.energia == 40) {
            return true;
        } else {
            this.energia+=5;
            return true;
        }
    }
}
