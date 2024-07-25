package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author JoaoTeles87
 */
@Entity
public class Endereco {

	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private int numero;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;

	private Endereco(String cep, String logradouro, String complemento, String bairro, int numero, String uf, String ibge, String gia, String ddd) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.numero = numero;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
	}

	public Endereco() {

	}

	public static class EnderecoBuilder{
		public String cep;
		public String logradouro;
		public String complemento;
		public String bairro;
		public int numero;
		public String uf;
		public String ibge;
		public String gia;
		public String ddd;

		public EnderecoBuilder cep(String cep){
			this.cep = cep;
			return this;
		}

		public EnderecoBuilder logradouro(String logradouro){
			this.logradouro = logradouro;
			return this;
		}

		public EnderecoBuilder complemento(String complemento){
			this.complemento = complemento;
			return this;
		}

		public EnderecoBuilder bairro(String bairro){
			this.bairro = bairro;
			return this;
		}

		public EnderecoBuilder numero(int numero){
			this.numero = numero;
			return this;
		}

		public EnderecoBuilder uf(String uf){
			this.uf = uf;
			return this;
		}

		public EnderecoBuilder ibge(String ibge){
			this.ibge = ibge;
			return this;
		}

		public EnderecoBuilder gia(String gia){
			this.gia = gia;
			return this;
		}

		public EnderecoBuilder ddd(String ddd){
			this.ddd = ddd;
			return this;
		}

		public Endereco build(){
			return new Endereco(cep, logradouro, complemento, bairro, numero, uf, ibge, gia, ddd);
		}
	}




}
