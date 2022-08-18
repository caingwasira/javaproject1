import java.util.HashMap;

//HashMap - implements the Map Interface (needs import)
// similar to ArrayList but with key-value pairs. Stores objects;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();

        countries.put("Zimbabwe", "Harare");
        countries.put("South Africa", "Johannesburg");
        countries.put("UK", "London");
        countries.put("China", "Bejing");

        countries.size();
        //countries.clear();
        //countries.remove("China");
        countries.containsKey("UK");
        countries.containsValue("Harare");
        countries.get("Zimbabwe");
        countries.replace("Zimbabwe", "Harare", "Bulawayo");

        for(String i: countries.keySet()) {
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }

    }
}
