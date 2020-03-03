package com.gildedrose.factory;

import com.gildedrose.entity.*;

public class ItemFactory {

    public static Item getInstance(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "+5 Dexterity Vest":
                return new Dexterity(sellIn, quality);
            case "Elixir of the Mongoose":
                return new Elixir(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses(sellIn, quality);
            case "foo":
                return new Foo(sellIn, quality);
            case "Conjured Mana Cake":
                return new Conjured(sellIn, quality);
            default:
                return null;
        }
    }
}
