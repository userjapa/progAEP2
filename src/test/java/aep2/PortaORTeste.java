package aep2;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class PortaORTeste {
    
    @Test
    public void validate() {
        PortaOR porta = new PortaOR();
        assertThat(porta.saida()).isEqualTo(0);
        
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaA();
        porta.desligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaA();
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
    }
    
}
