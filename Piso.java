public class Piso extends inmo {
    boolean ascensor;
    int planta;

    public Piso(double metroscuadrados, double precioBase, String direccion, String nombreDueno, int contactoDueno, boolean segundaMano, boolean ascensor, int planta) {
        super(metroscuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        this.setAscensor(ascensor);
        this.setPlanta(planta);
    }

    public Piso() {
       super();
       this.setAscensor(false); 
       this.setPlanta(0);
    }

    public boolean getAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        if (ascensor == true) {
            this.precioFinal = this.precioFinal + (this.precioFinal * 0.03);
            System.out.println();
            System.out.println("El piso tiene ascensor.");

            
        }
        System.out.println();
        System.out.println("El piso no tiene ascensor.");
        
    }

}
