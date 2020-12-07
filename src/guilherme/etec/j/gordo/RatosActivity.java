package guilherme.etec.j.gordo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class RatosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ratos);
		
		//arrows menu
		//---------------------------------------------------------------
		ImageButton right = (ImageButton) findViewById (R.id.btn_right);
		right.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(RatosActivity.this, VeganActivity.class);
				
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_left);
				ActivityCompat.startActivity(RatosActivity.this, it, activityOptionsCompat.toBundle());
				RatosActivity.this.finish();
				//startActivity(it);
			}
			});
						
		ImageButton left = (ImageButton) findViewById (R.id.btn_left);
		left.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(RatosActivity.this, JoaoActivity.class);
				
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_right);
				ActivityCompat.startActivity(RatosActivity.this, it, activityOptionsCompat.toBundle());
				RatosActivity.this.finish();
				//startActivity(it);
			}
			});
		//---------------------------------------------------------------
		ImageButton acessar = (ImageButton) findViewById (R.id.btn_acessar);
		acessar.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(RatosActivity.this, PageRatosActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_top);
				ActivityCompat.startActivity(RatosActivity.this, it, activityOptionsCompat.toBundle());
				RatosActivity.this.finish();
			}
		}); 
	}


}
