package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.MEmberService;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPilicyTest {

    RateDiscountPilicy discountPilicy = new RateDiscountPilicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_o(){
        Member member = new Member(1L, "memverVIP", Grade.VIP);

        int discount = discountPilicy.discount(member, 10000);
        assertThat(discount).isEqualTo(1000);
    }

}