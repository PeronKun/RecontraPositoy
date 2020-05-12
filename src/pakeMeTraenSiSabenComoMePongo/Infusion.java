package pakeMeTraenSiSabenComoMePongo;

public abstract class Infusion {
	
	public void ProcesoDeInfusion()
	{
		calentarAgua();
		agregarTipoInfusion();
		endulzar();
	}
	abstract public void agregarTipoInfusion();
	abstract public void endulzar();
	
	public void calentarAgua()
	{
		System.out.println("Calentando el agua");
	}
}
