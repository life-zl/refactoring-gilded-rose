package com.gildedrose;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (isQualityLessThan50()) {
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
    public void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }
}
