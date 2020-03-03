package com.gildedrose;

public class Elixir extends Item {
    public Elixir(int sellIn, int quality) {
        super("Elixir of the Mongoose", sellIn, quality);
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
