package calculadora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		List<Double> resultados = new ArrayList<>();
		
		System.out.println("Calculadora");
		
		int escolha;
		do {
			
			System.out.println("Escolha a operação: ");
			
			System.out.println("1 Adição");
			
			System.out.println("2 Subtração");
			
			System.out.println("3 Multiplicação");
			
			System.out.println("4 Divisão");
		
			escolha = scanner.nextInt();
			
			if(escolha ==5) {
				System.out.println("Calculadora encerrada: ");
				break;
			}
			
			double num1,num2;
			Operação calculadora = null;
				
				switch(escolha) {
				case 1 :
					calculadora = new Adição();
					break;
				case 2 :
					calculadora = new Subtração();
					break;
				case 3 :
					calculadora = new Multiplicação();
					break;
				case 4 :
					calculadora = new Divisão();
					break;
					default:
						System.out.println("Escolha invalida");
						continue;
				}
				
				System.out.println("Digite o primeiro número: ");
				num1 = scanner.nextDouble();
				System.out.println("Digite o segundo número: ");
				num2 = scanner.nextDouble();
				
				try {
			       double resultado = calculadora.calcular(num1 , num2);
			       resultados.add(resultado);
			       System.out.println("Resultado:  " + resultado);
				} catch (ArithmeticException e) {
					System.out.println("Erro: " + e.getMessage());
				}
				
			} while (escolha != 5);
			
			scanner.close();
		}
	}
