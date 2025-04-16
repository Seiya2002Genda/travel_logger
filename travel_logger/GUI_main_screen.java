package travel_logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;

public class GUI_main_screen extends JFrame {

    private JComboBox<String> countryComboBox;
    private JComboBox<String> stateComboBox;
    private JComboBox<String> cityComboBox;
    private JComboBox<String> transportComboBox;
    private JTextArea notesArea;
    private final ArrayList<String> travelLogs = new ArrayList<>();

    public GUI_main_screen() {
        setTitle("Travel Logger");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel bgPanel = new BackgroundPanel("World_Map.jpeg");
        bgPanel.setLayout(null);
        bgPanel.setPreferredSize(getSize());
        setContentPane(bgPanel);
        pack();

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 30, 100, 25);
        bgPanel.add(countryLabel);

        countryComboBox = new JComboBox<>(country.getCountryList());
        countryComboBox.setBounds(150, 30, 150, 25);
        bgPanel.add(countryComboBox);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setBounds(320, 30, 100, 25);
        bgPanel.add(stateLabel);

        stateComboBox = new JComboBox<>();
        stateComboBox.setBounds(420, 30, 150, 25);
        bgPanel.add(stateComboBox);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 70, 100, 25);
        bgPanel.add(cityLabel);

        cityComboBox = new JComboBox<>();
        cityComboBox.setBounds(150, 70, 150, 25);
        bgPanel.add(cityComboBox);

        JLabel transportLabel = new JLabel("Transport:");
        transportLabel.setBounds(320, 70, 100, 25);
        bgPanel.add(transportLabel);

        transportComboBox = new JComboBox<>(transport.getTransportOptions());
        transportComboBox.setBounds(420, 70, 150, 25);
        bgPanel.add(transportComboBox);

        JLabel notesLabel = new JLabel("About Your Trip:");
        notesLabel.setBounds(50, 110, 100, 25);
        bgPanel.add(notesLabel);

        notesArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notesArea);
        scrollPane.setBounds(150, 110, 420, 100);
        bgPanel.add(scrollPane);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(320, 230, 100, 30);
        saveButton.addActionListener(this::saveEntry);
        bgPanel.add(saveButton);

        JButton showLogsButton = new JButton("View Logs");
        showLogsButton.setBounds(440, 230, 150, 30);
        showLogsButton.addActionListener(ev -> showCSVLogs());
        bgPanel.add(showLogsButton);

        updateStateList();
        updateCityList();

        countryComboBox.addActionListener(e -> {
            updateStateList();
            updateCityList();
        });

        stateComboBox.addActionListener(e -> {
            String selectedCountry = (String) countryComboBox.getSelectedItem();
            String selectedState = (String) stateComboBox.getSelectedItem();
            if (selectedCountry != null && selectedState != null) {
                String[] cities = city.getCitiesByState(selectedCountry, selectedState);
                cityComboBox.setModel(new DefaultComboBoxModel<>(cities));
                cityComboBox.setEnabled(true);
            }
        });

        setVisible(true);
    }

    private void updateStateList() {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        stateComboBox.removeAllItems();
        for (String state : State.getStatesByCountry(selectedCountry)) {
            stateComboBox.addItem(state);
        }
    }

    private void updateCityList() {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        cityComboBox.removeAllItems();
        for (String cityName : city.getCitiesByCountry(selectedCountry)) {
            cityComboBox.addItem(cityName);
        }
    }

    private void saveEntry(ActionEvent e) {
        String country = (String) countryComboBox.getSelectedItem();
        String state = (String) stateComboBox.getSelectedItem();
        String city = (String) cityComboBox.getSelectedItem();
        String transport = (String) transportComboBox.getSelectedItem();
        String notes = notesArea.getText().trim();

        if (country == null || city == null || transport == null || notes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill out all Filed", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String entry = country + "," + state + "," + city + "," + transport + "," + notes;
        travelLogs.add(entry);
        VisitedCountries.markVisited(country);
        notesArea.setText("");
        JOptionPane.showMessageDialog(this, "Success!! Saved to CSV");

        try (FileWriter writer = new FileWriter("travel_logs.csv", true)) {
            writer.write(entry + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving to CSV file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showCSVLogs() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("travel_logs.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            content.append("Not found log file.");
        }

        JTextArea textArea = new JTextArea(content.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(600, 400));

        JOptionPane.showMessageDialog(this, scrollPane, "List Trip Logs（CSV）", JOptionPane.INFORMATION_MESSAGE);
    }

    static class BackgroundPanel extends JPanel {
        private BufferedImage bgImage;

        public BackgroundPanel(String imagePath) {
            try {
                bgImage = ImageIO.read(getClass().getResource("/" + imagePath));
            } catch (Exception e) {
                System.err.println("Failed to load background picture: " + e.getMessage());
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (bgImage != null) {
                g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main(String[] args) {
        new GUI_main_screen();
    }
}