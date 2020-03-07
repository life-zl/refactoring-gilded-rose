package com.gildedrose;

public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQualityAfterSellIn() {
    }

    @Override
    public void updateSellIn() {

    }

    @Override
    public void updateQualityBeforeSellIn() {

    }
}
