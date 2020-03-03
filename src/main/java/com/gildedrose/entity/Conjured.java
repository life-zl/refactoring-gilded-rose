package com.gildedrose.entity;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    @Override
    public void updateQualityAfterExpiration() {
        if (quality <= 0) {
            return;
        }
        quality--;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
