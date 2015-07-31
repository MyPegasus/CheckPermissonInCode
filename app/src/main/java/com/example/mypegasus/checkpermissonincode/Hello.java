package com.example.mypegasus.checkpermissonincode;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by MyPegasus on 2015/7/31.
 */
public class Hello {

	public static final String PERMISSON_SAY_HELLO = "com.example.mypegasus.checkpermissonincode.permisson.SAY_HELLO";

	public static void sayHello(Context context) {
		int checkResult = context.checkCallingOrSelfPermission(PERMISSON_SAY_HELLO);

		if(checkResult != PackageManager.PERMISSION_GRANTED) {
			throw new SecurityException("执行 sayHello 方法需要拥有com.example.mypegasus.checkpermissonincode.permisson.SAY_HELLO权限");
		}
		System.out.println("Hello jikexueyuan");
	}
}
