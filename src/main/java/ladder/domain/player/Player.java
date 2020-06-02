package ladder.domain.player;

import ladder.exception.ErrorMessage;
import ladder.util.StringUtil;

public class Player {

    static final int MAX_LENGTH_OF_NAME = 5;

    private final String name;

    private Player(final String name) {
        verifyName(name);
        this.name = name;
    }

    public static Player of(final String name) {
        return new Player(name);
    }

    private void verifyName(final String name) {
        if (StringUtil.isEmpty(name)) {
            throw new IllegalArgumentException(ErrorMessage.IS_NULL_OR_EMPTY);
        }
        if (name.length() > MAX_LENGTH_OF_NAME) {
            throw new IllegalArgumentException("참여자의 이름은 5글자를 넘길 수 없습니다.");
        }
    }
}
