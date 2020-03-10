package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
    public void setNumber(String number) { this.number = number; }

    public String getNumber() {
        return number;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setHasVehicle(Boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public Boolean hasVehicle() {
        return hasVehicle;
    }

    public void setSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public Boolean istSpecial() {
        return isSpecial;
    }
}