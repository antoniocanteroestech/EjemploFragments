package softepec.es.ejemplofragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    TextView textView;
    String message;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        textView = view.findViewById(R.id.textView);
        textView.setText(message);

        return view;
    }

    public void getMessage(String message){
        this.message = message;
    }

}
