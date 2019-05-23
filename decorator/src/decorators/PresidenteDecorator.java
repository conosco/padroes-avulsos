package decorators;
import componente.Presidente;

public class PresidenteDecorator implements Presidente{
	public Presidente presidente;
	
	public PresidenteDecorator(Presidente presidente) {
		this.presidente = presidente;
	}

	@Override
	public double recebeSalario(double salario) {
		// TODO Auto-generated method stub
		salario = salario + this.presidente.recebeSalario(salario);
		return salario;
	}
}
