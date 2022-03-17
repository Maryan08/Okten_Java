package Task1.Classwork;

import Task1.Classwork.Adress;
import Task1.Classwork.Company;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Adress adress;
    private String phone;
    private String website;
    private Company company;
}
