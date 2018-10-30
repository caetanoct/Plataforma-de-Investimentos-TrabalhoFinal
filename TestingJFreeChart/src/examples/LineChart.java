package examples;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineChart extends ApplicationFrame {
	
	public LineChart(String applicationTitle, String charTitle) {
		super("Teste");
		JFreeChart lineChart = ChartFactory.createLineChart(
				charTitle,
				"Years", "Number of Schools",
				createDataset(),
				PlotOrientation.VERTICAL,
				true,true,false
				);
		
		 ChartPanel chartPanel = new ChartPanel( lineChart );
	      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
	      setContentPane( chartPanel );
		
	} 
	
	private DefaultCategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		  dataset.addValue( 15 , "schools" , "1970" );
	      dataset.addValue( 30 , "schools" , "1980" );
	      dataset.addValue( 60 , "schools" ,  "1990" );
	      dataset.addValue( 120 , "schools" , "2000" );
	      dataset.addValue( 240 , "schools" , "2010" );
	      dataset.addValue( 500 , "schools" , "2014" );
		return dataset;
		
	};
	
	public static void main(String[] args) {
		LineChart window = new LineChart("School Vs Years", "School Vs Years");
		window.pack( );
	    RefineryUtilities.centerFrameOnScreen( window );
	    window.setVisible( true );
		
	}

}
