package hello.core;

import hello.core.member.Grade;
import hello.core.member.MEmberService;
import hello.core.member.Member;
import hello.core.order.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
//    AppConfig appConfig = new AppConfig();
//    MEmberService memberService = appConfig.memberService();
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MEmberService mEmberService = applicationContext.getBean("memberService", MEmberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);

        Member findMember = mEmberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }



}
