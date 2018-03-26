package gestionpersonnel;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestPieChart extends JPanel {

    public static void initAndShowGUI() {
        // This method is invoked on the EDT thread
        JFrame frame = new JFrame();
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
       });
    }

    public static void initFX(JFXPanel fxPanel) {
        // This method is invoked on the JavaFX thread
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    public static Scene createScene() {
        Group  root  =  new  Group();
        Scene  scene  =  new  Scene(root);
        Text  text  =  new  Text();

        root.getChildren().add(text);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Mission en cours", 13),
                new PieChart.Data("Mission terminée", 1),
                new PieChart.Data("Mission en Attente", 10));

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Statut des missions");

        ((Group) scene.getRoot()).getChildren().add(chart);
        
        return (scene);
    }
    
   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initAndShowGUI();
            }
        });
    }*/
}