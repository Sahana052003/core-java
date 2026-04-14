package com.xworkz.collectionarchitre.main;

import java.util.Objects;

public class Vehicle {
    String vehicleName;
    Integer idNumber;

    public Vehicle(String vehicleName, Integer idNumber) {
        this.vehicleName = vehicleName;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehicleName, vehicle.vehicleName) && Objects.equals(idNumber, vehicle.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName, idNumber);
    }
}
