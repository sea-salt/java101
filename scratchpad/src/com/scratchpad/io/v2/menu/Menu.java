package com.scratchpad.io.v2.menu;

import com.scratchpad.io.v2.menu.menuoptions.MenuOption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private List<MenuOption> menuOptions;
    private Map<String, MenuOption> shortcutToMenuOptionMap;

    public Menu() {
        menuOptions = new ArrayList<>();
        shortcutToMenuOptionMap = new HashMap<>();
    }

    public void addMenuOption(MenuOption menuOption) {
        menuOptions.add(menuOption);
        shortcutToMenuOptionMap.put(menuOption.getShortcut(), menuOption);
    }

    public MenuOption getMenuOption(String shortcut) {
        return shortcutToMenuOptionMap.get(shortcut);
    }

    @Override
    public String toString() {
        String result = "\nMenu Options:\n";
        for (MenuOption menuOption : menuOptions) {
            result += menuOption + "\n";
        }
        result += "\nPlease enter a menu option:";
        return result;
    }
}
