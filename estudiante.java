         public class estudiante extends Universidad implements info {
    private String nombreestudiante;
    private int edad;
    
    public estudiante(){
        nombreestudiante ="nicolas";
        edad=20;
    }
    public estudiante (String nombreestudiante,int edad,String nombreUniversidad,String ubicacionUniversidad,int añoFundacionUniversidad){
        super(nombreUniversidad,ubicacionUniversidad,añoFundacionUniversidad);
        this.nombreestudiante=nombreestudiante;
        this.edad=edad;
    }
    public String getnombreestudiante(){
        return nombreestudiante;
    }
    public void setnombreestudiante(String nombreestudiante){
        this.nombreestudiante=nombreestudiante;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    @Override
    public String obtenerInformacion(){
        return "nombre del estudiante"+nombreestudiante+"\nedad"+edad+"\nUniversidad"+getNombre()+"\nubicacion"+getUbicacion()+"\nAño de fundacion"+getAñoFundacion();
    }
     public static void main(String[] args) {
    estudiante estudiante1 = new estudiante();
     
      
    System.out.println("Nombre estudiante: " + estudiante1.getnombreestudiante());
    System.out.println("Edad estudiante: " + estudiante1.getedad());
     
         
}
     }  
