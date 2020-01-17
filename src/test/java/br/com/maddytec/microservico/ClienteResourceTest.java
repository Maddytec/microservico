package br.com.maddytec.microservico;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.maddytec.microservico.builder.ClienteBuilder;
import br.com.maddytec.microservico.domain.Cliente;
import br.com.maddytec.microservico.service.ClienteService;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteResourceTest extends TestCase {

	@Mock
	private ClienteService clienteService;

	@Test
    public void findByIdTest() {
        
		Cliente cliente = ClienteBuilder.build().ComCliente().get();
		when(this.clienteService.findById(1L)).thenReturn(cliente);
        
        assertThat(cliente.getCpf()).isEqualTo("32321710012");
    }
	
}
