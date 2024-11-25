package com.springbatch.arquivomultiplosformatos.dominio;

import lombok.Data;

@Data
public class Transacao {
	private String id;
	private String descricao;
	private Double valor;
}
