public class inmobiliaria {
    
    double metroscuadrados = 0;
    double precioBase = 0;
    String direccion = null;
    String nombreDueno = null;
    int contactoDueno = 0;
    boolean segundaMano = false;


    public inmobiliaria() {
        this.setPrecioBase(0);
        this.setMetroscuadrados(0);
        this.contactoDueno = 601991598;
        this.direccion = "Alameda";
        this.segundaMano = false;
        this.nombreDueno = "Carlos";
    
    }

    public inmobiliaria(double metroscuadrados, double precioBase, String direccion, String nombreDueno, int contactoDueno,boolean segundaMano) {
        this.setMetroscuadrados(metroscuadrados);
        this.setPrecioBase(precioBase);
        this.direccion = direccion;
        this.nombreDueno = nombreDueno;
        this.contactoDueno = contactoDueno;
        this.segundaMano = segundaMano;
    }



    public double getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(double metroscuadrados) {
        if (metroscuadrados < 0) {
            System.out.println("Los datos no son validos");
        }
        this.metroscuadrados = metroscuadrados;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0) {
            System.out.println("Los datos no son validos");
        }
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public int getContactoDueno() {
        return contactoDueno;
    }

    public void setContactoDueno(int contactoDueno) {
        this.contactoDueno = contactoDueno;
    }

    public boolean getSegundaMano() {
        return segundaMano;
    }

    public void setSegundaMano(boolean segundaMano) {
        this.segundaMano = segundaMano;
    }

    public void calcularPrecioFinal () {
        if (segundaMano == true) {
            precioBase = precioBase-(precioBase*0.05);
            System.out.println("Tu precio final es: "+precioBase);
        }
    }
}
