package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

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
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    public boolean isNamedSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
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
        if (isNamedAgedBrie()) {
            if (isQualityLessThan50()) {
                quality++;
            }
        } else {
            if (isNamedBackstagePasses()) {
                quality = 0;
            } else {
                if (quality <= 0) {
                    return;
                }
                if (!isNamedSulfuras()) {
                    quality--;
                }
            }
        }
    }

    public void updateSellIn() {
        if (!isNamedSulfuras()) {
            sellIn--;
        }
    }

    public void updateQuality() {
        if (isNamedAgedBrie() || isNamedBackstagePasses()) {
            if (isQualityLessThan50()) {
                quality++;
                if (isNamedBackstagePasses()) {
                    if (sellIn < 11) {
                        quality++;
                    }
                    if (sellIn < 6) {
                        quality++;
                    }
                }
            }
        } else {
            if (quality > 0) {
                if (!isNamedSulfuras()) {
                    quality--;
                }
            }
        }
    }

}
