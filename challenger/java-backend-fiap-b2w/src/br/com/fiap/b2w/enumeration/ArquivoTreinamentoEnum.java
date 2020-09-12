package br.com.fiap.b2w.enumeration;

public enum ArquivoTreinamentoEnum {

	VIDEO("MP4, AVI", "VIDEO"), IMAGEM("PNG, JPEG, JPG", "IMAGEM"), AUDIO("MP3, WMA", "AUDIO"), DOCUMENTO("PDF", "DOCUMENTO");
	
	private String tipoArquivo;
	private String tipoArquivoDescricao;
	
	private ArquivoTreinamentoEnum(String tipoArquivo, String descricaoArquivo) {
		this.tipoArquivo = tipoArquivo;
		this.tipoArquivoDescricao = descricaoArquivo;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public String getDescricaoArquivo() {
		return tipoArquivoDescricao;
	}

	public void setDescricaoArquivo(String descricaoArquivo) {
		this.tipoArquivoDescricao = descricaoArquivo;
	}
}
	@Override
	public String toString () {
	return String.format ("tipoArquivo: MP4,AVI -> descricaoArquivo: VIDEO -> tipoArquivo: PNG, JPEG, JPG ->
		  "descricaoArquivo: IMAGEM -> tipoArquivo: MP3, WMA ->
		"descricaoArquivo: Audio ->  tipoDoArquivo: PDF ->
		"descricaoDoArquivo: Documento", tipoArquivo, tipoArquivoDescricao);
		}


