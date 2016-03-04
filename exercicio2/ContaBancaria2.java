public class ContaBancaria2 {
	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	
	public void imprimirSaldo() {
		System.out.println ("Saldo: " + this.saldo);
	}
	
	public void imprimirSaldoTotal() {
		System.out.println ("Saldo Total: " + this.saldo + this.limiteExtra);
	}

	public void imprimirAgencia() {
		System.out.println ("A Agencia é: " + this.agencia);
	}
	
	public void imprimirContaCorrente() {
		System.out.println ("A Conta Corrente é: " + this.contaCorrente);
	}
	
	public void imprimirTitular() {
		System.out.println ("O titular da conta é: " + this.titularConta);
	}
	
	public static void main(String [] args) {
	
		ContaBancaria2 obA = new ContaBancaria2();
	  System.out.println("Objeto B: ");
		obA.agencia = 3610;
		obA.contaCorrente = 15766;
		obA.saldo = 35.54;
		obA.limiteExtra = 50;
		obA.titularConta = "Titular A";
		obA.imprimirTitular();
		obA.imprimirAgencia();
		obA.imprimirContaCorrente();
		obA.imprimirSaldo();
		obA.imprimirSaldoTotal();
		
		ContaBancaria2 obB = new ContaBancaria2();
    System.out.println("Objeto A: ");
		obB.agencia = 810;
		obB.contaCorrente = 6132;
		obB.saldo = 42.31;
		obB.limiteExtra = 75.00;
		obB.titularConta = "Titular B";
		obB.imprimirTitular();
		obB.imprimirAgencia();
		obB.imprimirContaCorrente();
		obB.imprimirSaldo();
		obB.imprimirSaldoTotal();
	}
}
