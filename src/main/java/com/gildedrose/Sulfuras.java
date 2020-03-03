package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public boolean isNamedSulfuras() {
        return true;
    }

    @Override
    public void updateQuality() {

    }


//
//
//    @Override
//    public void updateQualityAfterExpired() {
//        if (isQualityLessThan50()) {
//            quality++;
//        }
//    }
}
