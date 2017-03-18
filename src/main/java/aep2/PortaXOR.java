package aep2;

public class PortaXOR extends Porta {
    
    public int saida() {
        int validar = 0;
        int a = getA();
        int b = getB();
        
        if (a != b) {
            validar = 1;
        } 
        
        return validar;
    }
    
}
