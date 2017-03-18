package aep2;

public class PortaAND extends Porta {

    public int saida() {
        int validar = 0;
        int a = getA();
        int b = getB();
        
        if((a == 1) && (b == 1)) {
            validar = 1;
        }
        
        return validar;
    } 

}
