package e.giuseppemonetti.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //LAYOUT'S VIEW
    private TextView vMessage;
    private Button vAdd;
    private Button vReduce;
    private Button vAzzera;
    private CheckBox vRaddoppia;
    private final String TAG = "PRINCIPALE";


    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RIFERIMENTI LAYOUT
        vMessage = findViewById(R.id.textMessage);
        vAdd = findViewById(R.id.btnAdd);
        vReduce = findViewById(R.id.btnReduce);
        vAzzera = findViewById(R.id.btnAzzera);
        vRaddoppia = findViewById(R.id.chkRaddoppia);

        //BUTTON ACTION
        vAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vRaddoppia.isChecked())
                    ++cont;
                ++cont;
                Log.v(TAG,"cont " + cont);
                visualizzaMex();
            }
        });
        vReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vRaddoppia.isChecked())
                    --cont;
                --cont;
                Log.v(TAG,"cont " + cont);
                visualizzaMex();
            }
        });
        vAzzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = 0;
                Log.v(TAG,"cont " + cont);
                visualizzaMex();
            }
        });


    }

    /**
     * mostra nel TextView Message il valore di cont
     */
    private void visualizzaMex()
    {
        if(cont == 1)
            vMessage.setText(getString(R.string.contMex1 ) + " " + cont + " " + getString(R.string.contMexSingolare));
        else
            vMessage.setText(getString(R.string.contMex1 ) + " " + cont + " " + getString(R.string.contMex2));
    }
}
