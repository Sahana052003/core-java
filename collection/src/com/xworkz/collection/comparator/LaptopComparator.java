package com.xworkz.collection.comparator;

import java.util.Comparator;
import java.util.Objects;

public class LaptopComparator  {
    String name;
    Integer cost;

    @Override
    public String toString() {
        return "LaptopComparator{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LaptopComparator that = (LaptopComparator) o;
        return Objects.equals(name, that.name) && Objects.equals(cost, that.cost);
    }

    public String getName() {

        return name;
    }

    public LaptopComparator(String name, int cost) {
        this.name = name;
        this.cost=cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
