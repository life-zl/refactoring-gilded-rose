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
                new Dexterity(10, 20),
                new AgedBrie(2, 0),
                new Elixir(5, 7),
                new Sulfuras(0, 80),
                new Sulfuras(-1, 80),
                new BackstagePasses(15, 20),
                new BackstagePasses(10, 49),
                new BackstagePasses(5, 49),
                new BackstagePasses(1, 20),
                new Conjured(3, 6)};

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
