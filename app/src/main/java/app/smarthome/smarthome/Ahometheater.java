package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Ahometheater extends AppCompatActivity {

    TextView Status;
    ImageView Status2;
    String Bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahometheater);

//        Status = (TextView)findViewById(R.id.txtAsmoke);
//        Status2 = (ImageView)findViewById(R.id.imgAsmoke);
//
//        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
//        Bool = globalValue.getSmokeBool();
//
//        if (Bool.equals("0")) //closed
//        {
//            Status2.setImageResource(R.drawable.firealarmoff);
//            Status.setText("Fire Alarm : Sleep");
//        }else if (Bool.equals("1")){
//            Status2.setImageResource(R.drawable.firealarmon);
//            Status.setText("Fire Alarm : Activated");
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ahometheater, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
