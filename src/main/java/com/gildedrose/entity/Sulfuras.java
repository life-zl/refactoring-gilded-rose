package com.gildedrose.entity;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public void updateQualityAfterExpiration() {

    }

    @Override
    public void updateSellIn() {
    }
}
