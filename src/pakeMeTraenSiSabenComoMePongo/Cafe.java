package pakeMeTraenSiSabenComoMePongo;

public class Cafe extends Infusion {
	private boolean dulce=false;
	public Cafe(boolean dulce) {
		this.dulce=dulce;
	}
	@Override
	public void agregarTipoInfusion() {
		System.out.println("Se agrega cafe molido a la taza");
	}
	@Override
	public void endulzar() {
		if(dulce)
			System.out.println("La bebida se tomara dulce");
		else
			System.out.println("La bebida se tomara amarga");
	}
}
