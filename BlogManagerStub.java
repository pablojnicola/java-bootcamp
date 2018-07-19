package com.globant.bootcamp.recentFileList;

public class BlogManagerStub extends BlogDataBaseManager {

	public BlogManagerStub() {

		super();

	}

@Override	
public ArrayList<BlogEntry> show10MostRecentEntries(){
		
		return entryList;

}
