package guilherme.etec.j.gordo;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Handler timer = new Handler();
        timer.postDelayed(this, 5000);
    }
    public void run(){
    	startActivity(new Intent(this, LanguageActivity.class));
    	MainActivity.this.finish();
    }
}
