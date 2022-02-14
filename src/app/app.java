package app;

import manageInstance.Singleton;

public class app {

	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
	}

}
