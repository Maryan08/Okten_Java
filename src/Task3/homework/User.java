package Task3.homework;

import lombok.*;

import java.util.Collection;
import java.util.Set;

@NoArgsConstructor
@ToString
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Comparable<User> {

    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Set<Skills> skills;
    private Car car;

public int compareTo( User o){
    int result = this.skills.size()-o.getSkills().size();
    if(result==0){
        return this.id-o.getId();

    }
    return result;

}

}
