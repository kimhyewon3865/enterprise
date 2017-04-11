package Member;

public class MemberDao {
	private static long nextId = 0;

	public void insert(Member member) {
		member.setId(++nextId);
		
	}
	
}
