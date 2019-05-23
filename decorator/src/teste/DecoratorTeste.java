package teste;
import componente.*;
import decorators.*;

public class DecoratorTeste {
	public static void main(String[] args) {
		/* Apenas presidente */
		Presidente presidente = new PresidenteConcreto();
		double salario = 0.0;
		salario = presidente.recebeSalario(salario);
		System.out.println("Apenas Presidente = R$" + salario);
		
		/* Presidente e Capitão do Exército */
		Presidente presidenteCapitao = new Capitao(presidente);
		salario = presidenteCapitao.recebeSalario(salario);
		System.out.println("Presidente e Capitão da Reserva do Exército = R$" + salario);
		
		/* Presidente, Capitão do Exército e Deputado aposentado */
		Presidente presidenteCapitaoDeputado = new Capitao (new Deputado(presidente));
		salario = presidenteCapitaoDeputado.recebeSalario(salario);
		System.out.println("Presidente, Capitão da Reserva do Exército e Deputado Aposentado = R$" + salario);
	}
}
