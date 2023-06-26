package ru.yandex.DZ2;

//Lot: serialKey(long), sku(Sku), quantity(long)
public class Lot {
    private long serialKey;
    private SKU sku;
    private long quantity;

    public Lot withSerialKey(SKU S) {
        this.serialKey = S.getSerialKey();
        return this;
    }

    public Lot withSku(SKU S) {
        this.sku = S;
        return this;
    }

    public Lot withQuantity(long q) {
        this.quantity = q;
        return this;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public SKU getSku() {
        return sku;
    }

    public long getQuantityLot() {
        return quantity;
    }
}
