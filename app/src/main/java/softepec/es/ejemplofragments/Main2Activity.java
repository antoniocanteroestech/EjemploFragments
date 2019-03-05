package softepec.es.ejemplofragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentOne f1 = new FragmentOne();
        FragmentTwo f2 = new FragmentTwo();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main2activity, f2, "fragment2");
        fragmentTransaction.add(R.id.main2activity, f1, "fragment2");
        fragmentTransaction.commit();

    }

}
