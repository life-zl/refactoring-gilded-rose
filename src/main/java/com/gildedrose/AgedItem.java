package com.gildedrose;

public class AgedItem extends Item {
    public AgedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
