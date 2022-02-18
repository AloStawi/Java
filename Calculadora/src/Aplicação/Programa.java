package Aplicação;
import java.util.Scanner;
import Estidades.Calculadora;

public class Programa {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		
		
		int opc = 0, a, b;
		
		do {
			System.out.println(" _______CALCULADORA_______ ");
			System.out.println("| 1 - Adição              |");
			System.out.println("| 2 - Subtração           |");
			System.out.println("| 3 - Divisão             |");
			System.out.println("| 4 - Multiplicação       |");
			System.out.println("| 5 - Sair                |");
			System.out.println(" -------------------------\n");
			
			System.out.print("Selecioe a opção: ");
			opc = sc.nextInt();
				
			if((0 < opc) && (opc <= 5)) {
				switch (opc) {
					case 1:
						System.out.print("Entre com o primeiro número: ");
						a = sc.nextInt();
						System.out.print("Entre com o segundo número: ");
						b = sc.nextInt();	
						int soma = calc.Soma(a, b);
						System.out.println("Resultado da soma: " + soma); break;
						
					case 2:
						System.out.print("Entre com o primeiro número: ");
						a = sc.nextInt();
						System.out.print("Entre com o segundo número: ");
						b = sc.nextInt();	
						int sub = calc.Sub(a, b);
						System.out.println("Resultado da subtração: " + sub); break;
						
					case 3:
						System.out.print("Entre com o primeiro número: ");
						a = sc.nextInt();
						System.out.print("Entre com o segundo número: ");
						b = sc.nextInt();	
						int div = calc.Div(a, b);
						System.out.println("Resultado da divisão: " + div); break;
						
					case 4:
						System.out.print("Entre com o primeiro número: ");
						a = sc.nextInt();
						System.out.print("Entre com o segundo número: ");
						b = sc.nextInt();	
						int mult = calc.Mult(a, b);
						System.out.println("Resultado da multiplicação: " + mult); break;
						
					case 5:
						System.out.println("Tchauzinho :(");
						break;
					}
			}
			else {
					System.out.println("Opção invalida!\nDigite uma opção válida!");
					opc = 0;
				 }
			}while(opc < 5);
			}
		}

