package guilherme.etec.j.gordo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class VeganActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vegan);
		
		//arrows menu
		//---------------------------------------------------------------
		ImageButton right = (ImageButton) findViewById (R.id.btn_right);
		right.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(VeganActivity.this, JoaoActivity.class);
				
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_left);
				ActivityCompat.startActivity(VeganActivity.this, it, activityOptionsCompat.toBundle());
				VeganActivity.this.finish();
				//startActivity(it);
		}
		});
		
		ImageButton left = (ImageButton) findViewById (R.id.btn_left);
		left.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(VeganActivity.this, RatosActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_right);
				ActivityCompat.startActivity(VeganActivity.this, it, activityOptionsCompat.toBundle());
				VeganActivity.this.finish();
		}
		});
		//---------------------------------------------------------------
		
		ImageButton acessar = (ImageButton) findViewById (R.id.btn_acessar);
		acessar.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(VeganActivity.this, PageVeganActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_top);
				ActivityCompat.startActivity(VeganActivity.this, it, activityOptionsCompat.toBundle());
				VeganActivity.this.finish();
			}
		}); 
	}


}
