package com.gildedrose;

public class SulfurasItem extends Item {
    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
