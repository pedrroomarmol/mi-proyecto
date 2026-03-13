public class Local extends inmo {
    private boolean escaparate;
    private String actividad;
    
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
            System.out.println();
            System.out.println("El local tiene escaparate.");
            
        }
            System.out.println();
            System.out.println("El local no tiene escaparate.");
            
        
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
