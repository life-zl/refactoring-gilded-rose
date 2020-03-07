package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void should_output_0_4_with_foo_1_5() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(0));
        assertThat(app.getItems()[0].getQuality(), is(4));
    }

    @Test
    public void should_output_negative_1_3_with_foo_0_5() {
        Item[] items = new Item[] { new Item("foo", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(-1));
        assertThat(app.getItems()[0].getQuality(), is(3));
    }

    @Test
    public void should_output_2_5_with_aged_brie_3_4() {
        Item[] items = new Item[] { new Item("Aged Brie", 3, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(2));
        assertThat(app.getItems()[0].getQuality(), is(5));
    }

    @Test
    public void should_output_negative_1_6_with_aged_brie_0_4() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(-1));
        assertThat(app.getItems()[0].getQuality(), is(6));
    }

    @Test
    public void should_output_2_5_with_backstage_passes_to_a_tafkal80etc_concert_3_4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(2));
        assertThat(app.getItems()[0].getQuality(), is(7));
    }

    @Test
    public void should_output_negative_1_0_with_backstage_passes_to_a_tafkal80etc_concert_0_4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(-1));
        assertThat(app.getItems()[0].getQuality(), is(0));
    }

    @Test
    public void should_output_0_4_with_sulfuras_hand_of_ragnaros_0_4() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(0));
        assertThat(app.getItems()[0].getQuality(), is(4));
    }

    @Test
    public void should_output_negative_1_4_with_sulfuras_hand_of_ragnaros_negative_1_4() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(-1));
        assertThat(app.getItems()[0].getQuality(), is(4));
    }

    @Test
    public void should_output_negative_1_4_with_sulfuras_hand_of_ragnaros_negative_1_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getSellIn(), is(-1));
        assertThat(app.getItems()[0].getQuality(), is(0));
    }

}
