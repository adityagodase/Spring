package com.durgasoft.beans;

public class WishBean {
	private String name;
	private String wishMsg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWishMsg() {
		return wishMsg;
	}

	public void setWishMsg(String wishMsg) {
		this.wishMsg = wishMsg;
	}

	public String wishUser() {
		return "Hello" + name + "," + wishMsg;
	}

}
