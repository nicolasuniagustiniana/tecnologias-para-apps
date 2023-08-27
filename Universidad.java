public class Universidad {
    private String nombre;
    private String ubicacion;
    private int añoFundacion;

    // Constructor 
    public Universidad() {
        nombre = "Uniagustiniana";
        ubicacion = "suba calle 110";
        añoFundacion = 1998;
    }

    // Constructor para parametros
    public Universidad(String nombre, String ubicacion, int añoFundacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.añoFundacion = añoFundacion;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para ubicación
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos get y set para año de fundación
    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
        
    }
    
     public static void main(String[] args) {
        // instancia de Universidad utilizando el constructor por defecto
        Universidad universidad1 = new Universidad();
        
        // Mostrar los detalles de la universidad
        System.out.println("Universidad 1:");
        System.out.println("Nombre: " + universidad1.getNombre());
        System.out.println("Ubicación: " + universidad1.getUbicacion());
        System.out.println("Año de Fundación: " + universidad1.getAñoFundacion());
         
    
     }
         }

     