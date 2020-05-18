package com.infogain.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The lottery.
 * <p>
 * gives lottery to a player from the list.
 * 
 * @author Namit Jain
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Lottery {

    /**
     * Picks the winners from the specified set of players.
     * <p>
     * The returned list defines the order of the winners, where the first prize goes to the player at position 0. The
     * list will not be null but can be empty.
     *
     * @apiNote This method was added after the interface was released in version 1.0. It is defined as a default method
     *          for compatibility reasons. From version 2.0 on, the method will be abstract and all implementations of
     *          this interface have to provide their own implementation of the method.
     * @implSpec The default implementation will consider each player a winner and return them in an unspecified order.
     * @implNote This implementation has linear runtime and does not filter out null players.
     * @param players the players from which the winners will be selected.
     *        <p>
     *        the datatype of this param is {@code Set<String>}
     * @return the (ordered) list of the players who won; the list will not contain duplicates
     * @throws IllegalArgumentException if list provided is null or empty
     * @since 1.0.1
     */
    default List<String> pickWinners(Set<String> players) throws IllegalArgumentException {
        return new ArrayList<>(players);
    }

}
