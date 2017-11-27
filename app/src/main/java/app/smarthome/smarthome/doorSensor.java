package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class doorSensor extends Activity implements View.OnClickListener{
    Button authorized, unauthorized;
    String doorbool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doorsensor);

        authorized = findViewById(R.id.button1);
        unauthorized = findViewById(R.id.button2);

        authorized.setOnClickListener(this);
        unauthorized.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.button1:
                doorbool = "0";
                break;

            case R.id.button2:
                doorbool = "1";
                break;
        }

        Intent i = new Intent();
        Bundle basket = new Bundle();
        basket.putString("doorKey", doorbool);
        i.putExtras(basket);
        setResult(RESULT_OK, i);
        finish();
    }
}

