package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		
		//isEmpty() 적용 전
		//user = mapper.selectUser(new Search("john", new Post("정의", null)));
		user = mapper.selectUser(new Search("john", new Post(null, "고리")));
		
		//isEmpty() 적용 후
		user = mapper.selectUser(new Search("john", new Post("정의", "")));
		
		System.out.println(user);
	}
}
