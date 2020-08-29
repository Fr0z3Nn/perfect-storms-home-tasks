package ru.svivanov.module02.TASK_06;

public class ApartmentUtil {

    public static Apartment[] getArrayOfRandomApartment() {
        Apartment[] apartments = new Apartment[20000];
        String[] types = new String[]{
                "Skyscraper",
                "A penthouse",
                "Tower block",
                "Block of flats",
                "High-rise building",
                "Low-rise building",
                "Detached house"
        };
        int id = 0;
        for (int i = 1; i <= 100; i++) {
            String street = i + " - Green Street";
            String type = types[(int) (Math.random() * 6)];
            int lifeTime = (int) (Math.random() * 100) + 60;
            for (int j = 1, k = 1; j <= 200; j++) {
                apartments[id] = new Apartment(i, j, (int) (150 * Math.random()), k, (int) (8 * Math.random()), street, type, lifeTime);
                if (j % 10 == 0) {
                    k++;
                }
                id++;
            }
        }
        return apartments;
    }

    public static void findApartmentWithNumberOfRooms(Apartment[] apartments, int numberOfRooms){
        for (Apartment apartment : apartments){
            if (apartment.getNumberOfRooms() == numberOfRooms){
                System.out.println(apartment);
            }
        }
    }
    public static void findApartmentWithNumberOfRoomsWithFloorInterval(Apartment[] apartments, int numberOfRooms, int startFloor, int endFloor){
        for (Apartment apartment : apartments){
            if (apartment.getNumberOfRooms() == numberOfRooms && apartment.getFloor() >= startFloor && apartment.getFloor() <= endFloor){
                System.out.println(apartment);
            }
        }
    }

    public static void findApartmentWithExceedArea(Apartment[] apartments, int area){
        for (Apartment apartment : apartments){
            if (apartment.getArea() > area){
                System.out.println(apartment);
            }
        }
    }

}
