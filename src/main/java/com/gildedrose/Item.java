package com.gildedrose;

public class Item {

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

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isNamedAgedBrie() {
        return false;
    }

    public boolean isNamedBackstagePasses() {
        return false;
    }

    public boolean isNamedSulfuras() {
        return false;
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

    public void updateQualityAfterExpiration() {

    }

    public void updateSellIn() {
        if (!isNamedSulfuras()) {
            sellIn--;
        }
    }

    public void updateQuality() {
    }

}
