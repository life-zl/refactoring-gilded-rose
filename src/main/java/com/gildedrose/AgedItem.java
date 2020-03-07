package com.gildedrose;

public class AgedItem extends Item {
    public AgedItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
