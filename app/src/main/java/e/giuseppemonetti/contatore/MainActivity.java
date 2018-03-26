package e.giuseppemonetti.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //LAYOUT'S VIEW
    private TextView vMessage;
    private Button vAdd;
    private Button vReduce;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RIFERIMENTI LAYOUT
        vMessage = findViewById(R.id.textMessage);
        vAdd = findViewById(R.id.buttonAdd);
        vReduce = findViewById(R.id.buttonReduce);

        
    }
}
