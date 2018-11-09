package juegoderolv3;

public class Jugador extends Personaje {
    //ATRIBUTO
    int danio;
    String nomAtEsUno;
    String descAtEsUno;
    String nomAtEsDos;
    String descAtEsDos;
    String rutaImg;
    //CONSTRUCTOR
    public Jugador (String nombre, String clase) {
        super(nombre, clase);
        if(clase == "NINJA") {
            this.nomAtEsUno = "DOBLE GOLPE";
            this.descAtEsUno = "<html>Da dos golpes seguidos (El nombre lo dice todo).</html>";
            this.nomAtEsDos = "SUPER DOBLE GOLPE";
            this.descAtEsDos = "<html>Igual que el otro pero super porque lo multiplica por dos al daño.</html>";
            this.rutaImg = "/img/ninja.png";
        } else if (clase == "GUERRERO") {
            this.nomAtEsUno = "SABLAZO";
            this.descAtEsUno = "<html>El golpe hace el doble de daño.</html>";
            this.nomAtEsDos = "ROMPE-HUESOS";
            this.descAtEsDos = "<html>Da un golpe que produce el doble del daño máximo posible.</html>";
            this.rutaImg = "/img/guerrero.png";
        } else if (clase == "MONJE") {
            this.nomAtEsUno = "ILUMINACION";
            this.descAtEsUno = "<html>Recupera 20 de vida y hace daño de entre 0 y " + super.getMinPower() + ".</html>";
            this.nomAtEsDos = "LUZ SAGRADA";
            this.descAtEsDos = "<html>Recupera 40 de vida y hace daño de entre 0 y " + super.getMinPower() + ".</html>";
            this.rutaImg = "/img/monje.png";
        }
    }
    //GETTER y SETTER
    public String getNomAtEsUno() {
        return nomAtEsUno;
    }
    public void setNomAtEsUno(String nomAtEsUno) {
        this.nomAtEsUno = nomAtEsUno;
    }
    public String getDescAtEsUno() {
        return descAtEsUno;
    }
    public void setDescAtEsUno(String descAtEsUno) {
        this.descAtEsUno = descAtEsUno;
    }
    public String getNomAtEsDos() {
        return nomAtEsDos;
    }
    public void setNomAtEsDos(String nomAtEsDos) {
        this.nomAtEsDos = nomAtEsDos;
    }
    public String getDescAtEsDos() {
        return descAtEsDos;
    }
    public void setDescAtEsDos(String descAtEsDos) {
        this.descAtEsDos = descAtEsDos;
    }
    public String getRutaImg() {
        return rutaImg;
    }
    //METODO ATAQUE ESPECIAL UNO
    public int ataqueEspecialUno () {
        if (this.clase == "NINJA") {
            danio = super.golpear() + super.golpear();
            super.setEnergia(super.getEnergia()-20);
        } else if (this.clase == "GUERRERO") {
            danio = super.golpear() * 2;
            super.setEnergia(super.getEnergia()-20);
        } else if (this.clase == "MONJE") {
            danio = super.golpear() - super.getMinPower();
            super.setEnergia(super.getEnergia()-20);
            if (super.getVida() >= 80) {
                super.setVida(100);
            } else {
                super.setVida(super.getVida()+20);
            }
        }
        return danio;
    }
    
    //METODO ATAQUE ESPECIAL DOS
    public int ataqueEspecialDos () {
        if (this.clase == "NINJA") {
            danio = (super.golpear() + super.golpear()) * 2;
            super.setEnergia(super.getEnergia()-40);
        } else if (this.clase == "GUERRERO") {
            danio = super.getMaxPower() * 2;
            super.setEnergia(super.getEnergia()-40);
        } else if (this.clase == "MONJE") {
            danio = super.golpear() - super.getMinPower();
            super.setEnergia(super.getEnergia()-40);
            if (super.getVida() >= 60) {
                super.setVida(100);
            } else {
                super.setVida(super.getVida()+40);
            }
        }
        return danio;
    }   
}