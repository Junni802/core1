package junni802.discount;

import junni802.member.Grade;
import junni802.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    int sale = 10;

    @Override
    public int discount(Member member, int price) {
        if(Grade.VIP == member.getGrade()){
            return price * sale / 100;
        }else {
            return 0;
        }

    }
}
