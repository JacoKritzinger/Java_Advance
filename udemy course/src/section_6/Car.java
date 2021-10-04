package section_6;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("Carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;

    }
}
