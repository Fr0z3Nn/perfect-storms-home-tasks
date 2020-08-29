package ru.svivanov.module02.TASK_06;

public class Apartment {
    private int houseId;
    private int apartmentNumber;
    private int area;
    private int floor;

    private int numberOfRooms;
    private String street;
    private String HouseBuildingType;
    private int HouseLifetime;

    public Apartment(int houseId, int apartmentNumber, int area, int floor, int numberOfRooms, String street, String houseBuildingType, int houseLifetime) {
        this.houseId = houseId;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        HouseBuildingType = houseBuildingType;
        HouseLifetime = houseLifetime;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public int getArea() {
        return area;
    }

    public String getHouseBuildingType() {
        return HouseBuildingType;
    }

    public void setHouseBuildingType(String houseBuildingType) {
        HouseBuildingType = houseBuildingType;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "houseId=" + houseId +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", HouseBuildingType='" + HouseBuildingType + '\'' +
                ", HouseLifetime=" + HouseLifetime +
                '}';
    }
}
