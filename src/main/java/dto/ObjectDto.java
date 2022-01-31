package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class ObjectDto {

    private Integer id;

    private String objectName;

    private BigDecimal price;

    private String description;

    private double getArea;
}
