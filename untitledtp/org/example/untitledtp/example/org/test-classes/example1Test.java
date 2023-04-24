package org.example;

import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class example1Test {
    private String equipo1;
    private String equipo2;
    private String gana1;
    private String gana2;

    @Before
    public void setup() {
        this.equipo1 = new Equipo("Argentina");
		this.equipo2= new Equipo("Polonia");
		this.partido = new Partido(this.equipo1, 
				this.equipo2, 4, 2);
    }
    @Test
    public void ganador_o_perdedor(){
        // resultado
        this.partido.setGoles_equipo1(2);
        this.partido.setGoles_equipo2(3);

        //Procesamiento
        resultado resultado1=partido.resultado(this.equipo1);
        resultado resultado2=partido.resultado(this.equipo2);

        //Evaluación
        assertEquals(resultado.gana1,resultado1);
        assertEquals(resultado.gana2,resultado2);


        // procesamiento de partidos
        
        //Integer goles_equipo1_id=3;
        //Integer goles_equipo2_id=1;
        
    }
    @Test
    public void empate(){
        Integer goles_equipo1_id=3;
        Integer goles_equipo2_id=3;
        String empate="empate";
        //assertEquals(empate,example1.igualar(goles_equipo1_id,goles_equipo2_id));
    }
}
