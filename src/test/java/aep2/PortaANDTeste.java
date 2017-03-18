package aep2;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class PortaANDTeste {
    
    @Test
    public void validate() {
        PortaAND porta = new PortaAND();
        assertThat(porta.saida()).isEqualTo(0);
        
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
