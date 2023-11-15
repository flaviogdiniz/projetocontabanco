
public class Principal {

	public static void main(String[] args) {
		
		
		Cliente flavio = new Cliente();
		flavio.setNome("Flavio Diniz");
		flavio.setEndereco("Rua capitao alencar, 50,Belford Roxo, RJ.");
		
		Conta cc = new ContaCorrente(flavio);
		Conta cp = new ContaPoupanca(flavio);
		
		
	
		cc.depositar(200);
		cc.imprimirSaldo();
		
		cc.extratoConta();
		
		cp.depositar(150);
		cp.extratoConta();
		
		
		cc.transferir(30, cp);
		System.out.println("Realizado transferência");
		cp.extratoConta();
		cc.extratoConta();
		
		
		cc.sacar(20);
		System.out.println("Realizado saque");
		cc.imprimirSaldo();
		
		cc.dadosCliente();
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Diniz");
		lucas.setEndereco("Rua Rocha leao, 173, Nova Iguaçu , RJ.");
		
		Conta cclucas = new ContaCorrente(lucas);
		Conta cplucas = new ContaPoupanca(lucas);
		
		cclucas.depositar(500);
		cclucas.extratoConta();
		
		cclucas.dadosCliente();
		
		
		
		
		
		
	}

}
