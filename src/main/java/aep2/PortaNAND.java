package aep2;

public class PortaNAND extends Porta {
    
    public int saida() {
        int validar = 1;
        int a = getA();
        int b = getB();
        
        if((a == 1) && (b == 1)) {
            validar = 0;
        }
        
        return validar;
    }
    
}
