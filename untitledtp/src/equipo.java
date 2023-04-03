public class Equipo extends Object{
    //public equipo (String nombre,int id, String descripcion){
    //}

    private String nombre;
    private int id;
    private  String descripcion;

    public Equipo(String string, int i) {
    }

    public String getNombre() {return nombre;}
    
    public void setnombre(String nombre) {this.nombre = nombre;}
    
    public String getdescripcion(String descripcion) {return descripcion;}
    
    public void setdescripcion(String descripcion) {this.descripcion=descripcion;}
    
    public String getid(String id) {return id;}

    public void setid(int id) {this.id=id;}
}

