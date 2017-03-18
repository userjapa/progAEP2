package aep2;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class PortaNANDTeste {
    
    @Test
    public void validate() {
        PortaNAND porta = new PortaNAND();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaA();
        porta.desligarEntradaB();
        assertThat(porta.saida()).isEqualTo(1);
        
        porta.ligarEntradaA();
        porta.ligarEntradaB();
        assertThat(porta.saida()).isEqualTo(0);
    }
    
}
