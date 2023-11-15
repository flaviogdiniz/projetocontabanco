
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("Saldo conta poupança: " + this.saldo);
		
		
		}
	
	public void extratoConta() {
		System.out.println("==== Extrato Conta Poupança ===");
		super.extratoInfConta();
		
	}

}