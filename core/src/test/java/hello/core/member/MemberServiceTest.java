package hello.core.member;

import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    AppConfig appConfig = new AppConfig();
    MEmberService memberService = appConfig.memberService();

    @Test
    void MemberJoin(){
        Member member = new Member(1L, "jun", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);


        // that
        Assertions.assertThat(member).isEqualTo(findMember);
    }











//    MEmberService memberService = new MemberServiceImpl();
//    @Test
//    void join(){
//        // given
//        Member member = new Member(1L, "MemberA", Grade.VIP);
//
//        // when
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        // then
//        Assertions.assertThat(member).isEqualTo(findMember);
//    }
}
