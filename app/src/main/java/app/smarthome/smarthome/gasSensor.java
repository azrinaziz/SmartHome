package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gasSensor extends Activity implements View.OnClickListener{
    private String gasBool;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gassensor);

        Button presence = findViewById(R.id.button1);
        Button absence = findViewById(R.id.button2);

        presence.setOnClickListener(this);
        absence.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.button1:
                gasBool = "1";
                break;

            case R.id.button2:
                gasBool = "0";
                break;
        }

        Intent i = new Intent();
        Bundle basket = new Bundle();
        basket.putString("gasKey", gasBool);
        i.putExtras(basket);
        setResult(RESULT_OK, i);
        finish();
    }

}
