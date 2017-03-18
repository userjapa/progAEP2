package aep2;

public class PortaNOT extends Porta {
    
    public int saida() {
        int validar = 0;
        int a = getA();
        
        if (a == 0) {
            validar = 1;
        } else {
            validar = 0;
        }
        
        return validar;
    }    
    
}
