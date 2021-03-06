package by.cdp.jb27.les09_10_11;

import by.cdp.jb27.les09_10_11.print.Publication;

import java.util.Comparator;

public class PriceComparator implements Comparator<Publication> {

    @Override
    public int compare(Publication o1, Publication o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
