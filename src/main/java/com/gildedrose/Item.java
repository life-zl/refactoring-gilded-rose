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
        return name.equals("Aged Brie");
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


    public void updateQuality() {
        if (isNamedAgedBrie() || isNamedBackstagePasses()) {
            handleItemWhenNameIsAgedBrieOrBackstagePasses();
        } else {
            handleItemWhenNameIsOthers();
        }
        if (!isNamedSulfuras()) {
            sellIn--;
        }
        if (sellIn < 0) {
            handleItemWhenSellInLessThan0();
        }
    }

    private void handleItemWhenNameIsOthers() {
        if (quality > 0) {
            if (!isNamedSulfuras()) {
                quality--;
            }
        }
    }

    private void handleItemWhenNameIsAgedBrieOrBackstagePasses() {
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
    }

    private void handleItemWhenSellInLessThan0() {
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
}
