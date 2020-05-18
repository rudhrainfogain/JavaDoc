package com.infogain.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * They clearly have no idea <i>what</i> they're doing!
 * <p>
 * This class implements {@link #pickWinners(Set) pickWinners} and provides a Javadoc block which inherits docs from
 * some of the new tags as well (in a senseless and random way).
 * 
 * @author Namit Jain
 * @version 1.0.1
 * @since 1.0.1
 */
public class UselessLottery implements Lottery {

    /**
     * {@inheritDoc} Let "Q" names win!
     *
     * @param players the players i want
     * @apiNote {@inheritDoc}
     * @implNote It filters players whose name starts with Q.
     */
    @Override
    public List<String> pickWinners(Set<String> players) throws IllegalArgumentException {
        String[] temp = new String[players.size()];
        AtomicInteger i = new AtomicInteger(0);
        try {
            players.stream().filter(p -> p.startsWith("Q")).forEach(q -> {
                temp[i.getAndAdd(1)] = q;
            });
        } catch (NullPointerException e) {
            // TODO no handling
        }
        ArrayList<String> t = new ArrayList<>();
        Arrays.stream(temp).forEach(p -> {
            if (p != null) {
                t.add(p);
            }
        });
        return t;
    }

}
