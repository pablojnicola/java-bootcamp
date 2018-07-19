package com.globant.bootcamp.recentFileList;

import java.util.Date;

public class BlogEntry {

	private User user;
	private String userEntry;
	private FileAttached file;
	private Date date;

	public BlogEntry(User user, String userEntry, FileAttached file) {

		this.user = user;
		this.userEntry = userEntry;
		this.file = file;
		date = new Date();

	}

	public User getUser() {

		return user;

	}

	public String getUserEntry() {

		return userentry;

	}

	public Date getDate() {

		return date;

	}

}
