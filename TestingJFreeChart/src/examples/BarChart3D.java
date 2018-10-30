package examples;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

public class BarChart3D extends JFrame{

	public BarChart3D() throws IOException{
		try {
			String fait = "fait";
			String audi = "audi";
			String ford = "ford";
			String speed ="speed";
			String popular = "popular";
			String mailage = "mailage";
			String userrating = "User rating";
			String safety = "safety";
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			
			dataset.addValue(1.0, fait, speed);
			dataset.addValue(4.0, fait, popular);
			dataset.addValue(3.0, fait, userrating);
			dataset.addValue(3.0, fait, mailage);
			dataset.addValue(5.0, fait, safety);
			
			dataset.addValue(5.0, audi, speed);
			dataset.addValue(7.0, audi, popular);
			dataset.addValue(6.0, audi, userrating);
			dataset.addValue(3.0, audi, mailage);
			dataset.addValue(4.0, audi, safety);
			
			dataset.addValue(4.0, ford, speed);
			dataset.addValue(4.0, ford, popular);
			dataset.addValue(4.0, ford, userrating);
			dataset.addValue(4.0, ford, mailage);
			dataset.addValue(4.0, ford, safety);
			
			JFreeChart barChart = ChartFactory.createBarChart3D(
					"Car Usage Statistics", 
					"Category", 
					"Score", 
					dataset,
					PlotOrientation.VERTICAL,
					true, true, false);
			
			ChartPanel chartOnPanel = new ChartPanel(barChart);
			JPanel panel = new JPanel();
			panel.add(chartOnPanel);
			add(panel);
			
			// Salvando arquivo em jpeg.
			int width = 640;
			int height = 480;
			File BarChart3D = new File("barChart3D.jpeg");
			ChartUtilities.saveChartAsJPEG(BarChart3D, barChart, width, height);
			} catch(IOException e) {
				System.err.println("Ocorreu um erro na hora de salvar.");
			};
	}
	
	
	public static void main(String[] args) throws IOException {
		BarChart3D window = new BarChart3D();
		window.setSize(700, 480);
		RefineryUtilities.centerFrameOnScreen(window);
		window.setVisible(true);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
