package factory;

import java.util.Objects;

public class Fruit {

    private String name;
    private String type;
    private String grade;
    private double weight;

    public Fruit() {
    }

    public String getFruitName() {
        return "No name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (Double.compare(fruit.weight, weight) != 0) return false;
        if (!Objects.equals(name, fruit.name)) return false;
        if (!Objects.equals(type, fruit.type)) return false;
        return Objects.equals(grade, fruit.grade);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", grade='" + grade + '\'' +
                ", weight=" + weight +
                '}';
    }
}
