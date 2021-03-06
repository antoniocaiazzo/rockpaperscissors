import java.util.Comparator;

import static Hand.Moves.*;

/**
 * User: antoniocaiazzo
 */
public class Judge implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {

        Hand.Moves move1 = player1.getHand().getCurrentMove();
        Hand.Moves move2 = player2.getHand().getCurrentMove();

        if (move1.equals(move2))
            return 0;

        if (move1.equals(ROCK) && move2.equals(SCISSOR) ||
            move1.equals(PAPER) && move2.equals(ROCK) ||
            move1.equals(SCISSOR) && move2.equals(PAPER)) {
            return 1;
        } else {
            return -1;
        }

    }
}
