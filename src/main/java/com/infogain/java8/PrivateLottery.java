package com.infogain.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * A private lottery.
 * <p>
 * It implements {@link #pickWinners(Set) pickWinners} but provides no own Javadoc block. The interface method's comment
 * is referenced but without the new tags.
 * 
 * @author Namit Jain
 * @version 1.0.1
 * @since 1.0.1
 */
public class PrivateLottery implements Lottery {

    @Override
    public List<String> pickWinners(Set<String> players) throws IllegalArgumentException {
        return new ArrayList<>();
    }

}
