package com.astri.m_library;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class FirstFragment extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        ImageButton button  = (ImageButton) getActivity().findViewById(R.id.btninewbook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BaruBook.class);
                getActivity().startActivity(intent);
                finish();
            }
        });
        ImageButton button2  = (ImageButton) getActivity().findViewById(R.id.btnibook);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), book.class);
                getActivity().startActivity(intent);
                finish();
            }
        });
        ImageButton button3  = (ImageButton) getActivity().findViewById(R.id.btnipinjam);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), tampilPeminjam.class);
                getActivity().startActivity(intent);
                finish();
            }
        });
    }

    private void finish() {
    }

}
