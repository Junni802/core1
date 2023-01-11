package junni802.member;

public interface MemberRepository {
    void save(Member member);

    Member findbyId(Long Id);
}
