package br.com.petz.clientepet.cliente.aplication.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.aplication.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(Object clienteResquest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
