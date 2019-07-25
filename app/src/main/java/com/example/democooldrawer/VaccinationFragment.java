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
public class VaccinationFragment extends Fragment {
    TextView tvVac;
    Button btnVac;


    public VaccinationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vaccination, container, false);
        tvVac = view.findViewById(R.id.tvVac);
        btnVac = view.findViewById(R.id.btnFragVac);
        return view;
    }

}
