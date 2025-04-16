package travel_logger;

import java.util.HashSet;
import java.util.Set;

public class VisitedCountries {
    private static final Set<String> visited = new HashSet<>();

    public static void markVisited(String country) {
        visited.add(country);
    }

    public static boolean isVisited(String country) {
        return visited.contains(country);
    }

    public static Set<String> getAllVisited() {
        return visited;
    }
}


