package aep2;

public class PortaNOR extends Porta {
    
    public int saida() {
        int validar = 0;
        int a = getA();
        int b = getB();
        
        if ((a == 0) && (b == 0)) {
            validar = 1;
        }
        
        return validar;
    }
        
}
