package andro.jf.androclassloader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MonProfil extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mon_profil);

		//Contremesure attaque 3
		Profil myProfile = (Profil) getIntent().getSerializableExtra("myProfile");
		String name = myProfile.name;
		int age = myProfile.age;

		//String name = MainActivity.myProfileForReadOnlyPurpose.name;
		//int age = MainActivity.myProfileForReadOnlyPurpose.age;
		TextView moi = (TextView)findViewById(R.id.moi);
		moi.setText("I am " + name + "("+ age + " years old)");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mon_profil, menu);
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
