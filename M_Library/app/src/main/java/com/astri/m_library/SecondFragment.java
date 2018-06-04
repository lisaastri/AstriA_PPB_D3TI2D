package com.astri.m_library;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        ImageButton button2  = (ImageButton) getActivity().findViewById(R.id.btniabout);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Abot.class);
                getActivity().startActivity(intent);
                finish();
            }
        });
        ImageButton button3  = (ImageButton) getActivity().findViewById(R.id.btnilogout);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Login.class);
                getActivity().startActivity(intent);
                finish();
            }
        });
    }

    private void finish() {
    }


}
