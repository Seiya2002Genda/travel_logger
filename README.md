# Travel Logger

# 🌏 Travel Logger - Java GUI Travel Journal App

**Travel Logger** is a Java Swing-based GUI application that allows users to record travel data such as prefectures/states, cities, modes of transportation, and personal impressions for Japan and the United States.  
Logs are saved to a CSV file, and visited countries are visually highlighted in red on a world map.


## 🖼️ Screenshot
![image](https://github.com/user-attachments/assets/bd1bdea1-43b4-46f2-acee-8f286d43d6ea)


## ✅ Features

- Supports all 47 Japanese prefectures with 5+ major cities each  
- Covers all 50 U.S. states + 3 territories with 5+ cities each  
- Cascading selection: Country → State/Prefecture → City  
- Selectable transportation methods (Plane, Train, Car, etc.)  
- Free-text travel impressions  
- Travel logs are saved as CSV (`travel_logs.csv`)  
- Visited countries are marked in red on a world map

## 📁 Project Structure

travel_logger/
├── GUI_main_screen.java
├── GUI_country_map.java
├── city.java
├── country.java
├── State.java
├── transport.java 
├── VisitedCountries.java 
├── World_Map.jpeg 
└── travel_logs.csv

## ▶️ How to Run

javac travel_logger/*.java
java travel_logger.GUI_main_screen

##👤 Developer
Seiya Genda
University of Nebraska at Kearney
Marketing × Computer Science

##📜 License
MIT License
