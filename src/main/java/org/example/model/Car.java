package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private Integer id;
    private String model;
    private String make;
    private String preview;
    private String description;
    private Integer price;
}
