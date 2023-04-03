public class partido extends Object{
    //public partido(equipo equipo1, equipo equipo2, int goles1, int goles2) {
        //this.equipo1 = equipo1;
        //this.equipo2 = equipo2;
        //this.goles1 = goles1;
        //this.goles2 = goles2;
    //}

    private equipo equipo1;
    private equipo equipo2;
    private int goles1;
    private int goles2;

    public equipo getEquipo1(){return equipo1;}
    public void setEquipo1(Equipo equipo1){this.equipo1=equipo1;}
    public equipo getEquipo2(){return equipo2;}
    public void setEquipo2(Equipo equipo2){this.equipo2=equipo2;}
    public int getGoles1(){return goles1;}
    public void setGoles1(Int goles1){this.goles1=goles1;}
    public int getGoles2() {return goles2;}
    public void setGoles2(Int goles2){this.goles2=goles2;}


    public String getGanador() {
        String empate ="sin ganador";
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
