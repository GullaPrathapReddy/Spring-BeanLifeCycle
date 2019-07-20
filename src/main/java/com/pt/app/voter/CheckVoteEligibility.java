package com.pt.app.voter;

public class CheckVoteEligibility {

	private int age;
	private String name, addr;

	public CheckVoteEligibility(int old, String uname, String add) {
		this.age = old;
		this.name = uname;
		this.addr = add;
	}

	public void check() {
		if (name == null && age == 0) {
			throw new IllegalArgumentException("name,Age must Set With Values");
		}
	}

	public String VoteEligibilty() {
		if (age > 18) {
			return name + "--" + "u r eligible to vote";
		} else {
			return name + "--" + "u r eligible to vote";
		}
	}

	public void destroy() {
		name = null;
		age = 0;
		addr = null;
	}
}
