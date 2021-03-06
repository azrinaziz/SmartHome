package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Asmoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmoke);

        TextView status = findViewById(R.id.txtAsmoke);
        ImageView status2 = findViewById(R.id.imgAsmoke);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String bool = globalValue.getSmokeBool();

        if (bool.equals("0")) //closed
        {
            status2.setImageResource(R.drawable.firealarmoff);
            status.setText("Fire Alarm : Sleep");
        }else if (bool.equals("1")){
            status2.setImageResource(R.drawable.firealarmon);
            status.setText("Fire Alarm : Activated");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_asmoke, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return id == R.id.action_settings || super.onOptionsItemSelected(item);

    }
}
