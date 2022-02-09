package ua.com.alevel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
//@NoArgsConstructor
@AllArgsConstructor
public class User {

    private final String id;
    private final String name;
}
