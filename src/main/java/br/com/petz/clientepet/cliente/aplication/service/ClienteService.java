package br.com.petz.clientepet.cliente.aplication.service;

import br.com.petz.clientepet.cliente.aplication.api.ClienteRequest;
import br.com.petz.clientepet.cliente.aplication.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}

