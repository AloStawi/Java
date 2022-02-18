/**
  * @author: Isabelle Nascimento de Oliveira
  * GitHub: https://github.com/AloStawi
  * @since: 14/02/2022
*/

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Idade {

	public static void main(String[] args) {
		System.out.print("Informe o ano que você nasceu: ");
		Scanner sc = new Scanner(System.in);
		int anoN = sc.nextInt();
		
		Date data = new Date();
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        String anoA = ano.format(data);
        
        int anoA2 = Integer.parseInt(anoA);
        
        int idade = (anoA2 - anoN);
        System.out.println("Sua idade é: " + idade);
	}

}
