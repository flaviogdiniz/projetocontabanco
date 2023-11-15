import java.util.ArrayList;

public abstract class Conta implements IConta{
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	private static  int AGENCIA_PADRAO = 1;
	
	private static  int SEQUENCIAL = 1;

	
	
	// METODO CONSTRUTOR
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
		
		
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void extratoInfConta() {
		System.out.println("Titular : " + this.cliente.getNome());
		System.out.println("Agencia : " + this.agencia);
		System.out.println("Numero da conta :" + this.numero);
		System.out.println("Saldo conta : " + this.saldo);
	}
	
	protected void dadosCliente() {
		System.out.println("=== Dados do Cliente ===");
		System.out.println("Titular : " + this.cliente.getNome());
		System.out.println("Titular : " + this.cliente.getEndereco());
		
	}
	
}
