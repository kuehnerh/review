package it.schwarz.jobs.review.coupon.api;

import it.schwarz.jobs.review.coupon.domain.entity.AmountOfMoney;
import it.schwarz.jobs.review.coupon.domain.entity.Basket;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public record BasketJson(
        @Min(0)
        @Max(10000)
        BigDecimal value
) {

    public Basket toBasket() {
        return new Basket(AmountOfMoney.of(value));
    }

}
