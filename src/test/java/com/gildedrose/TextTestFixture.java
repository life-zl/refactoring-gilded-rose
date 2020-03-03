package com.gildedrose;

import com.gildedrose.entity.*;
import com.gildedrose.factory.ItemFactory;

import static com.gildedrose.factory.ItemFactory.getInstance;

public class TextTestFixture {
    public static void main(String[] args) {

        String outPut = generateOutPut();
        System.out.println(outPut);
    }

    public static String generateOutPut() {

        StringBuilder builder = new StringBuilder();
        builder.append("OMGHAI!").append("\n");

        Item[] items = new Item[]{
                getInstance("+5 Dexterity Vest", 10, 20),
                getInstance("Aged Brie", 2, 0),
                getInstance("Elixir of the Mongoose", 5, 7),
                getInstance("Sulfuras, Hand of Ragnaros", 0, 80),
                getInstance("Sulfuras, Hand of Ragnaros", -1, 80),
                getInstance("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                getInstance("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                getInstance("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                getInstance("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                getInstance("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            builder.append(String.format("-------- day %s --------", i)).append("\n");
            builder.append("name, sellIn, quality").append("\n");
            for (Item item : items) {
                builder.append(item).append("\n");
            }
            builder.append("\n");
            app.updateQuality();
        }
        return builder.toString();
    }


}
