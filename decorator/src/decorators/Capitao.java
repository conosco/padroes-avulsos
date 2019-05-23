package decorators;
import componente.Presidente;
import decorators.PresidenteDecorator;

public class Capitao extends PresidenteDecorator {

	public Capitao(Presidente presidente) {
		super(presidente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double recebeSalario(double salario) {
		// TODO Auto-generated method stub
		double salarioCapitao = 10000;
		salario = super.recebeSalario(salarioCapitao);
		return salario;
	}
}
