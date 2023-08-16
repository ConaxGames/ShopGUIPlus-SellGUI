package net.mackenziemolloy.shopguiplus.sellgui.conax;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class SellGUIPrePriceEvent extends Event {

    private final Player player;
    private final ItemStack item;
    private final int amount;
    private double price;

    public SellGUIPrePriceEvent(Player player, ItemStack item, int amount, double price) {
        this.player = player;
        this.item = item;
        this.amount = amount;
        this.price = price;
    }

    public Player getPlayer() {
        return player;
    }

    public ItemStack getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
