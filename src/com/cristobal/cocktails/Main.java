package com.cristobal.cocktails;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends Activity {

	protected static final String TAG = "Main Activity";


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn = (Button) findViewById(R.id.btnCocktailSel);
		RadioGroup radGroup = (RadioGroup) findViewById(R.id.radioGroup);
		int checkRadioId = radGroup.getCheckedRadioButtonId();
				

		
/*		btn.setOnClickListener( new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
*/	
		
	}

	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.cocktail_1:
	            if (checked)
	            	Log.v(TAG, "cocktail_1");
	            	Toast.makeText(this, "cocktail_1", Toast.LENGTH_SHORT).show();
	            break;
	        case R.id.cocktail_2:
	            if (checked)
	            	Log.v(TAG, "cocktail_2");
	            	Toast.makeText(this, "cocktail_2", Toast.LENGTH_SHORT).show();
	            break;
	    }
	}		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}