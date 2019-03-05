package softepec.es.ejemplofragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentTwo extends Fragment implements View.OnClickListener {

    public FragmentTwo() {
        // Required empty public constructor
    }

    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        editText = view.findViewById(R.id.editText);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View view) {
        String message = editText.getText().toString();
        //FragmentActivity activity =  getActivity();

        Main2Activity m2a = (Main2Activity) getActivity();
        m2a.getMessage(message);

    }
}
