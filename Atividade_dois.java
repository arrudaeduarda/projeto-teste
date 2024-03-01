package primeiro_projeto;
import java.util.Scanner;


public class Atividade_dois {

	public static void main(String[] args) {
		// Variáveis
		double horatrab,valorhora,salbruto,salliquído,inss;
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe seu horário de trabalho: ");
		horatrab = ler.nextDouble();
		
		System.out.println("Informe o valor pago a você por hora de trabalho: ");
		valorhora = ler.nextDouble();
		
		//Processamento
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquído = salbruto - inss;
				
	    //Saída
				System.out.println("O valor do salário bruto é: " + salbruto);
				System.out.println("O valor do salário líquido é: " + salliquído);
			
			
				





	}

}
