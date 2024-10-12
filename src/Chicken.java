class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.sound = gender.equalsIgnoreCase("male") ? "Cock-a-Doodle-doo" : "Cluck Cluck";
    }

    @Override
    public String toString() {
        return "Chicken " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }
}
