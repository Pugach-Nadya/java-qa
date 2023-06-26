package ru.yandex.DZ2;

//SerialInventory: serialKey(long), sku(Sku), lot(Lot), loc(Loc), quantity(long)
public class SerialInventory {
    private long serialKey;
    private SKU sku;
    private Lot lot;
    private Loc loc;
    private long quantity;

    public SerialInventory withSerialKey (SKU S){
        this.serialKey = S.getSerialKey();
        return this;
    }
    public SerialInventory withSku ( SKU S){
        this.sku = S;
        return this;
    }
    public  SerialInventory withLot (Lot LT){
        this.lot = LT;
        return this;
    }
    public SerialInventory withLoc (Loc LC){
        this.loc = LC;
        return  this;
    }
    public SerialInventory withQuantitySI(long Q){
        this.quantity = Q;
        return this;
    }
    private SerialInventory (long SK, SKU S, Lot LT, Loc LC, long Q){
        this.serialKey = SK;
        this.sku = S;
        this.lot = LT;
        this.loc = LC;
        this.quantity = Q;
    }
    public SerialInventory builder(){
        return new SerialInventory(serialKey,sku,lot,loc,quantity);
    }

    public long getSerialKey() {
        return serialKey;
    }

    public SKU getSku() {
        return sku;
    }

    public Lot getLot() {
        return lot;
    }

    public Loc getLoc() {
        return loc;
    }

    public long getQuantitySI() {
        return quantity;
    }
}
