import hello.core.member.Grade;
import hello.core.member.MEmberService;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.order.AppConfig;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MEmberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(findMember.getName());
    }
}
