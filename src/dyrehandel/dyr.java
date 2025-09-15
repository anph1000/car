package dyrehandel;

class Pets {
    private String type;
    private String sound;
    private String color;

    // Konstruktør
    public Pets(String type, String sound, String color) {
        this.type = type;
        this.sound = sound;
        this.color = color;
    }

    public String getType() {
        return type;
    }
    public String getSound() {
        return sound;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return type + " (" + color + "): " + "'" + sound + "'";
    }
}
