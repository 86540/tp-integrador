public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private String getGanador();

    public Pronostico(Partido partido, Equipo equipo, String getGanador()) {
        this.partido=partido;
        this.equipo=equipo;
        //this.getGanador()=getGanador();
    }


public Partido getPartido() {return partido;}
public Equipo getEquipo() {return equipo;}
public String getganador() {return getGanador();}
public int puntos(){
    String resultado_real=partido.getGanador(this.equipo);
    if(getGanador().equals(resultado_real)) {return 1;}
    else {return 0;}
}

}