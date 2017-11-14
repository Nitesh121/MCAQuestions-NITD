package com.example.niteshjha.mca_nitd;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MCA_fragement extends Fragment {


    public MCA_fragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_mca_fragement,container,false);
        Button b1=(Button) view.findViewById(R.id.First_Sem);
        Button b2=(Button)  view.findViewById(R.id.Second_sem);
        Button b3=(Button) view.findViewById(R.id.Third_Sem);
        Button b4=(Button) view.findViewById(R.id.Forth_sem);
        Button b5=(Button) view.findViewById(R.id.Fifth_sem);
        Button b6=(Button) view.findViewById(R.id.Sixth_sem);





        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(getActivity(),Sixth_Sem.class);
                startActivity(i6);
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(getActivity(),Fifth_Sem.class);
                startActivity(i5);
            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(getActivity(),Forth_Sem.class);
                startActivity(i4);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(getActivity(),Third_Sem.class);
                startActivity(i3);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getActivity(),Second_Sem.class);
                startActivity(i2);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 =new Intent(getActivity(),FirstSem.class);
                startActivity(i1);

            }
        });
        return view;
    }

}
