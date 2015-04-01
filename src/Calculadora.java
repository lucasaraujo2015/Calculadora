import java.util.Scanner;


public class Calculadora {
public static void main(String args[]){
	Scanner leitor = new Scanner(System.in);
	String conta;
	double num1,num2;
	System.out.println("Bem vindo a calculadora!\n\n");
	conta = leitor.next();
	num1 = leitor.nextDouble();
	num2 = leitor.nextDouble();
	if(conta.contains("+")){
	System.out.println(" = "+soma(num1,num2));
	}
	if(conta.contains("-")){
		System.out.println(" = "+sub(num1,num2));	
	}
	if(conta.contains("*")){
		System.out.println(" = "+mult(num1,num2));	
	}
	if(conta.contains("/")){
		System.out.println(" = "+div(num1,num2));	
	}
}

private static double div(double num1, double num2) {
	// TODO Auto-generated method stub
	return num1/num2;
}

private static double mult(double num1, double num2) {
	// TODO Auto-generated method stub
	return num1*num2;
}

private static double sub(double num1, double num2) {
	// TODO Auto-generated method stub
	return num1-num2;
}

private static double soma(double num1, double num2) {
	// TODO Auto-generated method stub
	return num1+num2;
}
}
