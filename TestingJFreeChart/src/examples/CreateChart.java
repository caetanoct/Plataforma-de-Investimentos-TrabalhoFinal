package examples;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class CreateChart {

	public CreateChart() {
		
	}
	
	public JFreeChart criaGrafico(Conta conta) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for(int i = 0; i < conta.getAnos(); i++) {  // Cria um valor para o dataset a cada ano.
			double montante = conta.getValorInvest() * Math.pow((1 + (conta.getTaxaPrefix()/100)),i); // M = C(1+i)^t  t = ano
			System.out.println(montante);
			dataset.addValue(montante,"Anos",""+i); // Valor investido, Montante e anos.
			
		}
		
		JFreeChart lineChart = ChartFactory.createLineChart(
				"Juros composto",
				"Anos","Montante",
				dataset,
				PlotOrientation.VERTICAL,
				true,true,false
				);
			
		return lineChart;
	}
	
	
	
}
