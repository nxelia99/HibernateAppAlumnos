package org.example;

import org.example.manager.AlumnosManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AlumnosManager manager = new AlumnosManager();
        manager.setup();
        manager.create();
        manager.exit();



    }
}