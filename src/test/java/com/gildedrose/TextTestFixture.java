package com.gildedrose;

public class TextTestFixture {
    public static void main(String[] args) {

        String outPut = generateOutPut();
        System.out.println(outPut);
    }

    public static String generateOutPut() {

        StringBuilder builder = new StringBuilder();
        builder.append("OMGHAI!").append("\n");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new AgedBrie(2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                new Item("Conjured Mana Cake", 3, 6)};

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
