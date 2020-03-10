
public class Cat {
    public static final int EYES_COUNT = 2;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;

    private double originWeight;
    private double weight;

    private Double food = 0.0;
    private static Integer count = 0;
    private Color color;
    private String name;

    public Cat(double weight, String name, Color color1) {
        this(weight);
        this.name = name;
        color = color1;
    }

    public Cat(Double weight) {
        this.weight = weight;
        originWeight = weight;
        if (!isAlive()){
            System.out.println("Кошка с таким весом не может существовать. ");
        }
        else {
            count ++;
        }
    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        count = count + 1;
    }

//    public void setIsDead(boolean isDead){
//        this.isDead = isDead;
//    }
//
//    public boolean isDead(){
//        return isDead;
//    }

    public static Integer getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(Color color1) {
        color = color1;
    }

    public Color getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public Double sumEat() {
        return food;
    }

    public void meow() {
        if (isAlive()){
            weight = weight - 1;
            statusWeight();
        }
        else {
            System.out.println("Кошке нельзя мяукать. Она сдохла. ");

        }
    }

    public void feed(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            food = food + amount;
            statusWeight();
        }
        else {
            System.out.println("Кошке нельзя есть. Она сдохла. ");
        }
    }

    public void drink(Double amount) {
        if (isAlive()){
            weight = weight + amount;
            statusWeight();
        }
        else {
            System.out.println("Кошке нельзя пить. Она сдохла. ");
        }
    }

    public void pee() {
        if (isAlive()){
            this.weight = this.weight - 25;
            statusWeight();
        }
        else {
            System.out.println("Кошке нельзя ходить в туалет. Она сдохла. ");
        }
    }

    public Cat copyCat(){
        return new Cat(this.getWeight(), this.name, this.color);
    }

    public Boolean isAlive() {
        return weight < MAX_WEIGHT && weight > MIN_WEIGHT;
    }

    public void statusWeight(){
        if (!isAlive()){
            count--;
        }
    }
}