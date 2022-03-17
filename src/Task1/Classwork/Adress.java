package Task1.Classwork;

import lombok.*;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Adress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private ArrayList<Double> geo;
}
