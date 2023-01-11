package hello.core.member;

public interface MEmberService {
    void join(Member member);   // 회원 정보를 주입시키는 메소드

    Member findMember(Long memberId);   // 회원ID로 회원을 찾는 메서드


}
