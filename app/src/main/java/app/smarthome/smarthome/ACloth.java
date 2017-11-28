package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ACloth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acloth);

        TextView status = findViewById(R.id.txtAcloth);
        ImageView status2 = findViewById(R.id.imgACloth);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String bool = globalValue.getClothHorseBool();

        if (bool.equals("0")) //closed
        {
            status.setText("Cloth Horse : Protection Mode Off");
        }else if (bool.equals("1")){
            status.setText("Cloth Horse : Protection Mode On");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acloth, menu);
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
