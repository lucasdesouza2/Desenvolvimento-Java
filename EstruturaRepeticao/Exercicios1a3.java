package semana2;
import java.util.Scanner;
public class Exercicios1a3 {
	public static void main (String args[]) {
	/*Fa�a um programa que leia um nome de usu�rio * e a sua senha e n�o aceite a senha igual 
	 * ao nome do usu�rio,mostrando uma mensagem de erro e voltando a pedir as informa��es.*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("==== Cadastro de Usu�rio ====");
		System.out.println("Digite o seu nome de usu�rio: ");
		String nome = teclado.next();
		System.out.println("Defina uma senha para login:");
		String senha = teclado.next();
		
			while (senha.equals(nome)) {
				System.out.println("ERRO!");
				System.out.println("Digite uma senha diferente do nome de usu�rio: "+"("+nome+")");
				senha = teclado.next();
			}
		
		System.out.println("Cadastro realizado com sucesso");
		System.out.println("Login:"+nome+"\nSenha:"+senha);
		System.out.println("Deseja efetuar o login?");
		char op = teclado.next().charAt(0);
		if (op=='s') {
			System.out.println("Usu�rio: ");
			String login = teclado.next();
			System.out.println("Senha:");
			String password = teclado.next();
				if(login.equals(nome) && password.equals(senha)) {
					System.out.println(" Login efetuado com sucesso!");
				}
			
		}
		else {
			System.out.println("Boa noite!");
		}
		
	}

	


}
