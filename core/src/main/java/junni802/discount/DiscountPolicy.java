package junni802.discount;

import junni802.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
