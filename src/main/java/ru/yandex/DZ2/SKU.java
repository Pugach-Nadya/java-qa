package ru.yandex.DZ2;

//Sku: serialKey(long), storerKey(long), description(String)
public class SKU {

    public long serialKey;
    private long storerKey;
    private  String description;

    public SKU(long SK, long S, String D){
        this.serialKey = SK;
        this.storerKey = S;
        this.description = D;
        System.out.println("serialKey = "+getSerialKey());
        System.out.println("storerKey = "+getStorerKey());
        System.out.println("description = "+getDescription());
    }

    public long getSerialKey() {
        return this.serialKey;
    }
    public long getStorerKey() {
        return storerKey;
    }

    public String getDescription() {
        return description;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public void setStorerKey(long storerKey) {
        this.storerKey = storerKey;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
