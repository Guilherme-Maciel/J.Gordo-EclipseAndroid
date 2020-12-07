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

public class EspPageRatosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esp_page_ratos);
		
		ImageButton back = (ImageButton) findViewById (R.id.btn_back);
		back.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(EspPageRatosActivity.this, EspRatosActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_bottom);
				ActivityCompat.startActivity(EspPageRatosActivity.this, it, activityOptionsCompat.toBundle());
				EspPageRatosActivity.this.finish();
				
			}
		}); 
		
		//Typing fonts
		//-------------------------------------------------------------
		Typeface punkKid = Typeface.createFromAsset(getAssets(), "fonts/punk_kid.ttf");
		Typeface newRocker = Typeface.createFromAsset(getAssets(), "fonts/new_rocker.ttf");
		
		TextView ratos = (TextView) findViewById(R.id.txt_ratos);
		ratos.setTypeface(punkKid);
		
		TextView listen = (TextView) findViewById(R.id.txt_listenIn);
		listen.setTypeface(newRocker);
		
		TextView page = (TextView) findViewById(R.id.txt_faPages);
		page.setTypeface(newRocker);
		
		TextView ecommerce = (TextView) findViewById(R.id.txt_ecommerce);
		ecommerce.setTypeface(newRocker);
		//-------------------------------------------------------------
		//Social and Links buttons
		//-------------------------------------------------------------
				ImageButton spotify = (ImageButton) findViewById(R.id.btn_spotify);
				spotify.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/artist/3d2xlrGC9JGD7ycsf0e8mF?autoplay=true")));
					}
				});
				
				ImageButton deezer = (ImageButton) findViewById(R.id.btn_deezer);
				deezer.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.deezer.com/br/artist/1255587/radio?autoplay=true")));
					}
				});
				
				ImageButton ytmusic = (ImageButton) findViewById(R.id.btn_ytmusic);
				ytmusic.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.youtube.com/channel/UCa80TTBFcm_c4jb2MPhIBuw")));
					}
				});
				
				ImageButton facebook = (ImageButton) findViewById(R.id.btn_facebook);
				facebook.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RatosdePoraoOficial")));
					}
				});
				
				ImageButton instagram = (ImageButton) findViewById(R.id.btn_instagram);
				instagram.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ratosdeporao/?hl=pt-br")));
					}
				});
				
				ImageButton rdpeido = (ImageButton) findViewById(R.id.btn_rdpeido);
				rdpeido.setOnClickListener (new View.OnClickListener(){
					public void onClick(View arg0){
						startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rdpeido.com.br/")));
					}
				});
			//-------------------------------------------------------------
	}


}
