package juegoderol;
import java.util.Random;
import javax.swing.JOptionPane;

public class JuegoDeRol {

    public static void main(String[] args) {
        Personajes jugador1 = new Personajes("Pepe", 5, 30);
        Personajes jugador2 = new Personajes("Toto", 5, 30);
        Random aleatorio = new Random();
        int i = 0;
        
        JOptionPane.showMessageDialog(null, jugador1.mostrarVida() + "\n" + jugador2.mostrarVida());
        
        while (jugador1.vida > 0 && jugador2.vida > 0) {
            i++;
            JOptionPane.showMessageDialog(null, "\nROUND " + i);

            int ataqueJ1 = aleatorio.nextInt(jugador1.maxPower-jugador1.minPower) + jugador1.minPower;

            JOptionPane.showMessageDialog(null, jugador1.nombre + " hace " + ataqueJ1 + " de daño.");
            jugador2.vida = jugador2.vida - ataqueJ1;
            if (jugador2.vida > 0) {
                JOptionPane.showMessageDialog(null, jugador1.mostrarVida() + "\n" + jugador2.mostrarVida());
            } else {
                JOptionPane.showMessageDialog(null, jugador1.mostrarVida() + "\n" + jugador2.nombre + "---> VIDA: 0\n\n" + jugador1.nombre + " es el ganador!");
            }
            
            if(jugador2.vida > 0) {
                int ataqueJ2 = aleatorio.nextInt(jugador2.maxPower-jugador2.minPower) + jugador2.minPower;

                JOptionPane.showMessageDialog(null, jugador2.nombre + " hace " + ataqueJ2 + " de daño.");
                jugador1.vida = jugador1.vida - ataqueJ2;
                if (jugador1.vida > 0) {
                    JOptionPane.showMessageDialog(null, jugador1.mostrarVida() + "\n" + jugador2.mostrarVida());
                } else  {
                    JOptionPane.showMessageDialog(null, jugador1.nombre + "---> VIDA: 0\n" + jugador1.mostrarVida() + "\n\n" + jugador2.nombre + " es el ganador!");
                }
            }
        }
    }
}
