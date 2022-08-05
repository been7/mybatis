package ch05.ex06;

import java.util.List;

public class Search { //파라미터밸류가 n개다 = 컬렉션 얘기하는거다.
	private int[] userIds; 
	private List<String> userNames;
	
	public Search(int[] userIds, List<String> userNames) {
		this.userIds = userIds;
		this.userNames = userNames;
	}
}
/*
in any all 이어야 파라미터밸류 n개..?
*/