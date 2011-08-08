package nccu.cs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b1 = (Button) findViewById(R.id.confirm);
        b1.setOnClickListener(new Button.OnClickListener()
        {
          public void onClick(View v)
          {
            /* new�@��Intent����A�ë��w�n�Ұʪ�class */
            Intent intent = new Intent();
        	  intent.setClass(Main.this, camera.class);
        	  
        	  /* �I�s�@�ӷs��Activity */
        	  startActivity(intent);
        	  /* �����쥻��Activity */
        	  Main.this.finish();
          }
        });
    }
}