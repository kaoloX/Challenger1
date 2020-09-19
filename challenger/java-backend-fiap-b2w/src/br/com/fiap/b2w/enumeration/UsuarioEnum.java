package br.com.fiap.b2w.enumeration;


	public enum UsuarioEnum{
		ADMIN(1, "ADMIN"), RH(2, "RH"), GESTOR(3, "GESTOR"), ASSOCIADO(4, "ASSOCIADO");
		
		private int tipoUsuarioId;
		private String tipoUsuarioDescricao;
		
		private UsuarioEnum(int tipoUsuarioId, String tipoUsuarioDescricao) {
			this.tipoUsuarioId = tipoUsuarioId;
			this.tipoUsuarioDescricao = tipoUsuarioDescricao;
		}


		public int getTipoUsuarioId() {
			return tipoUsuarioId;
		}



		public void setTipoUsuarioId(int tipoUsuarioId) {
			this.tipoUsuarioId = tipoUsuarioId;
		}



		public String getTipoUsuarioDescricao() {
			return tipoUsuarioDescricao;
		}



		public void setTipoUsuarioDescricao(String tipoUsuarioDescricao) {
			this.tipoUsuarioDescricao = tipoUsuarioDescricao;
		}
	}

		@Override
		public int toInt () {
		public toInt("Tipo de Usuário ID: 1 -> Tipo de Usuario Descrição: ADMIN -> Tipo de Usuario ID: 2 -> " +
					"Tipo de usuario Descrição: RH -> Tipo de Usuario ID: 3 -> Tipo de Usuario Descrição: Gestor " +
					"Tipo de usuário: 4 -> Tipo de usuario Descricao: Associado ", tipoUsuarioId, tipoUsuarioDescricao);
		}

		private void toInt(String s, int tipoUsuarioId, String tipoUsuarioDescricao) {
		}

	

