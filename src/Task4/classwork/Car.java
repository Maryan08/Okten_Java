package Task4.classwork;

import lombok.*;

@Data
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String marka;
    private int power;
    private Owner owner;
    private int price;
    private int year;
}
