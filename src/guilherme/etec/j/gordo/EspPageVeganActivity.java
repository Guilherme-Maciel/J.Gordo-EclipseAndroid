package guilherme.etec.j.gordo;

import android.net.Uri;
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

public class EspPageVeganActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esp_page_vegan);
		
		ImageButton back = (ImageButton) findViewById (R.id.btn_back);
		back.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(EspPageVeganActivity.this, EspVeganActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_bottom);
				ActivityCompat.startActivity(EspPageVeganActivity.this, it, activityOptionsCompat.toBundle());
				EspPageVeganActivity.this.finish();
				
			}
		}); 
		
		//Typing fonts
		//---------------------------------------------------------
		Typeface punkKid = Typeface.createFromAsset(getAssets(), "fonts/punk_kid.ttf");
		Typeface newRocker = Typeface.createFromAsset(getAssets(), "fonts/new_rocker.ttf");
		
		TextView vegan = (TextView) findViewById(R.id.txt_vegan);
		vegan.setTypeface(punkKid);
		
		TextView aboutUs = (TextView) findViewById(R.id.txt_about);
		aboutUs.setTypeface(newRocker); 
		
		TextView desc1 = (TextView) findViewById(R.id.txt_desc);
		desc1.setTypeface(newRocker); 
		
		TextView desc2 = (TextView) findViewById(R.id.txt_desc2);
		desc2.setTypeface(newRocker); 
		
		TextView bePart = (TextView) findViewById(R.id.txt_bePart);
		bePart.setTypeface(newRocker); 
		
		TextView deposit = (TextView) findViewById(R.id.txt_deposit);
		deposit.setTypeface(newRocker); 
		
		TextView bank = (TextView) findViewById(R.id.txt_bank);
		bank.setTypeface(newRocker);
		
		TextView agency = (TextView) findViewById(R.id.txt_agency);
		agency.setTypeface(newRocker);
		
		TextView comp = (TextView) findViewById(R.id.txt_comp);
		comp.setTypeface(newRocker);
		//---------------------------------------------------------
		
		ImageButton facebook = (ImageButton) findViewById(R.id.btn_facebook);
		facebook.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SolidariedadeVegan")));
			}
		});
		
		ImageButton instagram = (ImageButton) findViewById(R.id.btn_instagram);
		instagram.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/solidariedadevegan")));
			}
		});
		
		ImageButton catarse = (ImageButton) findViewById(R.id.btn_catarse);
		catarse.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.catarse.me/solidaridade_vegan_maritas_sem_crueldade_animal_9084?project_id=112847")));
			}
		});
		
		ImageButton picpay = (ImageButton) findViewById(R.id.btn_picpay);
		picpay.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.picpay.com/")));
			}
		});
		
		ImageButton paypal = (ImageButton) findViewById(R.id.btn_paypal);
		paypal.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/")));
			}
		});
		//--------------------------------------------------------------------------------------
	}

}
