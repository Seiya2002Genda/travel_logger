package travel_logger;

import java.util.HashMap;
import java.util.Locale;

public class State {
    private static final HashMap<String, String[]> stateMap = new HashMap<>();

    static {
        String[] countryCodes = Locale.getISOCountries();
        for (String code : countryCodes) {
            Locale locale = new Locale("", code);
            String countryName = locale.getDisplayCountry();
            if (!countryName.isEmpty()) {
                stateMap.put(countryName, new String[]{"Main Region"});
            }
        }

        stateMap.put("United States", new String[]{
                "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
                "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho",
                "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana",
                "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
                "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
                "New Hampshire", "New Jersey", "New Mexico", "New York",
                "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
                "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
                "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
                "West Virginia", "Wisconsin", "Wyoming",
                "District of Columbia", "Puerto Rico", "Guam"
        });

        stateMap.put("Japan", new String[]{
                "Hokkaido", "Aomori", "Iwate", "Miyagi", "Akita", "Yamagata", "Fukushima",
                "Ibaraki", "Tochigi", "Gunma", "Saitama", "Chiba", "Tokyo", "Kanagawa",
                "Niigata", "Toyama", "Ishikawa", "Fukui", "Yamanashi", "Nagano",
                "Gifu", "Shizuoka", "Aichi", "Mie", "Shiga", "Kyoto", "Osaka", "Hyogo",
                "Nara", "Wakayama", "Tottori", "Shimane", "Okayama", "Hiroshima", "Yamaguchi",
                "Tokushima", "Kagawa", "Ehime", "Kochi", "Fukuoka", "Saga", "Nagasaki",
                "Kumamoto", "Oita", "Miyazaki", "Kagoshima", "Okinawa"
        });

        stateMap.put("India", new String[]{"Maharashtra", "Delhi", "Karnataka"});
        stateMap.put("Australia", new String[]{"New South Wales", "Victoria", "Queensland"});
        stateMap.put("Canada", new String[]{"Ontario", "Quebec", "British Columbia"});
        stateMap.put("United Kingdom", new String[]{"England", "Scotland", "Wales", "Northern Ireland"});
    }

    public static String[] getStatesByCountry(String country) {
        return stateMap.getOrDefault(country, new String[]{"Main Region"});
    }
}