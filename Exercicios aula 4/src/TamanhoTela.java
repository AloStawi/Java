/**
  * @author: Isabelle Nascimento de Oliveira
  * GitHub: https://github.com/AloStawi
  * @since: 14/02/2022
*/

import java.awt.Dimension;
import java.awt.Toolkit;

public class TamanhoTela {
	public static void main(String[] args) {
		
		Dimension Tamanho = Toolkit.getDefaultToolkit().getScreenSize();
		double largura = Tamanho.getWidth();
		double altura = Tamanho.getHeight();
		
		System.out.print("------- RESOLUÇÃO DO SISTEMA -------");
		System.out.printf("\nAltura: %.0f \nLargura: %.0f", altura, largura);

	}

}
