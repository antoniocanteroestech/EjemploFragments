package softepec.es.ejemplofragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        FragmentOne f1 = new FragmentOne();
        f1.getMessage("HOLA QUE TAL");
        FragmentTwo f2 = new FragmentTwo();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main2activity, f2, "fragment2");
        fragmentTransaction.add(R.id.main2activity, f1, "fragment2");
        fragmentTransaction.commit();

    }

    public void getMessage(String message){
        textView.setText(message);
    }

}
