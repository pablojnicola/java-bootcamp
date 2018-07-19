package com.globant.bootcamp.recentFileList;

import java.util.ArrayList;

public class BlogDataBaseManager {

	protected ArrayList<BlogEntry> entryList;

	private static final int RECENT_ENTRIES_LIMIT = 10;

	private static final int ENTRYLIST_MAXSIZE = 15;

	public BlogDatabase(){
		
		entryList = new ArrayList<BlogEntry>();
	}

	public boolean addUserEntry(User user, String userEntry, FileAttached file) {

		if (entryList.size() < ENTRYLIST_MAXSIZE) {

			BlogEntry entry = new BlogEntry(user, userEntry, file);
			entryList.add(entry);
			return true;
		}

		return false;
	}

	/**
	 * @ This method returns 'true' value if the removal was successfull by
	 * previously checking the equality between the user's name and their
	 * corresponding entry.
	 */
	public boolean removeUserEntry(User user, String userEntry) {

		for (BlogEntry entry : entryList) {

			if ((entry.getUser().getUserName().equals(user.getUserName())) && (entry.getUserEntry().equals(userEntry))) {

				entryList.remove(entry);
				return true;
			}
		}
		return false;
	}

	/**
	 * @ This method gives back an arraylist containing 10 most recent entries.
	 */
	public ArrayList<BlogEntry> show10MostRecentEntries() {

		ArrayList<BlogEntry> recentEntries = new ArrayList<BlogEntry>();

		if (entryList.size() < RECENT_ENTRIES_LIMIT) {

			return entryList;

		} else {

			for (int i = 10; i > 0; i--) {

				recentEntries.add(entryList.get(i));

			}

			return recentEntries;

		}
	}

}
