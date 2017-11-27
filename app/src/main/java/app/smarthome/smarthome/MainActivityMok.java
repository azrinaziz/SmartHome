package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityMok extends Activity implements View.OnClickListener {
    Button doorSensor, smokeDetector, gasSensor, temperatureSensor, humiditySensor;
    ImageButton home;
    int press = 0;
    String doorBool, tempBool, smokeBool, gasBool, humBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mok);

        Bundle basket = getIntent().getExtras();
        doorBool = basket.getString("doorKey");
        tempBool = basket.getString("tempKey");
        smokeBool = basket.getString("gasKey");
        gasBool = basket.getString("smokeKey");
        humBool = basket.getString("humKey");

        home = findViewById(R.id.imageButton);
        doorSensor = findViewById(R.id.button1);
        smokeDetector = findViewById(R.id.button2);
        gasSensor = findViewById(R.id.button3);
        temperatureSensor = findViewById(R.id.button4);
        humiditySensor = findViewById(R.id.button5);

        home.setOnClickListener(this);
        doorSensor.setOnClickListener(this);
        smokeDetector.setOnClickListener(this);
        gasSensor.setOnClickListener(this);
        temperatureSensor.setOnClickListener(this);
        humiditySensor.setOnClickListener(this);


    }


    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button1:
                Intent a = new Intent(MainActivityMok.this, doorSensor.class);
                press = 1;
                startActivityForResult(a, 0);
                break;

            case R.id.button2:
                Intent b = new Intent(MainActivityMok.this, smokeDetector.class);
                press = 2;
                startActivityForResult(b, 0);
                break;

            case R.id.button3:
                Intent c = new Intent(MainActivityMok.this, gasSensor.class);
                press = 3;
                startActivityForResult(c, 0);
                break;

            case R.id.button4:
                Intent d = new Intent(MainActivityMok.this, temperatureSensor.class);
                press = 4;
                startActivityForResult(d, 0);
                break;

            case R.id.button5:
                Intent e = new Intent(MainActivityMok.this, humiditySensor.class);
                press = 5;
                startActivityForResult(e, 0);
                break;

            case R.id.imageButton:
                Intent i = new Intent();
                Bundle basket = new Bundle();
                basket.putString("doorKey", doorBool);
                basket.putString("smokeKey", smokeBool);
                basket.putString("gasKey", gasBool);
                basket.putString("tempKey", tempBool);
                basket.putString("humKey", humBool);
                i.putExtras(basket);
                setResult(RESULT_OK, i);
                finish();
                break;
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        //set globalvalue to store related info
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();

        if (resultCode == RESULT_OK && press == 1) {
            Bundle basket = data.getExtras();
            doorBool = basket.getString("doorKey");
            globalValue.setDoorBool(doorBool);
            globalValue.setDoorOpenBool(doorBool);
        } else if (resultCode == RESULT_OK && press == 2) {
            Bundle basket = data.getExtras();
            smokeBool = basket.getString("smokeKey");
            globalValue.setSmokeBool(smokeBool);
        } else if (resultCode == RESULT_OK && press == 3) {
            Bundle basket = data.getExtras();
            gasBool = basket.getString("gasKey");
            globalValue.setGasBool(gasBool);
        } else if (resultCode == RESULT_OK && press == 4) {
            Bundle basket = data.getExtras();
            tempBool = basket.getString("tempKey");
            globalValue.setTempBool(tempBool);
        } else if (resultCode == RESULT_OK && press == 5) {
            Bundle basket = data.getExtras();
            humBool = basket.getString("humKey");
            globalValue.setHumBool(humBool);
        }
    }
}




    /*public boolean onTouch(View v, MotionEvent event)
    {
        // TODO Auto-generated method stub
        switch (v.getId())
        {
            case R.id.btnKeyPad1:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad1.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad1.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad2:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad2.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad2.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad3:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad3.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad3.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad4:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad4.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad4.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad5:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad5.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad5.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad6:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad6.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad6.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad7:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad7.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad7.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad8:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad8.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad8.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad9:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad9.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad9.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad0:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad0.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad0.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPad00:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPad00.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPad00.setBackgroundResource(R.color.lightBlue);
                break;
            case R.id.btnKeyPadArrow:
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL)
                    btnKeyPadArrow.setBackgroundResource(R.drawable.blackkeypad_box_background);
                else
                    btnKeyPadArrow.setBackgroundResource(R.color.lightBlue);
                break;
            default:
                break;
        }
        return false;
    }*/

