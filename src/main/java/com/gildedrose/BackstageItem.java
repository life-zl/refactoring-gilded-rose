package com.gildedrose;

public class BackstageItem extends Item {
    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11) {
                quality++;
            }

            if (sellIn < 6) {
                quality++;
            }
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        quality = 0;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
