package aep2;

public class PortaXNOR extends Porta{
    
    public int saida() {
        int validar = 1;
        int a = getA();
        int b = getB();
        
        if (a != b) {
            validar = 0;
        }
        
        return validar;
    }
    
}
