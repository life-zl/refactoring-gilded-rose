package com.gildedrose;

import java.util.Arrays;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = args.length > 0 ? Integer.parseInt(args[0]) + 1 : 3;

        for (int i = 0; i < days; i++) {
            System.out.println(String.format("-------- day %s --------", i));
            System.out.println("name, sellIn, quality");
            Arrays.stream(items).forEachOrdered(System.out::println);
            System.out.println();
            app.updateQuality();
        }
    }

}
