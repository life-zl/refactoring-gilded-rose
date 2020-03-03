package com.gildedrose;

public class Foo extends Item {
    public Foo(int sellIn, int quality) {
        super("foo", sellIn, quality);
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
