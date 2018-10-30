package examples;

import java.util.ArrayList;

public class investmentExamples {

	public static void main(String[] args) {
		Conta conta = new Conta();
		ArrayList <Conta> contaArray = new ArrayList<Conta>();
		
		conta = new Conta();
		conta.setMeses(12);
		conta.setTaxaPrefix(5.4);
		conta.setValorInvest(5000);
		contaArray.add(conta);
		
		
		
		
	}
	
	
}
