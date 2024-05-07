
import java.util.Scanner;

public class ContaTerminal {
	
	
	public static void main(String[] args) {
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor infome o numero da conta: ");
		numeroConta=entrada.nextInt();
		
		System.out.println("Por favor informe o numero da agência bancaria: ");
		agencia=entrada.next();
		
		System.out.println("Por favor informe o primeiro nome do cliente: ");
		nomeCliente=entrada.next();
		
		
		System.out.println("Por favor informe o saldo da conta: ");
		saldo=entrada.nextDouble();
		
		
		
		//nomeCliente=entrada.nextLine();
		
		entrada.close();
		
		
		System.out.println("Olá cliente "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numeroConta+" e o seu Saldo "+ saldo+ 
				" já está disponivel para saque.");
	}

}
