package aep2;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class PortaXNORTeste {
    
    @Test
    public void validate() {
        PortaXNOR porta = new PortaXNOR();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(0);
        
        porta.ligarEntradaA();
        porta.desligarEntradaB();
        assertThat(porta.saida()).isEqualTo(0);
        
        porta.ligarEntradaA();
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
    }
    
}
