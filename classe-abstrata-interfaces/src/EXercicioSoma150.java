public class EXercicioSoma150 {

	public static void main(String[] arg) {

		int atual = 0;
		int soma = 0;
		int limite = 150;

		while (atual <= limite) {
			soma = soma + atual;
			atual++;
		}

		System.out.println("soma dos primeiros " + limite + " numeros = "
				+ soma);
	}

}
