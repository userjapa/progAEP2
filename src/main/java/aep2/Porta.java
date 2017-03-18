package aep2;

public abstract class Porta {
    
    private int a = 0;
    private int b = 0;
    
    public final void ligarEntradaA() {
        setA(1);
    }   
    
    public final void ligarEntradaB() {
        setB(1);
    }
    
    public final void desligarEntradaA() {
        setA(0);
    }
    
    public final void desligarEntradaB() {
        setB(0);
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
}
