public class TesteBoladao {

	public static void main(String[] args) {

		Gente[] muitaGente = new Gente[5];
		muitaGente[0] = new ZeMane();
		muitaGente[1] = new Orelha();
		muitaGente[2] = new Pe();
		muitaGente[3] = new Mao();

		muitaGente[4] = new Gente() {

			public void pensar() {
				setTexto("eu sou normal !!");
			}
		};

		muitaGente[2].addComportamento(new ComportamentoEspecial() {

			public void executar(Gente eu) {
				System.out.println("hein ??" + eu.getVida());
			}
		});

		muitaGente[2].addComportamento(new TenhoChule());
		muitaGente[3].addComportamento(new TenhoChule());

		listarGente(muitaGente);
		listarGente(muitaGente);

	}

	private static void listarGente(Gente[] muitaGente) {
		for (int i = 0; i < muitaGente.length; i++) {

			if (!(muitaGente[i] instanceof MulherMaravilha)) {
				muitaGente[i].dano(50);
			}

			muitaGente[i].executaComportamentos();

			if (muitaGente[i] instanceof Wolverine) {
				// 1
				Wolverine garrasBoy = (Wolverine) muitaGente[i];
				garrasBoy.regenerar();

				// 2
				((Wolverine) muitaGente[i]).regenerar();

			}

			muitaGente[i].pensar();
			System.out.println(muitaGente[i].falar() + " vida="
					+ muitaGente[i].getVida());
		}
	}
}
