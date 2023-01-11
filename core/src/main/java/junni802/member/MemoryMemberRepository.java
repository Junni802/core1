package junni802.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    public static Map<Long, Member> store = new HashMap<>();    // 메모리 저장 구현이므로 임의로 Map을 만들어 저장하기 위한 용도로 사용

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findbyId(Long Id) {
        return store.get(Id);
    }
}
