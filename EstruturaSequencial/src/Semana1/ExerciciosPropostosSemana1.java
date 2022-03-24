package src.Semana1;
import java.util.Scanner;
public class ExerciciosPropostosSemana1 {
 public static void main (String []args) {
	 Scanner leia =new Scanner (System.in);
	 System.out.println("Qual exercício deseja verificar?\n-------\n[1]-CONVERSÃO DE TEMPERATURA\n[2]-EQUAÇÕES\n[3]-PESO IDEAL");
	 int opcao = leia.nextInt();
	 switch(opcao){
	 	case 1:{
	 		 /*Faça um Programa que peça a temperatura em graus Fahrenheit,
	 		  * transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9)*/
	 		 	System.out.println("======= CONVERSÃO DE TEMPERATURA =======");
	 			 System.out.println("Digite a temperatura em graus farenheint");
	 			 double farenheint = leia.nextDouble();
	 			 double celsius = (farenheint-32)*5/9;
	 			 System.out.println(farenheint+"° graus em farenheint são iguais a "+celsius+"° graus Celsius");
	 			 System.out.println("========================================");
	 			 break;
	 	}
	 	case 2:{
				 /*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
				  * - O produto do dobro do primeiro com metade do segundo. 
				  * - A soma do triplo do primeiro com o terceiro. 
				  * - O terceiro elevado ao cubo.*/
				 System.out.println("======= EQUAÇÕES =======");
				 System.out.println("Digite o primeiro número inteiro:");
				 float n1 = leia.nextFloat();
				 System.out.println("Digite o segundo número inteiro:");
				 float n2 = leia.nextFloat();
				 System.out.println("Digite um número real:");
				 float n3 = leia.nextFloat();
				 float equacao1 = (n1*2)*(n2/2);
				 float equacao2 = (n1*3)+n3;
				 float equacao3 = (n3*n3)*n3;
				 System.out.println("O dobro de "+n1+" é "+"("+n1*2+"),"+" multiplicado pela metade de "+n2+" ("+n2/2+")"+" é igual a: "+equacao1);
				 System.out.println("O triplo de "+n1+"("+n1*3+")"+" somado a "+n3+" é igual a: "+equacao2);
				 System.out.println("O terceiro número"+"("+n3+")"+"elevado ao cubo é: "+equacao3);
				 System.out.println("========================================");
				 break;
	 	}
	 	case 3:{
	 		 System.out.println("======= PESO IDEAL =======");
			 /*Tendo como dados de entrada a altura de uma pessoa, 
			 * construa um algoritmo que calcule seu peso ideal, 
			 * usando a seguinte fórmula: (72.7*altura)-58.
			 * Para mulheres: (62.1*h) - 44.7*/
			 System.out.println("Digite a sua altura em Metros ex: (1,79) ");
			 double altura = leia.nextFloat();
			 System.out.println("Qual o seu sexo \n[m] para masculino\n[f] para feminino");
			 char sexo = leia.next().charAt(0);
			 if (sexo == 1) {
				 double imc = (72.7*altura)-58;
				 System.out.println("Com base na sua altura"+"("+altura+"),"+"seu peso ideal é de "+imc+" Quilos");
			 }
			 else {
				 double imc = (62.1*altura)-44.7;
				 System.out.println("Seu peso ideal é de "+imc+" Quilos");
			 }
			 System.out.println("========================================");
			 break;
	 	}
		
	 	default:{
			System.out.println("OPÇÃO INVÁLIDA! REINICIE O PROGRAMA E DIGITE AS OPÇÕES [1] [2] OU [3]");
		}
	 }
	 
 }
}
