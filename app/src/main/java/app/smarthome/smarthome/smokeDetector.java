package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class smokeDetector extends Activity implements View.OnClickListener{
    private String smokeBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smokedetector);

        Button presence = findViewById(R.id.button1);
        Button absence = findViewById(R.id.button2);

        presence.setOnClickListener(this);
        absence.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.button1:
                smokeBool = "1";
                break;

            case R.id.button2:
                smokeBool = "0";
                break;

        }

        Intent i = new Intent();
        Bundle basket = new Bundle();
        basket.putString("smokeKey", smokeBool);
        i.putExtras(basket);
        setResult(RESULT_OK, i);
        finish();
    }
}
