package examples;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class InvestmentExamples extends ApplicationFrame{

	public InvestmentExamples(String applicationTitle, String charTitle) {
		super("AAAAA");
		Conta conta = new Conta();
		CreateChart createChart = new CreateChart();
		ArrayList <Conta> contaArray = new ArrayList<Conta>();
		conta = new Conta();
		conta.setAnos(25);
		conta.setTaxaPrefix(5.4);
		conta.setValorInvest(1000);
		contaArray.add(conta);
		
		ChartPanel chartPanel = new ChartPanel( createChart.criaGrafico(contaArray.get(0)));
	    chartPanel.setPreferredSize( new java.awt.Dimension( 1000 , 400 ) );
	    setContentPane( chartPanel );
	      
	}
	
	public static void main(String[] args) {
		InvestmentExamples window = new InvestmentExamples("Montante", "Anos");
		window.pack( );
	    RefineryUtilities.centerFrameOnScreen( window );
	    window.setVisible( true );
		
	}
	
	
}
