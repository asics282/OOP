package org.example.HW3;

public class Dogs implements Comparable<Dogs>{
    private String name;
    private int heightAtWithers;

    public Dogs(String name, int heightAtWithers) {
        this.name = name;
        this.heightAtWithers = heightAtWithers;
    }

    public String getName() {
        return name;
    }

    public int getHeightAtWithers() {
        return heightAtWithers;
    }

    @Override
    public String toString() {
        return String.format("Собака %s, высотой в холке %d", name, heightAtWithers);
    }

    @Override
    public int compareTo(Dogs d) {
        return this.heightAtWithers - d.heightAtWithers;
    }
}

