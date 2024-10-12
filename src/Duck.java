class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.sound = "Quack Quack";
    }

    @Override
    public String toString() {
        return sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-12pm-6pm";
    }
}
