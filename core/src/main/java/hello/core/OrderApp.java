package hello.core;

import hello.core.member.Grade;
import hello.core.member.MEmberService;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.order.AppConfig;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MEmberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 1000);

        System.out.println(order);
        System.out.println(order.calculatePrice());
    }
}
