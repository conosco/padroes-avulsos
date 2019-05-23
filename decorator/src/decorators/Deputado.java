package decorators;
import componente.Presidente;
import decorators.PresidenteDecorator;

public class Deputado extends PresidenteDecorator {

	public Deputado(Presidente presidente) {
		super(presidente);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double recebeSalario(double salario) {
		// TODO Auto-generated method stub
		double salarioDeputado = 29301.45 ;
		salario = super.recebeSalario(salarioDeputado);
		return salario;
	}
}
