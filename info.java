public interface info {
    String obtenerInformacion();
     public static void main(String[] args) {
    estudiante estudiante1 = new estudiante();
      Universidad universidad1 = new Universidad();
      
    System.out.println("Nombre estudiante: " + estudiante1.getnombreestudiante());
    System.out.println("Edad estudiante: " + estudiante1.getedad());
     System.out.println("Nombre: " + universidad1.getNombre());
        System.out.println("Ubicación: " + universidad1.getUbicacion());
        System.out.println("Año de Fundación: " + universidad1.getAñoFundacion());
}
     }