public class Pe extends Gente implements MulherMaravilha {

	//
	// public void desviaAtaque() {
	//
	// }

	public Pe() {
		addComportamento(new TenhoChule());
	}

	public void pensar() {
		setTexto("eu não PEnso ando...");
	}

}
