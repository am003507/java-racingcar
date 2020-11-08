package step3;

import java.util.Collections;
import java.util.List;

public class RacingSpec {

    private List<String> users;
    private final Integer lab;

    public RacingSpec(List<String> users, int lab) {
        if (users == null || lab <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RACING_SPEC);
        }
        this.lab = lab;
        this.users = Collections.unmodifiableList(users);
    }

    public Integer getLab() {
        return this.lab;
    }

    public List<String> getUsers() {
        return this.users;
    }
}
