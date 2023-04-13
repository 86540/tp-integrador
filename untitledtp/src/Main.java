import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String pronostico = "C:\\Users\\brian\\OneDrive\\Escritorio\\escuela\\Argentina Programa\\tp integrador\\untitledtp\\pronostico.csv";
        String resultados = "C:\\Users\\brian\\OneDrive\\Escritorio\\escuela\\Argentina Programa\\tp integrador\\untitledtp\\resultados.csv";
      
        System.out.println("Este es nuestro string path:" + resultados);
        System.out.println("Este es nuestro string path:" + pronostico);

        //      lectura de los resultados de los partidos
        Path pathResultados = Paths.get("resultados.csv");
		List<String> br = null;

          String lineares; //string que lee los resultados uno por uno
          try {
            br = Files.readAllLines(pathResultados); {
            lineares= ((BufferedReader) br).readLine();
              String[] nombresequipo= new String[100];
              int[] golesanotados= new int[100];
              int equiposcant=0;
              boolean primera=true; 
              for(int i=0;(lineares= ((BufferedReader) br).readLine())!=null;i++) {
                  if (primera) {primera=false;}
                  else{
                    String[] posicion = lineares.split(";");
                    nombresequipo[i] = posicion[0];
                    golesanotados[i] = Integer.parseInt(posicion[1]);
                    nombresequipo[i+1] = posicion[2];
                    golesanotados[i+1] = Integer.parseInt(posicion[3]);
                    i++;equiposcant=equiposcant+2;
                    }
                }
            
            

              //formador de equipos
              Equipo equipos[]=new Equipo[equiposcant];
              Partido partidos[]=new Partido[equiposcant];
              Ronda ronda1 = new Ronda();
              for (int i=0;i<equiposcant;i++){
                  equipos[i]=new Equipo(nombresequipo[i],i);
              }

              //formador de partidos
              int j=0;
              for (int i=0;i<(equiposcant/2);i++){
                  partidos[i]=new Partido(equipos[j],equipos[j+1],golesanotados[j],golesanotados[j+1]);
                  ronda1.partidos.add(partidos[i]);
                  j=j+2;
              }
            
             // lectura del pronostico de los partidos

            String lineapro;
            try (BufferedReader br1 = new BufferedReader(new FileReader("pronostico.csv"))) {
                String[] resultadospro = new String[6];
                lineapro= br1.readLine();

                for(int i=0;(lineapro = br1.readLine())!=null;i++) {

                    String[] posicion2 = lineapro.split(";");

                    resultadospro[i] = posicion2[1];
                    resultadospro[i+1] = posicion2[2];
                    resultadospro[i+2] = posicion2[3];
                    i=i+2;
                }

                ronda1.ListarGanadores();

                int puntaje=0;
            
          
            for(int i=0;i<golesanotados.length;i++){
                if (golesanotados[0]>golesanotados[1]&&resultadospro[0].equals("x")) {puntaje++;}
                else if(golesanotados[1]>golesanotados[0] && resultadospro[2].equals("x")){puntaje++;}
                else if(golesanotados[0]==golesanotados[1] && resultadospro[1].equals("x")){puntaje++;}
                else if(golesanotados[2]>golesanotados[3] &&  resultadospro[3].equals("x")){puntaje++;}
                else if(golesanotados[3]>golesanotados[2] && resultadospro[5].equals("x")){puntaje++;}
                else if(golesanotados[2]==golesanotados[3] && resultadospro[4].equals("x")){puntaje++;}
            }
    
            System.out.println("sumaste :"+puntaje+" puntos con tu pronostico ");
          
            }catch (NumberFormatException e) {
            System.out.println("problemas en pronosticos");
            e.printStackTrace();
         
            }
        }
    } finally {System.out.println("finally");}
    }
}

