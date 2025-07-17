package dev.morphie.morphLib.guimanager;

import de.themoep.inventorygui.*;

public class GUIMaker {

    private InventoryGui gui;
    private StaticGuiElement staticGuiElement;
    private DynamicGuiElement dynamicGuiElement;
    private GuiElement guiElement;
    private GuiPageElement guiPageElement;
    private GuiBackElement guiBackElement;
    private GuiStateElement guiStateElement;
    private GuiStorageElement guiStorageElement;

    public InventoryGui getGui() {
        return gui;
    }

    public StaticGuiElement getStaticGuiElement() {
        return staticGuiElement;
    }

    public DynamicGuiElement getDynamicGuiElement() {
        return dynamicGuiElement;
    }

    public GuiElement getGuiElement() {
        return guiElement;
    }

    public GuiPageElement getGuiPageElement() {
        return guiPageElement;
    }

    public GuiBackElement getGuiBackElement() {
        return guiBackElement;
    }

    public GuiStateElement getGuiStateElement() {
        return guiStateElement;
    }

    public GuiStorageElement getGuiStorageElement() {
        return guiStorageElement;
    }
}
