package com.example.aj.college_actionbar_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class calculator extends Fragment {


    public calculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        final EditText one = (EditText) view.findViewById(R.id.one);
        final EditText two = (EditText) view.findViewById(R.id.two);
        final TextView ans=(TextView)view.findViewById(R.id.ans);
        Button add=(Button)view.findViewById(R.id.add);
        Button sub=(Button)view.findViewById(R.id.sub);
        Button mul=(Button)view.findViewById(R.id.mul);
        Button div=(Button)view.findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(one.getText().toString());
                int b=Integer.parseInt(two.getText().toString());
                int myans=a+b;
                ans.setText(""+myans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(one.getText().toString());
                int b=Integer.parseInt(two.getText().toString());
                int myans=a-b;
                ans.setText(""+myans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(one.getText().toString());
                int b=Integer.parseInt(two.getText().toString());
                int myans=a*b;
                ans.setText(""+myans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(one.getText().toString());
                int b=Integer.parseInt(two.getText().toString());
                int myans=a/b;
                ans.setText(""+myans);
            }
        });
    }
}
