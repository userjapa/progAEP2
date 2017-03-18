package aep2;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class PortaNOTTeste {
    
    @Test
    public void validate() {
        PortaNOT porta = new PortaNOT();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaA();
        assertThat(porta.saida()).isEqualTo(0);
    }
        
}
