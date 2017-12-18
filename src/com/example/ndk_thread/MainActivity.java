package com.example.ndk_thread;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	private PosixThread p;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		p = new PosixThread();
		p.init();
	}
	
	public void click(View view){
		p.pthread();
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		p.destroy();
	}
}
