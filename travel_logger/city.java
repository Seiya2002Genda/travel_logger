package travel_logger;

import java.util.HashMap;

public class city {
    private static final HashMap<String, String[]> cityMap = new HashMap<>();
    private static final HashMap<String, HashMap<String, String[]>> countryStateCityMap = new HashMap<>();

    static {
        cityMap.put("France", new String[]{"Paris", "Lyon", "Marseille"});
        cityMap.put("India", new String[]{"Delhi", "Mumbai", "Bangalore"});
        cityMap.put("United Kingdom", new String[]{"London", "Manchester", "Edinburgh"});

        HashMap<String, String[]> usMap = new HashMap<>();
        usMap.put("Alabama", new String[]{"Birmingham", "Montgomery", "Mobile", "Huntsville", "Tuscaloosa"});
        usMap.put("Alaska", new String[]{"Anchorage", "Fairbanks", "Juneau", "Sitka", "Ketchikan"});
        usMap.put("Arizona", new String[]{"Phoenix", "Tucson", "Mesa", "Chandler", "Scottsdale"});
        usMap.put("Arkansas", new String[]{"Little Rock", "Fort Smith", "Fayetteville", "Springdale", "Jonesboro"});
        usMap.put("California", new String[]{"Los Angeles", "San Diego", "San Jose", "San Francisco", "Fresno"});
        usMap.put("Colorado", new String[]{"Denver", "Colorado Springs", "Aurora", "Fort Collins", "Lakewood"});
        usMap.put("Connecticut", new String[]{"Bridgeport", "New Haven", "Stamford", "Hartford", "Waterbury"});
        usMap.put("Delaware", new String[]{"Wilmington", "Dover", "Newark", "Middletown", "Smyrna"});
        usMap.put("Florida", new String[]{"Miami", "Tampa", "Orlando", "Jacksonville", "Tallahassee"});
        usMap.put("Georgia", new String[]{"Atlanta", "Augusta", "Columbus", "Savannah", "Athens"});
        usMap.put("Hawaii", new String[]{"Honolulu", "Hilo", "Kailua", "Kapolei", "Pearl City"});
        usMap.put("Idaho", new String[]{"Boise", "Meridian", "Nampa", "Idaho Falls", "Pocatello"});
        usMap.put("Illinois", new String[]{"Chicago", "Aurora", "Naperville", "Joliet", "Rockford"});
        usMap.put("Indiana", new String[]{"Indianapolis", "Fort Wayne", "Evansville", "South Bend", "Carmel"});
        usMap.put("Iowa", new String[]{"Des Moines", "Cedar Rapids", "Davenport", "Sioux City", "Iowa City"});
        usMap.put("Kansas", new String[]{"Wichita", "Overland Park", "Kansas City", "Olathe", "Topeka"});
        usMap.put("Kentucky", new String[]{"Louisville", "Lexington", "Bowling Green", "Owensboro", "Covington"});
        usMap.put("Louisiana", new String[]{"New Orleans", "Baton Rouge", "Shreveport", "Lafayette", "Lake Charles"});
        usMap.put("Maine", new String[]{"Portland", "Lewiston", "Bangor", "South Portland", "Auburn"});
        usMap.put("Maryland", new String[]{"Baltimore", "Columbia", "Germantown", "Silver Spring", "Frederick"});
        usMap.put("Massachusetts", new String[]{"Boston", "Worcester", "Springfield", "Lowell", "Cambridge"});
        usMap.put("Michigan", new String[]{"Detroit", "Grand Rapids", "Warren", "Sterling Heights", "Ann Arbor"});
        usMap.put("Minnesota", new String[]{"Minneapolis", "St. Paul", "Rochester", "Duluth", "Bloomington"});
        usMap.put("Mississippi", new String[]{"Jackson", "Gulfport", "Southaven", "Hattiesburg", "Biloxi"});
        usMap.put("Missouri", new String[]{"Kansas City", "St. Louis", "Springfield", "Columbia", "Independence"});
        usMap.put("Montana", new String[]{"Billings", "Missoula", "Great Falls", "Bozeman", "Butte"});
        usMap.put("Nebraska", new String[]{"Omaha", "Lincoln", "Bellevue", "Grand Island", "Kearney"});
        usMap.put("Nevada", new String[]{"Las Vegas", "Henderson", "Reno", "North Las Vegas", "Sparks"});
        usMap.put("New Hampshire", new String[]{"Manchester", "Nashua", "Concord", "Dover", "Rochester"});
        usMap.put("New Jersey", new String[]{"Newark", "Jersey City", "Paterson", "Elizabeth", "Edison"});
        usMap.put("New Mexico", new String[]{"Albuquerque", "Las Cruces", "Rio Rancho", "Santa Fe", "Roswell"});
        usMap.put("New York", new String[]{"New York City", "Buffalo", "Rochester", "Yonkers", "Syracuse"});
        usMap.put("North Carolina", new String[]{"Charlotte", "Raleigh", "Greensboro", "Durham", "Winston-Salem"});
        usMap.put("North Dakota", new String[]{"Fargo", "Bismarck", "Grand Forks", "Minot", "West Fargo"});
        usMap.put("Ohio", new String[]{"Columbus", "Cleveland", "Cincinnati", "Toledo", "Akron"});
        usMap.put("Oklahoma", new String[]{"Oklahoma City", "Tulsa", "Norman", "Broken Arrow", "Lawton"});
        usMap.put("Oregon", new String[]{"Portland", "Eugene", "Salem", "Gresham", "Hillsboro"});
        usMap.put("Pennsylvania", new String[]{"Philadelphia", "Pittsburgh", "Allentown", "Erie", "Reading"});
        usMap.put("Rhode Island", new String[]{"Providence", "Warwick", "Cranston", "Pawtucket", "East Providence"});
        usMap.put("South Carolina", new String[]{"Charleston", "Columbia", "North Charleston", "Mount Pleasant", "Rock Hill"});
        usMap.put("South Dakota", new String[]{"Sioux Falls", "Rapid City", "Aberdeen", "Brookings", "Watertown"});
        usMap.put("Tennessee", new String[]{"Nashville", "Memphis", "Knoxville", "Chattanooga", "Clarksville"});
        usMap.put("Texas", new String[]{"Houston", "San Antonio", "Dallas", "Austin", "Fort Worth"});
        usMap.put("Utah", new String[]{"Salt Lake City", "West Valley City", "Provo", "West Jordan", "Orem"});
        usMap.put("Vermont", new String[]{"Burlington", "South Burlington", "Rutland", "Barre", "Montpelier"});
        usMap.put("Virginia", new String[]{"Virginia Beach", "Norfolk", "Chesapeake", "Richmond", "Newport News"});
        usMap.put("Washington", new String[]{"Seattle", "Spokane", "Tacoma", "Vancouver", "Bellevue"});
        usMap.put("West Virginia", new String[]{"Charleston", "Huntington", "Morgantown", "Parkersburg", "Wheeling"});
        usMap.put("Wisconsin", new String[]{"Milwaukee", "Madison", "Green Bay", "Kenosha", "Racine"});
        usMap.put("Wyoming", new String[]{"Cheyenne", "Casper", "Laramie", "Gillette", "Rock Springs"});
        countryStateCityMap.put("United States", usMap);

        HashMap<String, String[]> jpMap = new HashMap<>();
        String[][] jpPrefectures = {
                {"Hokkaido", "Sapporo", "Asahikawa", "Hakodate", "Obihiro", "Kushiro"},
                {"Aomori", "Aomori", "Hirosaki", "Goshogawara", "Towada", "Misawa"},
                {"Iwate", "Morioka", "Ichinoseki", "Miyako", "Hanamaki", "Kamaishi"},
                {"Miyagi", "Sendai", "Ishinomaki", "Shiogama", "Tagajo", "Tome"},
                {"Akita", "Akita", "Odate", "Yokote", "Noshiro", "Daisen"},
                {"Yamagata", "Yamagata", "Sakata", "Tsuruoka", "Tendo", "Shinjo"},
                {"Fukushima", "Fukushima", "Koriyama", "Iwaki", "Aizuwakamatsu", "Sukagawa"},
                {"Ibaraki", "Mito", "Tsuchiura", "Hitachi", "Ushiku", "Hitachinaka"},
                {"Tochigi", "Utsunomiya", "Ashikaga", "Sano", "Oyama", "Tochigi"},
                {"Gunma", "Maebashi", "Takasaki", "Ota", "Isesaki", "Kiryu"},
                {"Saitama", "Saitama", "Kawaguchi", "Koshigaya", "Tokorozawa", "Kawagoe"},
                {"Chiba", "Chiba", "Funabashi", "Kashiwa", "Ichikawa", "Matsudo"},
                {"Tokyo", "Shinjuku", "Shibuya", "Setagaya", "Toshima", "Minato"},
                {"Kanagawa", "Yokohama", "Kawasaki", "Sagamihara", "Fujisawa", "Yamato"},
                {"Niigata", "Niigata", "Nagaoka", "Joetsu", "Sanjo", "Kashiwazaki"},
                {"Toyama", "Toyama", "Takaoka", "Imizu", "Tonami", "Nanto"},
                {"Ishikawa", "Kanazawa", "Hakusan", "Nanao", "Komatsu", "Kaga"},
                {"Fukui", "Fukui", "Sakai", "Tsuruga", "Obama", "Echizen"},
                {"Yamanashi", "Kofu", "Fujiyoshida", "Minami-Alps", "Nirasaki", "Uenohara"},
                {"Nagano", "Nagano", "Matsumoto", "Ueda", "Suzaka", "Iida"},
                {"Gifu", "Gifu", "Ogaki", "Tajimi", "Kakamigahara", "Minokamo"},
                {"Shizuoka", "Shizuoka", "Hamamatsu", "Fujieda", "Numazu", "Fuji"},
                {"Aichi", "Nagoya", "Toyota", "Okazaki", "Ichinomiya", "Kasugai"},
                {"Mie", "Tsu", "Yokkaichi", "Suzuka", "Matsusaka", "Ise"},
                {"Shiga", "Otsu", "Kusatsu", "Hikone", "Nagahama", "Moriyama"},
                {"Kyoto", "Kyoto", "Uji", "Maizuru", "Kameoka", "Fukuchiyama"},
                {"Osaka", "Osaka", "Sakai", "Higashiosaka", "Toyonaka", "Takatsuki"},
                {"Hyogo", "Kobe", "Himeji", "Nishinomiya", "Amagasaki", "Akashi"},
                {"Nara", "Nara", "Ikoma", "Tenri", "Kashihara", "Yamatokoriyama"},
                {"Wakayama", "Wakayama", "Tanabe", "Shingu", "Gobo", "Kinokawa"},
                {"Tottori", "Tottori", "Yonago", "Kurayoshi", "Sakaiminato", "Misasa"},
                {"Shimane", "Matsue", "Izumo", "Hamada", "Masuda", "Gotsu"},
                {"Okayama", "Okayama", "Kurashiki", "Tsuyama", "Tamano", "Bizen"},
                {"Hiroshima", "Hiroshima", "Fukuyama", "Kure", "Onomichi", "Mihara"},
                {"Yamaguchi", "Shimonoseki", "Ube", "Yamaguchi", "Hofu", "Iwakuni"},
                {"Tokushima", "Tokushima", "Anan", "Komatsushima", "Naruto", "Mima"},
                {"Kagawa", "Takamatsu", "Marugame", "Sakaide", "Zentsuji", "Sanuki"},
                {"Ehime", "Matsuyama", "Imabari", "Uwajima", "Niihama", "Saijo"},
                {"Kochi", "Kochi", "Nankoku", "Shimanto", "Sukumo", "Muroto"},
                {"Fukuoka", "Fukuoka", "Kitakyushu", "Kurume", "Omuta", "Iizuka"},
                {"Saga", "Saga", "Karatsu", "Tosu", "Kanzaki", "Ogi"},
                {"Nagasaki", "Nagasaki", "Sasebo", "Shimabara", "Omura", "Isahaya"},
                {"Kumamoto", "Kumamoto", "Yatsushiro", "Tamana", "Uto", "Amakusa"},
                {"Oita", "Oita", "Beppu", "Nakatsu", "Usa", "Taketa"},
                {"Miyazaki", "Miyazaki", "Nobeoka", "Nichinan", "Kobayashi", "Hyuga"},
                {"Kagoshima", "Kagoshima", "Kanoya", "Satsumasendai", "Ibusuki", "Izumi"},
                {"Okinawa", "Naha", "Okinawa", "Uruma", "Ginowan", "Itoman"}
        };
        for (String[] entry : jpPrefectures) {
            String key = entry[0];
            String[] values = new String[entry.length - 1];
            System.arraycopy(entry, 1, values, 0, entry.length - 1);
            jpMap.put(key, values);
        }
        countryStateCityMap.put("Japan", jpMap);
    }

    public static String[] getCitiesByCountry(String country) {
        if (countryStateCityMap.containsKey(country)) {
            return new String[]{"(Choose a state)"};
        }
        return cityMap.getOrDefault(country, new String[]{"Capital City"});
    }

    public static String[] getCitiesByState(String country, String state) {
        if (countryStateCityMap.containsKey(country)) {
            HashMap<String, String[]> stateMap = countryStateCityMap.get(country);
            if (stateMap != null && state != null && stateMap.containsKey(state)) {
                return stateMap.get(state);
            } else {
                return new String[]{"None"};
            }
        }
        return new String[]{"None"};
    }
}
