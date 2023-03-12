package org.example.HW3;

import java.util.Comparator;

public class CompareDogs implements Comparator<Dogs> {
    @Override
    public int compare(Dogs o1, Dogs o2) {
        return o1.getHeightAtWithers()- o2.getHeightAtWithers();
    }
}
