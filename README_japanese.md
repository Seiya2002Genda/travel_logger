# 🌏 Travel Logger - Java GUI 旅行記録アプリ

**Travel Logger** は、日本とアメリカの都道府県／州・都市・移動手段・旅の感想を記録できる、Java SwingベースのGUIアプリケーションです。  
記録はCSVファイルとして保存され、訪問済みの国は地図上に赤くハイライトされます。

---

## 🖼️ スクリーンショット
![image](https://github.com/user-attachments/assets/bd1bdea1-43b4-46f2-acee-8f286d43d6ea)


---

## ✅ 機能一覧

- 日本47都道府県 × 5都市以上
- アメリカ50州＋3準州 × 5都市以上
- 国 → 州/都道府県 → 都市の選択式
- 飛行機・電車・車などの移動手段選択
- 感想（自由入力）
- CSVファイルに記録（`travel_logs.csv`）
- 訪問国を地図上に赤い丸で表示

---

## 📁 ディレクトリ構成

travel_logger/ ├── GUI_main_screen.java ├── GUI_country_map.java ├── city.java ├── country.java ├── State.java ├── transport.java ├── VisitedCountries.java ├── World_Map.jpeg └── travel_logs.csv

yaml
Copy
Edit
## ▶️ 実行方法

javac travel_logger/*.java
java travel_logger.GUI_main_screen

##👤 開発者
Seiya Genda
University of Nebraska at Kearney
Marketing × Computer Science

##📜 ライセンス
MIT License
