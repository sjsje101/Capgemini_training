package map.dependencyinjection;

import java.util.Map;

public class Kit {
    private String name;
    private Map<String,String>items;

    public Kit(String name, Map<String, String> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Kit{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
