package junni802.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class memberTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    @DisplayName("회원가입 및 회원정보 찾기 기능")
    void MemberTest(){
        Member member = new Member(1L, "MemberA", Grade.VIP);

        memberService.join(member);

        Member findId = memberService.findMember(member.getId());

        Assertions.assertThat(findId).isEqualTo(member);
    }


}
