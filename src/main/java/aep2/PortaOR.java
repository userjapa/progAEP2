package aep2;

public class PortaOR extends Porta {
    
    public int saida() {
        int validar = 1;
        int a = getA();
        int b = getB();
        
        if ((a == 0) && (b == 0)) {
            validar = 0;
        }        
        return validar;
    }
    
}
