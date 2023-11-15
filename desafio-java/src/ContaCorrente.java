
public class ContaCorrente extends Conta  {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("Saldo conta corrente: " + this.saldo);
		
		
	}
	
	public void extratoConta() {
		System.out.println("==== Extrato Conta Corrente ===");
		super.extratoInfConta();
		
	}
	
	
	
}
