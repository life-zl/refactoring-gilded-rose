package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public boolean isNamedAgedBrie() {
        return true;
    }

//    @Override
//    public void updateQuality() {
//        if (isQualityLessThan50()) {
//            quality++;
//        }
//    }
//
//
//    @Override
//    public void updateQualityAfterExpired() {
//        if (isQualityLessThan50()) {
//            quality++;
//        }
//    }
}
