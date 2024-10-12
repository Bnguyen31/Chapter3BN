class Cow extends FarmAnimal {
    private String sound;

    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.sound = "Moo Moo";
    }

    @Override
    public String toString() {
        return sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return "6am-4pm";
    }
}