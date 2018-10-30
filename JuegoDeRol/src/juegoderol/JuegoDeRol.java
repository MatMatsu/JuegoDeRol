package juegoderol;
import java.util.Random;

public class JuegoDeRol {

    public static void main(String[] args) {
        Personajes jugador1 = new Personajes("Pepe", 5, 30);
        Personajes jugador2 = new Personajes("Toto", 5, 30);
        Random aleatorio = new Random();
        int i = 0;
        
        System.out.println(jugador1.nombre + "---> VIDA: " + jugador1.vida);
        System.out.println(jugador2.nombre + "---> VIDA: " + jugador2.vida);

        
        while (jugador1.vida > 0 && jugador2.vida > 0) {
            i++;
            System.out.println("\nROUND " + i);

            int ataqueJ1 = aleatorio.nextInt(jugador1.maxPower-jugador1.minPower) + jugador1.minPower;

            System.out.println(jugador1.nombre + " hace " + ataqueJ1 + " de daño.");
            jugador2.vida = jugador2.vida - ataqueJ1;
            if (jugador2.vida > 0) {
                System.out.println(jugador2.nombre + "---> VIDA: " + jugador2.vida);
            } else {
                System.out.println(jugador2.nombre + "---> VIDA: 0\n\n" + jugador1.nombre + " es el ganador!");
            }
            
            if(jugador2.vida > 0) {
                int ataqueJ2 = aleatorio.nextInt(jugador2.maxPower-jugador2.minPower) + jugador2.minPower;

                System.out.println(jugador2.nombre + " hace " + ataqueJ2 + " de daño.");
                jugador1.vida = jugador1.vida - ataqueJ2;
                if (jugador1.vida > 0) {
                    System.out.println(jugador1.nombre + "---> VIDA: " + jugador1.vida);
                } else  {
                    System.out.println(jugador1.nombre + "---> VIDA: 0\n\n" + jugador2.nombre + " es el ganador!");
                }
            }
        }
        
        
    }
    
}
