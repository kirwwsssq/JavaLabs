package org.example.task6;

public class Main {
    public static void main(String[] args){
        Store store = new Store("супермаркет","ул. ленина, 15", 55);
        System.out.println("название:"+store.getName());
        System.out.println("адрес:"+store.getAddress());
        System.out.println("колво соотрудников:"+store.getEmployeeCount());
        System.out.println("крупный магазин?"+store.isLarge());

        Store stores = new Store("продукотовый", "ул.варвашени 59", 50, 3);
    }
}
