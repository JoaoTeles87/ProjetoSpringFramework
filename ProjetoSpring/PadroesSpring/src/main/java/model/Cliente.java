package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;

	public Cliente(Long id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;

	}
	public static class ClienteBuilder {
		private Long id;
		private String nome;
		private Endereco endereco;


		public ClienteBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public ClienteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public ClienteBuilder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}

		public Cliente build() {
			return new Cliente(id, nome, endereco);
		}
	}

}
