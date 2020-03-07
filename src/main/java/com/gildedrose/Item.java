package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

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

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        updateQualityBeforeSellIn();

        updateSellIn();

        if (sellIn < 0) {
            updateQualityAfterSellIn();
        }
    }

    public void updateQualityAfterSellIn() {
        if (name.equals("Aged Brie")) {
            if (quality < 50) {
                quality = quality + 1;
            }
        } else {
            if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                quality = 0;
            } else {
                if (quality > 0) {
                    if (name.equals("Sulfuras, Hand of Ragnaros")) {
                        return;
                    }
                    quality = quality - 1;
                }
            }
        }
    }

    public void updateSellIn() {
        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
        }
    }

    public void updateQualityBeforeSellIn() {
        if (name.equals("Aged Brie")) {
            if (quality < 50) {
                quality = quality + 1;
            }
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality < 50) {
                quality = quality + 1;

                if (sellIn < 11) {
                    quality = quality + 1;
                }

                if (sellIn < 6) {
                    quality = quality + 1;
                }
            }
        } else {
            if (quality > 0) {
                if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality = quality - 1;
                }
            }
        }
    }
}
