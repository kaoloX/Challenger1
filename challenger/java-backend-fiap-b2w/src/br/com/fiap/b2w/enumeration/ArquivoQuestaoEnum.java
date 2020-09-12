package br.com.fiap.b2w.enumeration;

public enum ArquivoQuestaoEnum {

	IMAGEM("PNG, JPEG, JPG", "IMAGEM"), DOCUMENTO("PDF", "DOCUMENTO");

	private String tipoArquivo;
	private String descricaoArquivo;

	private ArquivoQuestaoEnum(String tipoArquivo, String descricaoArquivo) {
		this.tipoArquivo = tipoArquivo;
		this.descricaoArquivo = descricaoArquivo;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public String getDescricaoArquivo() {
		return descricaoArquivo;
	}

	public void setDescricaoArquivo(String descricaoArquivo) {
		this.descricaoArquivo = descricaoArquivo;
	}
}

	@Override
	public String toString() {
		return String.format("Tipo arquivo: PNG, JPEG, JPG -> { Descrição do Arquivo: Imagem  -> Tipo do Arquivo: PDF " +
				"-> Descrição do Arquivo: Documento}", tipoArquivo, descricaoArquivo);
	}

