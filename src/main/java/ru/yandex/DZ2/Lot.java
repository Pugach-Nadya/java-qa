package ru.yandex.DZ2;

//Lot: serialKey(long), sku(Sku), quantity(long)
public class Lot {
    private long serialKey;
    private SKU sku;
    private long quantity;

    public Lot (long SK, SKU sku,long Q){
        this.serialKey = SK;
        this.sku = sku;
        this.quantity = Q;
        System.out.println("serialKey = "+getSerialKey());
        System.out.println("SKU = "+getSku());
        System.out.println("quantity = "+getQuantity());
    }

    public long getSerialKey() {
        return serialKey;
    }

    public SKU getSku() {
        return sku;
    }

    public long getQuantity() {
        return quantity;
    }
}
