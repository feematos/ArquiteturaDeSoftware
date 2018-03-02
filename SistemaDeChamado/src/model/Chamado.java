package model;

public class Chamado {
	private int id_Chamado;
	private String descricao;
	private String status;
	private String id_Fila;
	private String dt_Abertura;
	private String dt_Fechamento;
	
	public int getId_Chamado() {
		return id_Chamado;
	}
	public void setId_Chamado(int id_Chamado) {
		this.id_Chamado = id_Chamado;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId_Fila() {
		return id_Fila;
	}
	public void setId_Fila(String id_Fila) {
		this.id_Fila = id_Fila;
	}
	public String getDt_Abertura() {
		return dt_Abertura;
	}
	public void setDt_Abertura(String dt_Abertura) {
		this.dt_Abertura = dt_Abertura;
	}
	public String getDt_Fechamento() {
		return dt_Fechamento;
	}
	public void setDt_Fechamento(String dt_Fechamento) {
		this.dt_Fechamento = dt_Fechamento;
	}
	
}
