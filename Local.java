public class Local extends inmo {
    boolean escaparate;
    String actividad;
    
    public Local(double metroscuadrados, double precioBase, String direccion, String nombreDueno, int contactoDueno, boolean segundaMano, boolean escaparate, String actividad) {
        super(metroscuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        this.setEscaparate(escaparate);
        this.setActividad(actividad);
    }

    public Local() {
        super();
        this.setEscaparate(false);
        this.setActividad("Fiestas");
    }
    
    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        if (escaparate == true) {
            this.precioFinal = this.precioFinal+(precioFinal*0.3);
            System.out.println("El inmueble tiene escaparate.");
            System.out.println();
        }
            System.out.println("No tiene escaparate.");
            System.out.println();
        
    }

    public boolean getEscaparate() {
        return escaparate;
    }

    public void setEscaparate(boolean escaparate) {
        this.escaparate = escaparate;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
}
