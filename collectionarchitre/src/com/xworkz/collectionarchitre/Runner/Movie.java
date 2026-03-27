package com.xworkz.collectionarchitre.Runner;

import java.util.Objects;

public class Movie  implements Comparable<Movie>{
    private Integer ticketId;
    private String name;
    private Double cost;

    public Movie(Integer ticketId, String name, Double cost) {
        this.ticketId = ticketId;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(ticketId, movie.ticketId) && Objects.equals(name, movie.name) && Objects.equals(cost, movie.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, name, cost);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ticketId=" + ticketId +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.ticketId-o.ticketId;
    }
}
