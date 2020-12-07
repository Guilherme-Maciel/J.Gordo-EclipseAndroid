package guilherme.etec.j.gordo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class LanguageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_language);
		
		Typeface punkKid = Typeface.createFromAsset(getAssets(), "fonts/punk_kid.ttf");
		TextView language = (TextView) findViewById(R.id.txt_language);
		language.setTypeface(punkKid);
		
		ImageButton brasil = (ImageButton) findViewById (R.id.btn_brasil);
		brasil.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(LanguageActivity.this, VeganActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
				ActivityCompat.startActivity(LanguageActivity.this, it, activityOptionsCompat.toBundle());
				LanguageActivity.this.finish();
				
			}
		}); 
		
		ImageButton inglaterra = (ImageButton) findViewById (R.id.btn_inglaterra);
		inglaterra.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(LanguageActivity.this, EnVeganActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
				ActivityCompat.startActivity(LanguageActivity.this, it, activityOptionsCompat.toBundle());
				LanguageActivity.this.finish();
				
			}
		}); 
		
		ImageButton espanha = (ImageButton) findViewById (R.id.btn_espanha);
		espanha.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(LanguageActivity.this, EspVeganActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.fade_out);
				ActivityCompat.startActivity(LanguageActivity.this, it, activityOptionsCompat.toBundle());
				LanguageActivity.this.finish();
				
			}
		}); 
		
		
	}


}
