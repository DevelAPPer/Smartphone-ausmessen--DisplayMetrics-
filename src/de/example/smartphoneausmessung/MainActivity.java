package de.example.smartphoneausmessung;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	private int breiteflaeche,hoeheflaeche;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Initzialisierung
		DisplayMetrics dm = MainActivity.this.getResources().getDisplayMetrics();
		breiteflaeche = dm.widthPixels;
		hoeheflaeche = dm.heightPixels;
		Toast.makeText(getApplicationContext(), Integer.toString(breiteflaeche)+" "+
				Integer.toString(hoeheflaeche), Toast.LENGTH_LONG).show();
		
	}

}
