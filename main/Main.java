package main;

import concrets.ConcreteProduct;
import storage.Warehouse;
import storage.QRCode;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        QRCode qrCodeTV = new QRCode("неизвестно", "техника");
        QRCode qrCodeEat = new QRCode("неизвестно", "продукты");
        ConcreteProduct television = new ConcreteProduct(qrCodeTV, 210);
        ConcreteProduct bread = new ConcreteProduct(qrCodeEat, 1);
        System.out.println(television.getProductWeight());
        warehouse.placing(television);
        System.out.println(bread.getProductWeight());
        warehouse.placing(bread);

    }

}
