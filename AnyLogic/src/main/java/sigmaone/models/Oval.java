package sigmaone.models;

import java.util.HashMap;
import java.util.Map;

public class Oval implements Shape {
    private HashMap<String, Object> properties = new HashMap<>();
    private boolean isCircle = false;

    public Oval(String name, double x, double y, double width, double height) {
        properties.put("name", name);
        properties.put("type", this.getClass().getSimpleName());
        properties.put("x", x);
        properties.put("y", y);

        properties.put("height", height);
        properties.put("width", width);

        isCircle = (width == height);
    }

    @Override
    public String getName() {
        return (String) properties.get("name");
    }

    @Override
    public String getType() {
        return (String) properties.get("type");
    }

    @Override
    public double getX() {
        return (double) properties.get("x");
    }

    @Override
    public double getY() {
        return (double) properties.get("y");
    }

    @Override
    public Map<String, Object> getPropertiesMap() {
        return properties;
    }
}