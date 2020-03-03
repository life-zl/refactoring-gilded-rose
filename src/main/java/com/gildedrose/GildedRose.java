package com.gildedrose;

import com.gildedrose.entity.Item;

public class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateItemQuality();
        }

    }



}
