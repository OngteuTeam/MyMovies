package aiti.m1403l.group1.utils;

import aiti.m1403l.group1.data.DatabaseWrapper;
import aiti.m1403l.group1.network.APIProcess;
import android.content.Context;

public class Loader {
	
	private final Context context; 
	
	public Loader(Context context) {
		super();
		this.context = context;
		new DatabaseWrapper(context);
		
		MySPManager spManager = new MySPManager(context);
		
		if (spManager.isFirstRun()) {
			APIProcess.sendRequestFirstRun(context);
		} else {
			APIProcess.sendRequestUpdate(context);
		}
		
	}
	
}
