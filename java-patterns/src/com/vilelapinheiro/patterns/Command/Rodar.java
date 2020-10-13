package com.vilelapinheiro.patterns.Command;

import java.util.ArrayList;

public class Rodar {
    public static void main(String[] args) {
/*        var task1 = new Task(1);
        var task2 = new Task(2);

        new Thread(task1).start();
        new Thread(task2).start();*/

        var bedroomLight = new Light("bedroom");
        var kitchenLight = new Light("kitchen");
        var lightSwitch = new Switch();

        var lights = new ArrayList<Light>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        var onCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(onCommand);
        /*lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(onCommand);*/

        var allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
