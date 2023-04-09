package com.example.popactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import static com.example.popactivity.R.*;

public class popActivity extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker tp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate((layout.pop_activity, container, false);
        TimePicker tp = (TimePicker)view.findViewById(id.timePicker);
        Button buDone = (Button)view.findViewById(id.button);
        buDone.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        this.dismiss();
        String myTime = tp.getHour() + ":" + tp.getMinute();
        MainActivity ma = (MainActivity) getActivity();
        ma.SetData(myTime);
    }
}
