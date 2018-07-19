package com.globant.bootcamp.recentFileList;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Test;

public BlogDataBaseManagerTest{
	
	@Test
	public void testAddUserEntry(){
		
	   BlogManagerFake blogFake = new BlogManagerFake();
	   User user=new User("JuanPerez");
	   FileAttached file=new FileAttached("C:\\Users\\JuanPerez\\Desktop",".docx","summary");
	   blogFake.addUserEntry(user,"user entry test" ,file);
	   assertEquals(1, blogFake.getSimulatedEntries().size());
	   
	}
	
	@Test
	public void testRemoveUserEntry(){
		
	   BlogManagerFake blogFake = new BlogManagerFake();
	   User user=new User("JuanPerez");
	   FileAttached file=new FileAttached("C:\\Users\\JuanPerez\\Desktop",".docx","summary");
	   blogFake.addUserEntry(user,"user entry test" ,file);
	   blog.removeUserEntry(user,"user entry test");
	   assertEquals(0, blogFake.getSimulatedEntries().size());
	   
	}
	
	@Test
	public void testShow10MostRecentEntries(){
		
	   BlogManagerStub blogStub = new BlogManagerStub();
	   User user=new User("JuanPerez");
	   FileAttached file=new FileAttached("C:\\Users\\JuanPerez\\Desktop",".docx","summary");
	   
	   for (int i=0; i<10;i++) {
		
		  blogStub.addUserEntry(user, "test number "+i, file);
		
	   }
	   
	   ArrayList<BlogEntry> recentEntries = blogStub.show10MostRecentEntries();
	   assertEquals(10, recentEntries.size());
	}
	
}