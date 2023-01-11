package junni802.member;

public class MemberServiceImpl implements MemberService{

    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long Id) {
        return memberRepository.findbyId(Id);
    }
}
