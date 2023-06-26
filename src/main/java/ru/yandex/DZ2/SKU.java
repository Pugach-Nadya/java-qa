package ru.yandex.DZ2;

//Sku: serialKey(long), storerKey(long), description(String)
public class SKU {

    private long serialKey;
    private long storerKey;
    private  String description;

    public SKU withSerialKey(long SK) {
        this.serialKey = SK;
        return this;
    }

    public SKU withStorerKey(long STK) {
        this.storerKey = STK;
        return this;
    }
    public SKU withDescription(String D) {
        this.description = D;
        return this;
    }
    //пробовала и с приват и с паблик, но при создании объекта ругается(
    public SKU (long SK, long STK, String D) {
        this.serialKey = SK;
        this.storerKey = STK;
        this.description = D;
    }
    public SKU bulder(){
        return new SKU(serialKey, storerKey, description);
    }

    public long getSerialKey() {
        return serialKey;
    }

    public long getStorerKey() {
        return storerKey;
    }

    public String getDescription() {
        return description;
    }
}
