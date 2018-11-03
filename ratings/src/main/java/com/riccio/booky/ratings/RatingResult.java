package com.riccio.booky.ratings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingResult {
    private String type, entityId;
    private BigDecimal rating;
    private int ratingCount;
}
