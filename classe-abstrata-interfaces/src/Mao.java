public class Mao extends Gente {

	public void pensar() {
		setTexto("pega aqui ni mim !! ");
	}

	public void dano(float dano) {
		dano = dano / 2;
		super.dano(dano);
	}
	
}
