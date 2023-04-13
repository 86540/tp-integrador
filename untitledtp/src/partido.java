public class partido {
    public partido(equipo equipo1, equipo equipo2, int goles1, int goles2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles1 = goles1;
        this.goles2 = goles2;
    }

    private equipo equipo1;
    private equipo equipo2;
    private int goles1;
    private int goles2;


    public int getGoles1() {return goles1;} public int getGoles2() {return goles2;}


    public String getGanador() {
        String empate ="empate";
        if (goles1 > goles2) {
           return equipo1.getNombre();

        }
        if (goles2 > goles1){
            return equipo2.getNombre();
        }
        else{
            return empate;
        }
    }
}
/*public class Partido extends Object{
    //public partido(equipo equipo1, equipo equipo2, int goles1, int goles2) {
        //this.equipo1 = equipo1;
        //this.equipo2 = equipo2;
        //this.goles1 = goles1;
        //this.goles2 = goles2;
    //}

    private Equipo equipo1;
    private Equipo equipo2;
    private int goles1;
    private int goles2;

    public Partido(Equipo equipo, Equipo equipo3, int i, int j) {
    }
    public Equipo getEquipo1(){return equipo1;}
    public void setEquipo1(Equipo equipo1){this.equipo1=equipo1;}
    public Equipo getEquipo2(){return equipo2;}
    public void setEquipo2(Equipo equipo2){this.equipo2=equipo2;}
    public int getGoles1(){return goles1;}
    public <Int> void setGoles1(Int goles1){this.goles1=(int) goles1;}
    public int getGoles2() {return goles2;}
    public <Int> void setGoles2(Int goles2){this.goles2=(int) goles2;}

    public String getGanador() {
        String empate ="empate";
        if (goles1 > goles2) {
           return equipo1.getNombre();

        }
        if (goles2 > goles1){
            return equipo2.getNombre();
        }
        else{
            return empate;
        }
    }
    public String getGanador(Equipo equipo) { //resultado_real
        return null;
    }
}
*/