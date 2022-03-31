package ExercicioSemana1;
import java.util.Scanner;
public class ExerciciosPropostosSemana1 {

	public static void main(String[] args) {
		Scanner leia =new Scanner (System.in);
		 System.out.println("Qual exerc�cio deseja verificar?\n-------\n[1]-CONVERS�O DE TEMPERATURA\n[2]-EQUA��ES\n[3]-PESO IDEAL");
		 int opcao = leia.nextInt();
		 switch(opcao){
		 	case 1:{
		 		 /*Fa�a um Programa que pe�a a temperatura em graus Fahrenheit,
		 		  * transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9)*/
		 		 	System.out.println("======= CONVERS�O DE TEMPERATURA =======");
		 			 System.out.println("Digite a temperatura em graus farenheint");
		 			 double farenheint = leia.nextDouble();
		 			 double celsius = (farenheint-32)*5/9;
		 			 System.out.println(farenheint+"� graus em farenheint s�o iguais a "+celsius+"� graus Celsius");
		 			 System.out.println("========================================");
		 			 break;
		 	}
		 	case 2:{
					 /*Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre: 
					  * - O produto do dobro do primeiro com metade do segundo. 
					  * - A soma do triplo do primeiro com o terceiro. 
					  * - O terceiro elevado ao cubo.*/
					 System.out.println("======= EQUA��ES =======");
					 System.out.println("Digite o primeiro n�mero inteiro:");
					 float n1 = leia.nextFloat();
					 System.out.println("Digite o segundo n�mero inteiro:");
					 float n2 = leia.nextFloat();
					 System.out.println("Digite um n�mero real:");
					 float n3 = leia.nextFloat();
					 float equacao1 = (n1*2)*(n2/2);
					 float equacao2 = (n1*3)+n3;
					 float equacao3 = (n3*n3)*n3;
					 System.out.println("O dobro de "+n1+" � "+"("+n1*2+"),"+" multiplicado pela metade de "+n2+" ("+n2/2+")"+" � igual a: "+equacao1);
					 System.out.println("O triplo de "+n1+"("+n1*3+")"+" somado a "+n3+" � igual a: "+equacao2);
					 System.out.println("O terceiro n�mero"+"("+n3+")"+"elevado ao cubo �: "+equacao3);
					 System.out.println("========================================");
					 break;
		 	}
		 	case 3:{
		 		 System.out.println("======= PESO IDEAL =======");
				 /*Tendo como dados de entrada a altura de uma pessoa, 
				 * construa um algoritmo que calcule seu peso ideal, 
				 * usando a seguinte f�rmula: (72.7*altura)-58.
				 * Para mulheres: (62.1*h) - 44.7*/
				 System.out.println("Digite a sua altura em Metros ex: (1,79) ");
				 double altura = leia.nextFloat();
				 System.out.println("Qual o seu sexo \n[m] para masculino\n[f] para feminino");
				 char sexo = leia.next().charAt(0);
				 if (sexo == 'm') {
					 double imc = (72.7*altura)-58;
					 System.out.println("Com base na sua altura"+"("+altura+"),"+"seu peso ideal � de "+imc+" Quilos");
				 }
				 else {
					 double imc = (62.1*altura)-44.7;
					 System.out.println("Seu peso ideal � de "+imc+" Quilos");
				 }
				 System.out.println("========================================");
				 break;
		 	}
			
		 	default:{
				System.out.println("OP��O INV�LIDA! REINICIE O PROGRAMA E DIGITE AS OP��ES [1] [2] OU [3]");
			}
		 }



	}

}
