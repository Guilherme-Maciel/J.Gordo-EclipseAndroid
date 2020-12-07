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

public class EspRatosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esp_ratos);
		
		//arrows menu
		//---------------------------------------------------------------
		ImageButton right = (ImageButton) findViewById (R.id.btn_right);
		right.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(EspRatosActivity.this, EspVeganActivity.class);
				
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_left);
				ActivityCompat.startActivity(EspRatosActivity.this, it, activityOptionsCompat.toBundle());
				EspRatosActivity.this.finish();
				//startActivity(it);
		}
		});
		
		ImageButton left = (ImageButton) findViewById (R.id.btn_left);
		left.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(EspRatosActivity.this, EspJoaoActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_right);
				ActivityCompat.startActivity(EspRatosActivity.this, it, activityOptionsCompat.toBundle());
				EspRatosActivity.this.finish();
				//startActivity(it);
		}
		});
		//---------------------------------------------------------------
		ImageButton acessar = (ImageButton) findViewById (R.id.btn_acessar);
		acessar.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(EspRatosActivity.this, EspPageRatosActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_top);
				ActivityCompat.startActivity(EspRatosActivity.this, it, activityOptionsCompat.toBundle());
				EspRatosActivity.this.finish();
			}
		}); 
	}

}
