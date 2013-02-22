import java.util.ArrayList;
import java.util.Iterator;

public abstract class Gente {

	private static final float MAX_VIDA = 100;

	public String falar() {
		return texto;
	}

	private String texto;
	private float vida;
	private ArrayList comportamentos;

	public void dano(float dano) {
		vida -= dano;
		if (vida < 0) {
			vida = 0;
		}
	}

	public Gente() {
		vida = MAX_VIDA;
		comportamentos = new ArrayList();
	}

	public void addComportamento(ComportamentoEspecial comportamento) {
		comportamentos.add(comportamento);
	}

	public void executaComportamentos() {

		Iterator iterator = comportamentos.iterator();
		while (iterator.hasNext()) {
			ComportamentoEspecial c = (ComportamentoEspecial) iterator.next();
			c.executar(this);
		}

	}

	public float getVida() {
		return vida;
	}

	public void setVida(float vida) {
		this.vida = vida;
		if (vida > MAX_VIDA) {
			vida = MAX_VIDA;
		}
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public abstract void pensar();

}
