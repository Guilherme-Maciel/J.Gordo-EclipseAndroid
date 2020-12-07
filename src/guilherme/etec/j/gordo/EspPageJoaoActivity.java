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

public class EspPageJoaoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_esp_page_joao);
		
		ImageButton back = (ImageButton) findViewById (R.id.btn_back);
		back.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				
				Intent it = new Intent(EspPageJoaoActivity.this, EspJoaoActivity.class);
				ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(), R.anim.fade_in, R.anim.move_bottom);
				ActivityCompat.startActivity(EspPageJoaoActivity.this, it, activityOptionsCompat.toBundle());
				EspPageJoaoActivity.this.finish();
				
			}
		}); 
		
		//Typing fonts
		//-----------------------------------------------------------
		Typeface punkKid = Typeface.createFromAsset(getAssets(), "fonts/punk_kid.ttf");
		Typeface newRocker = Typeface.createFromAsset(getAssets(), "fonts/new_rocker.ttf");
		Typeface pristina = Typeface.createFromAsset(getAssets(), "fonts/pristina.ttf");
		
		TextView joao = (TextView) findViewById(R.id.txt_joao);
		joao.setTypeface(punkKid);
		
		TextView social = (TextView) findViewById(R.id.txt_social);
		social.setTypeface(newRocker);
		
		TextView face = (TextView) findViewById(R.id.txt_face);
		face.setTypeface(newRocker);
		
		TextView descFace = (TextView) findViewById(R.id.txt_descFace);
		descFace.setTypeface(newRocker);
		
		TextView insta = (TextView) findViewById(R.id.txt_insta);
		insta.setTypeface(newRocker);
		
		TextView descInsta = (TextView) findViewById(R.id.txt_descInsta);
		descInsta.setTypeface(newRocker);
		
		TextView twitter = (TextView) findViewById(R.id.txt_twitter);
		twitter.setTypeface(newRocker);
		
		TextView descTwitter = (TextView) findViewById(R.id.txt_descTwitter);
		descTwitter.setTypeface(newRocker);
		
		TextView panelaco = (TextView) findViewById(R.id.txt_panelaco);
		panelaco.setTypeface(newRocker);
		
		TextView sub1 = (TextView) findViewById(R.id.txt_sub1);
		sub1.setTypeface(pristina);
		
		TextView sub2 = (TextView) findViewById(R.id.txt_sub2);
		sub2.setTypeface(pristina);
		
		TextView book = (TextView) findViewById(R.id.txt_book);
		book.setTypeface(newRocker);
		
		TextView bookDesc = (TextView) findViewById(R.id.txt_bookDesc1);
		bookDesc.setTypeface(newRocker);
		
		TextView bookDesc2 = (TextView) findViewById(R.id.txt_bookDesc2);
		bookDesc2.setTypeface(newRocker);
		
		TextView asteroids = (TextView) findViewById(R.id.txt_asteroids);
		asteroids.setTypeface(newRocker);
		
		TextView anos = (TextView) findViewById(R.id.txt_anos);
		anos.setTypeface(newRocker);
		
		TextView rdp = (TextView) findViewById(R.id.txt_rdp);
		rdp.setTypeface(newRocker);
		
		TextView listen = (TextView) findViewById(R.id.txt_listen);
		listen.setTypeface(newRocker);
		
		
		//---------------------------------------------------------------
		
		//Social Medias
		//---------------------------------------------------------------
		ImageButton facebook = (ImageButton) findViewById(R.id.btn_facebook);
		facebook.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/joaogordooficial/")));
			}
		});
		
		ImageButton instagram = (ImageButton) findViewById(R.id.btn_instagram);
		instagram.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/jgordo/?hl=pt-br")));
			}
		});
		
		ImageButton btntwitter = (ImageButton) findViewById(R.id.btn_twitter);
		btntwitter.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/joao_gordo_")));
			}
		});
		//---------------------------------------------------------------
		
		//Panelaço
		//---------------------------------------------------------------
		ImageButton canal = (ImageButton) findViewById(R.id.btn_channel);
		canal.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/panelacooficial")));
			}
		});
		ImageButton play1 = (ImageButton) findViewById(R.id.btn_panelaco);
		play1.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfpN-5KRZ036_u-wHyq_sFyj79fsMWdmr")));
			}
		});
		ImageButton play2 = (ImageButton) findViewById(R.id.btn_clube);
		play2.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfpN-5KRZ034n4_mVUWX5lN3IwbYcxNuy")));
			}
		});
		//---------------------------------------------------------------
		
		//Book
		//---------------------------------------------------------------
		ImageButton amazon = (ImageButton) findViewById(R.id.btn_amazon);
		amazon.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.br/João-Gordo-Viva-Vida-Tosca/dp/8594540140")));
			}
		});
		
		ImageButton saraiva = (ImageButton) findViewById(R.id.btn_saraiva);
		saraiva.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saraiva.com.br/joao-gordo-viva-la-vida-tosca-9388851/p")));
			}
		});

		//---------------------------------------------------------------
		
		ImageButton clip = (ImageButton) findViewById(R.id.btn_clip);
		clip.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gG-LmLfo2hc&feature=share&fbclid=IwAR1ncgjjNAqVLgRQluuusZLnmXm0p0dbQizPoX1Vi6vZUvPpJwSla8xPYHw")));
			}
		});
	}


}
