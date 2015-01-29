package com.nilesh.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {
	
	@InjectView(R.id.title) TextView title;
	@InjectView(R.id.subtitle) TextView subtitle;
	@InjectView(R.id.hello) Button hello;
	@InjectView(R.id.footer) TextView footer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ButterKnife.inject(this);

	    // Contrived code to use the "injected" views.
	    title.setText("Butter Knife");
	    subtitle.setText("View \"injection\" for Android.");
	    footer.setText("by Jake Wharton");
	    hello.setText("Say Hello");
	    
	}
	
	@OnClick(R.id.hello) void submit() {
		Log.i("BTN text ", hello.getText().toString());
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
