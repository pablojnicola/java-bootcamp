package com.globant.bootcamp.recentFileList;

public class BlogManagerFake extends BlogDataBaseManager {

	private ArrayList<String> simulatedEntries;

	public BlogManagerFake() {

		super();
		simulatedEntries = new ArrayList<String>();

	}

	@Override
	public boolean addUserEntry(User user, String userEntry, FileAttached file) {

		simulatedEntries.add(userEntry);
		return true;

	}

	@Override
	public boolean removeUserEntry(User user, String userEntry) {

		for (int i = 0; i < simulatedEntries.size(); i++) {

			if (simulatedEntries.get(i).equals(userEntry)) {

				simulatedEntries.remove(i);
				return true;

			}

		}
		return false;

	}
	
	public ArrayList<String> getSimulatedEntries(){
		
		return simulatedEntries;
		
	}

}
