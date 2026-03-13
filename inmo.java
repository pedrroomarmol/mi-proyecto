public class inmo {
    
    protected double metroscuadrados = 0;
    protected double precioBase = 0;
    protected String direccion = null;
    protected String nombreDueno = null;
    protected int contactoDueno = 0;
    protected boolean segundaMano = false;
    protected double precioFinal = 0;
    protected String siono = "Si";


    public inmo() {
        this.setPrecioBase(450);
        this.setMetroscuadrados(145);
        this.contactoDueno = 601991598;
        this.direccion = "Alameda";
        this.segundaMano = false;
        this.nombreDueno = "Carlos";
    
    }

    public inmo(double metroscuadrados, double precioBase, String direccion, String nombreDueno, int contactoDueno,boolean segundaMano) {
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
            precioFinal = (precioBase*metroscuadrados)-(precioBase*metroscuadrados*0.05);
            siono = "Si";
        } else {
            precioFinal = precioBase*metroscuadrados;
            siono = "No";
        }
        
    }
    
    public void mostrarInformacion() {
        System.out.println();
        System.out.println("El inmueble se encuentra en: " + direccion);
        System.out.println("El precio base del inmueble es: " + precioBase);
        System.out.println("Los metros cuadrados del inmueble son: " + metroscuadrados);
        System.out.println("El inmueble es de segunda mano: " + siono);
        System.out.println("El precio final del inmueble es: " + precioFinal);
        
    }

    public void llamarDueno() {
        System.out.println("Llamando al propietario del inmueble...");
        System.out.println("El contacto del propietario es: " + contactoDueno);
        System.out.println("El propietario del inmueble es: " + nombreDueno);
    }
    
    public void vendido() {
        System.out.println("El inmueble ha sido vendido");

    }
     public static void main(String[] args) {
        Casa casa1 = new Casa(120, 1500, "Calle Mayor, 10", "Juan Pérez", 123456789, false, false, false, false, 4);
        casa1.calcularPrecioFinal();
        casa1.mostrarInformacion();
        System.out.println();
        casa1.llamarDueno();

        Piso piso1 = new Piso(80, 1000, "Avenida de la Constitución, 5", "María López", 987654321, true, false, 0);
        piso1.calcularPrecioFinal();
        piso1.mostrarInformacion();
        System.out.println();
        piso1.llamarDueno();

        Local local1 = new Local(50, 2000, "Calle del Comercio, 15", "Carlos García", 555555555, false, false, "Fiestas");
        local1.calcularPrecioFinal();
        local1.mostrarInformacion();
        System.out.println();
        local1.llamarDueno();

        

     }
    
}
