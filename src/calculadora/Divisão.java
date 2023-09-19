package calculadora;

public class Divisão extends Operação implements OperaçãoInterface {
	

	@override
	public double calcular(double num1, double num2) {
		if (num1 == 0 ) {
			throw new ArithmeticException("Não é possivel fividir por zero ");
		}
	
		return num1 / num2;

	}
}
