package com.example.administrator.myretrofitdemo.backgroudAndForeground;

import android.content.Context;

public class MXKit {
	/**
	 * 监听程序是否在前台
	 *
	 * @author zhangchen
	 */
	public interface MXForegroundListener {
		void onBecameForeground(Context context);

		void onBecameBackground(Context context);
	}
}
