package ch05.ex05;

import ch05.domain.User;

public interface Map { //권장X, 가독성 떨어짐.
	User selectUser(String userName); //파라미터네임 없음..
}
