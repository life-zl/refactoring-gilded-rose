package com.gildedrose;

public abstract class Item {

    private String name;

    protected int sellIn;

    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isQualityLessThan50() {
        return quality < 50;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    public void updateItemQuality() {
        updateQuality();
        updateSellIn();
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    public boolean isExpired() {
        return sellIn < 0;
    }

    public abstract void updateQualityAfterExpiration();

    public abstract void updateQuality();

    public abstract void updateSellIn();

}
