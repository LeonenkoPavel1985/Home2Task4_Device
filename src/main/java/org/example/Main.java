package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("KETTLE.");
        Kettle kettle = new Kettle("kettle.", "sound kettle - phhhh.", "a hollow product" +
                " (vessel) " + "of various shapes with a lid, a handle and a spout (there are also teapots without " +
                "a spout) designed " + "for boiling water and brewing tea.");
        kettle.Show();
        kettle.Sound();
        kettle.Desc();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------");

        System.out.println("MICROWAVE.");
        Microwave microwave = new Microwave("microwave.", "sound microwave - dinn.","an " +
                "electrical appliance that allows you to heat water-containing substances due to electromagnetic " +
                "radiation in the decimeter range (usually with a frequency of 2450 MHz) and is designed for quick " +
                "cooking, " + "heating or defrosting food.");
        microwave.Show();
        microwave.Sound();
        microwave.Desc();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------");

        System.out.println("AUTOMOBILE.");
        Automobile automobile = new Automobile("automobile.", "sound automobile - brrr."
                , "motor road and off-road vehicle used for the transport of people and goods.");
        automobile.Show();
        automobile.Sound();
        automobile.Desc();

        System.out.println("-----------------------------------------------------------------------------------------" +
                "--------------------------------------------------------------------------------------------");

        System.out.println("STEAMER.");
        Steamer steamer = new Steamer("steamer.", "sound steamer.", "a ship equipped " +
                "with a reciprocating steam engine or a steam turbine as a traction engine [1]. A steamship driven by" +
                " a steam turbine is called a turboship, or, more precisely, a steam turbine ship [1] - in contrast " +
                "to a gas turbine ship - a ship equipped with a gas turbine and which is a kind of motor ship.");
        steamer.Show();
        steamer.Sound();
        steamer.Desc();
    }
}