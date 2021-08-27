
public class Cliente {

	private String nome;
	private int idade;

	public Cliente(String nome, int idade) {

		this.nome = nome;
		this.idade = idade;

	}

	public String calculaValor(String diaSemana) {
		if (diaSemana == "quinta feira" || diaSemana == "quarta-feira")
			return "R$ 6,00";
		else if (idade < 14 | idade > 65)
			return "R$ 6,00";
		else
			return "R$ 12,00";
	}

}
