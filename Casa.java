public class Casa extends inmo {
    boolean jardin;
    boolean adosado;
    boolean patio;
    int plantas;

    public Casa(double metroscuadrados, double precioBase, String direccion, String nombreDueno, int contactoDueno,
            boolean segundaMano, boolean jardin, boolean adosado, boolean patio, int plantas) {
        super(metroscuadrados, precioBase, direccion, nombreDueno, contactoDueno, segundaMano);
        this.setJardin(jardin);
        this.setAdosado(adosado);
        this.setPatio(patio);
        this.setPlantas(plantas);
    }

    public Casa() {
        super();
        this.setJardin(false);
        this.setAdosado(false);
        this.setPatio(false);
        this.setPlantas(0);
    }

    public boolean getPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public boolean getJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean getAdosado() {
        return adosado;
    }

    public void setAdosado(boolean adosado) {
        this.adosado = adosado;
    }
    @Override
    public void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        if (jardin == true) {
            this.precioFinal = this.precioFinal + (precioFinal * 0.07);
        } else if (adosado == false) {
            this.precioFinal = this.precioFinal + (precioFinal * 0.10);
        } else if (jardin == true && adosado == false) {
            this.precioFinal = this.precioFinal + (precioFinal * 0.17);
        } else if (adosado == true) {
            this.precioFinal = this.precioFinal + (precioFinal * 0.10);
        }

    }
}
