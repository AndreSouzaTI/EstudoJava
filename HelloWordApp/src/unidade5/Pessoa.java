package unidade5;

import java.util.Objects;

public class Pessoa {

		String nome;
		int idade;
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public Pessoa(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}

		@Override
		public int hashCode() {
			return Objects.hash(idade, nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pessoa other = (Pessoa) obj;
			return idade == other.idade && Objects.equals(nome, other.nome);
		}
		
		

	

}
