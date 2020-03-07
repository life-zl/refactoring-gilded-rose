package com.gildedrose;

public class OtherItem extends Item {
    public OtherItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        if (quality > 0) {
            quality--;
        }
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
