package greeng00se.effectivejava.chapter11.item87;

import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
public class Name implements Serializable {

    private final String lastName;
    private final String firstName;
    private final String middleName;
}
