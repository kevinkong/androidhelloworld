package com.netease.android.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherActivity extends Activity {
	private Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activity);
		btn = (Button) findViewById(R.id.button2);
		btn.setOnClickListener(button_listener);
		System.out.println();
	}

	// 定义button的点击响应方法
		private Button.OnClickListener button_listener = new Button.OnClickListener() {
			public void onClick(View v) {
				 Intent intent = new Intent();
	             intent.setClass(OtherActivity.this, MainActivity.class); 
	             startActivity(intent);  
			}
		};
}
