package org.example.dto;

import lombok.*;

import java.util.Objects;

/*@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter*/
public class Course {
    private int id;
    private String name;
    private double price;

    public Course() {
    }

    public Course(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && Double.compare(price, course.price) == 0 && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
