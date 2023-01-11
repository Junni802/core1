package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MEmberService;
import hello.core.member.MemberRepository;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberOepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MEmberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    @Bean
    public static MemoryMemberOepository getMemberRepository() {
        return new MemoryMemberOepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(getMemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

}
