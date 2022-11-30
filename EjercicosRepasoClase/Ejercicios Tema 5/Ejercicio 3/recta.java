public class recta {
    public punto inicio;
    public punto fin;
    
    public recta(punto inicio, punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    public punto getInicio() {
        return inicio;
    }
    public void setInicio(punto inicio) {
        this.inicio = inicio;
    }
    public punto getFin() {
        return fin;
    }
    public void setFin(punto fin) {
        this.fin = fin;
    }
}
