package com.infogain.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;

/**
 * The state lottery.
 * <p>
 * It implements {@link #pickWinners(Set) pickWinners} and provides a Javadoc block which only consists of
 * {@code @inheritDoc}. The comment is copied from the interface method but without the new tags.
 * 
 * @author Namit Jain
 * @version 1.0.1
 * @since 1.0.1
 */
public class StateLottery implements Lottery {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> pickWinners(Set<String> players) throws IllegalArgumentException {
        if (players.isEmpty()) {
            return new ArrayList<>();
        }

        String winner = players.stream().findAny() // "No fair!"
                        .orElseThrow(ConcurrentModificationException::new);
        return Collections.singletonList(winner);
    }

}
