package junni802.order;

import hello.core.order.Order;
import junni802.discount.DiscountPolicy;
import junni802.discount.RateDiscountPolicy;
import junni802.member.Member;
import junni802.member.MemberRepository;
import junni802.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findbyId(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
