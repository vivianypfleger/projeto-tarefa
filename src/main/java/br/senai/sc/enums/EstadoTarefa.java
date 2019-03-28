package br.senai.sc.enums;

public enum EstadoTarefa {

	PENDENTE (1, "Pendente"),
	CONCLUIDA (2, "Concluída");
	
	private Integer codigo;
	private String descricao;
	
	
	private EstadoTarefa(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	
	public static EstadoTarefa toEnum(Integer codigo) {
		for (EstadoTarefa estado : EstadoTarefa.values()) {
			if(estado.getCodigo() == codigo) {
				return estado;
			}
		}
		return null;
	}
	
	

	public Integer getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}
	
	
	
}
