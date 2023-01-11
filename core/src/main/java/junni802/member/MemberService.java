package junni802.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long Id);
}
