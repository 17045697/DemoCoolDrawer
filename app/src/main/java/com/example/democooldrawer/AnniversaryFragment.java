package com.example.democooldrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnniversaryFragment extends Fragment {
    TextView tvAnni;
    Button btnAnni;


    public AnniversaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_anniversary, container, false);
        tvAnni = view.findViewById(R.id.tvAnni);
        btnAnni = view.findViewById(R.id.btnFragAnni);

        return view;
    }

}
