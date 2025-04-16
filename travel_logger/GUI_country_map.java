package travel_logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GUI_country_map extends JFrame {

    private BufferedImage mapImage;
    private final Map<String, Point> countryCoordinates = new HashMap<>();

    public GUI_country_map() {
        setTitle("Visited Countries Map");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {
            mapImage = ImageIO.read(new File("world_map.png"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not Found world_map.png", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        countryCoordinates.put("Japan", new Point(545, 195));
        countryCoordinates.put("USA", new Point(140, 180));
        countryCoordinates.put("France", new Point(360, 150));
        countryCoordinates.put("India", new Point(460, 220));

        setContentPane(new MapPanel());
        setVisible(true);
    }

    class MapPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(mapImage, 0, 0, getWidth(), getHeight(), null);

            for (String country : VisitedCountries.getAllVisited()) {
                Point p = countryCoordinates.get(country);
                if (p != null) {
                    g.setColor(Color.RED);
                    g.fillOval(p.x - 5, p.y - 5, 10, 10);
                }
            }
        }
    }
}
