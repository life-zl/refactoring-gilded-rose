package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (isQualityLessThan50()) {
            quality++;
        }
    }

    @Override
    public void updateQualityAfterExpiration() {
        if (isQualityLessThan50()) {
            quality++;
        }
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
