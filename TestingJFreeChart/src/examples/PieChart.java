package examples;
import java.text.DecimalFormat;

import javax.swing.JPanel;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PiePlot;

public class PieChart extends ApplicationFrame{

	public PieChart() {
		super("Example Pie Chart");
		setContentPane(createDemoPanel());
		
	}
	
	private static PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Iphone 5s", new Double(20));
		dataset.setValue("Samsung S7", new Double(40));
		dataset.setValue("MotoG", new Double(30));
		return dataset;
	}
	
	private static JFreeChart createChart(PieDataset dataset) {
		JFreeChart chart = ChartFactory.createPieChart(
				"Vendas Mobile",
				dataset,
				true,
				true,
				true);
		
		
		  PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
			        "Marks {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
			    
		  ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);
		return chart;
	}
	
	public static JPanel createDemoPanel() {
		JFreeChart chart = createChart(createDataset());
		return new ChartPanel(chart);
	}
	
	public static void main(String[] args) {
		PieChart 	demo = new PieChart();
		demo.setSize(500, 500);
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
}
