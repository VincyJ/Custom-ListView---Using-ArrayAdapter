package com.example.listview_custom_arrayadapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lv;
	String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.single_row,R.id.textView1, days);
		lv.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
