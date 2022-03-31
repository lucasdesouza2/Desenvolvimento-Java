package semana2;
import java.util.Scanner;
public class Exercicios1a3 {
	public static void main (String args[]) {
	/*Faça um programa que leia um nome de usuário * e a sua senha e não aceite a senha igual 
	 * ao nome do usuário,mostrando uma mensagem de erro e voltando a pedir as informações.*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("==== Cadastro de Usuário ====");
		System.out.println("Digite o seu nome de usuário: ");
		String nome = teclado.next();
		System.out.println("Defina uma senha para login:");
		String senha = teclado.next();
		
			while (senha.equals(nome)) {
				System.out.println("ERRO!");
				System.out.println("Digite uma senha diferente do nome de usuário: "+"("+nome+")");
				senha = teclado.next();
			}
		
		System.out.println("Cadastro realizado com sucesso");
		System.out.println("Login:"+nome+"\nSenha:"+senha);
		System.out.println("Deseja efetuar o login?");
		char op = teclado.next().charAt(0);
		if (op=='s') {
			System.out.println("Usuário: ");
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
