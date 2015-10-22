package kata3;


import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramaDisplay extends ApplicationFrame {

    public HistogramaDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram de dominios", "DOMINIOS", "Nº email", dataset, PlotOrientation.VERTICAL, true, true, false);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "ENE", "gmail.com");
        dataset.addValue(7, "ENE", "ulpgc.es");
        dataset.addValue(4, "ENE", "ull.es");
        dataset.addValue(8, "ENE", "hotmail.com");
        dataset.addValue(1, "FEB", "gmail.com");
        dataset.addValue(0, "FEB", "ulpgc.es");
        dataset.addValue(-10, "FEB", "ull.es");
        dataset.addValue(6, "FEB", "hotmail.com");
        dataset.addValue(20, "MAR", "gmail.com");
        dataset.addValue(15, "MAR", "ulpgc.es");
        dataset.addValue(8, "MAR", "ull.es");
        dataset.addValue(2, "MAR", "hotmail.com");
        return dataset;
    }
}
