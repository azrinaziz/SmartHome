package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AKLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aklight);

        TextView status = findViewById(R.id.txtAKLight);
        ImageView status2 = findViewById(R.id.imgAKLight);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String bool = globalValue.getKitchenBool();

        if (bool.equals("0")) //closed
        {
            status2.setImageResource(R.drawable.lightoff1);
            status.setText("Light : Off");
        }else if (bool.equals("1")){
            status2.setImageResource(R.drawable.lighton1);
            status.setText("Light : On");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aklight, menu);
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
