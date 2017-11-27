package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FireAlarmModule extends AppCompatActivity /*implements View.OnClickListener*/{

//    TextView smokeLevel, smokeCondition, smokeTitle;
//    String flagLevel, flagCondition;
//    ImageView imgSmokeLevel, imgSmokeCondition;
//    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_alarm_module);

//        smokeLevel = (TextView) findViewById(R.id.txtSmokeLevel);
//        smokeCondition = (TextView) findViewById(R.id.txtSmokeCondition);
//        smokeTitle = (TextView) findViewById(R.id.txtFireAlarmTitle);
//        imgSmokeLevel = (ImageView) findViewById(R.id.imgSmokeLevel);
//        imgSmokeCondition = (ImageView) findViewById(R.id.imgSmokeCondition);

//        //Back button
//        btnBack = (Button) findViewById(R.id.btnBackAtSmoke);
//        btnBack.setOnClickListener(this);

//        //get globalValue to check status
//        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
//        flagLevel = globalValue.getSmokeBool();
//
//        if (flagLevel.equals("0")) {
//            imgSmokeLevel.setImageResource(R.drawable.firealarm2);
//            imgSmokeCondition.setImageResource(R.drawable.air);
//            smokeCondition.setText("Clear");
//            smokeLevel.setText("Low");
//            smokeTitle.setText("Air condition is good.");
//        }else if (flagLevel.equals("1")) {
//            imgSmokeLevel.setImageResource(R.drawable.firealarm1);
//            imgSmokeCondition.setImageResource(R.drawable.fire3);
//            smokeCondition.setText("Danger!");
//            smokeLevel.setText("High");
//            smokeTitle.setText("Fire Alert!");
//        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fire_alarm_module, menu);
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

//    @Override
//    public void onClick(View v) {
//        finish();
//    }
}
