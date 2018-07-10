package com.globant.bootcamp.proxy;

import java.util.*;

public abstract class DataBaseAccess {

	public void accessDataBase() {

		System.out.println(this.getClass().getSimpleName() + " access granted at: " + new Date());

	}

}
