package com.string;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilderEx sb = new StringBuilderEx();
		sb.append("Damini");
		sb.append("Kumari");
		
		System.out.println(sb);
		System.out.println(sb.insert(0, " Singh"));
		System.out.println(sb.delete(6, 9));
		System.out.println(sb.reverse("Damini"));

	}

}
