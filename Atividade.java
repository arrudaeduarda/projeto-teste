package primeiro_projeto;
import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		//Variáveis
		String nome,idade;
		//Instanciar classe Scanner
		Scanner ler =  new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe seu nome: ");
		nome = ler.next();

		System.out.println("Informe sua idade: ");
		idade = ler.next();

		//Saída
		System.out.println("Olá, " + nome + " você tem " + idade + " anos" );



	}

}
