package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map { //컬렉션을 직접 파라미터로. 파라미터네임 없다.
	List<User> selectUsers(int[] userIds);
	List<User> selectUsers2(List<String> userNames);
}
