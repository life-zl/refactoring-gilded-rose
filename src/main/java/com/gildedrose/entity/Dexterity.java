package com.gildedrose.entity;

public class Dexterity extends Item {
    public Dexterity(int sellIn, int quality) {
        super("+5 Dexterity Vest", sellIn, quality);
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
