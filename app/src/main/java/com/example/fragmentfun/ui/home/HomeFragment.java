package com.example.fragmentfun.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.fragmentfun.R;

import java.util.Stack;

public class HomeFragment extends Fragment {

    public Button back, b1p0, b2p0, b3p0, b4p0, b1p1, b2p1, b3p1, b4p1, b5p1, b1p3, b2p3, b3p3,
            b1p10, b2p10, b3p10, b4p10, b5p10, b6p10, b1p11, b2p11, b3p11, b4p11, b5p11, b6p11,
    b1p18, b2p18, b3p18, b1p24, b2p24, b3p24;
    TextView t1p0, t1p1, t2p1, t1p5, t1p6, t1p7, t1p8, t1p9, t1p2, t1p4, t1p3, t2p3, t1p12;
    ScrollView svp5, svp6;
    int page = 0;
    Stack<Integer> pageLast = new Stack<Integer>();
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        back = root.findViewById(R.id.back);
        //page 0
        b1p0 = root.findViewById(R.id.b1p0);
        b2p0 = root.findViewById(R.id.b2p0);
        b3p0 = root.findViewById(R.id.b3p0);
        b4p0 = root.findViewById(R.id.b4p0);
        t1p0 = root.findViewById(R.id.t1p0);
        //page 1
        t1p1 = root.findViewById(R.id.t1p1);
        b1p1 = root.findViewById(R.id.b1p1);
        b2p1 = root.findViewById(R.id.b2p1);
        b3p1 = root.findViewById(R.id.b3p1);
        b4p1 = root.findViewById(R.id.b4p1);
        b5p1 = root.findViewById(R.id.b5p1);
        t2p1 = root.findViewById(R.id.t2p1);
        //page 2
        t1p2 = root.findViewById(R.id.t1p2);
        //page 3
        b1p3 = root.findViewById(R.id.b1p3);
        b2p3 = root.findViewById(R.id.b2p3);
        b3p3 = root.findViewById(R.id.b3p3);
        t1p3 = root.findViewById(R.id.t1p3);
        t2p3 = root.findViewById(R.id.t2p3);
        //page 4
        t1p4 = root.findViewById(R.id.t1p4);
        //page 5
        t1p5 = root.findViewById(R.id.t1p5);
        svp5 = root.findViewById(R.id.svp5);
        //page 6
        t1p6 = root.findViewById(R.id.t1p6);
        svp6 = root.findViewById(R.id.svp6);
        //page 7
        t1p7 = root.findViewById(R.id.t1p7);
        //page 8
        t1p8 = root.findViewById(R.id.t1p8);
        //page 9
        t1p9 = root.findViewById(R.id.t1p9);
        //page 10
        b1p10 = root.findViewById(R.id.b1p10);
        b2p10 = root.findViewById(R.id.b2p10);
        b3p10 = root.findViewById(R.id.b3p10);
        b4p10 = root.findViewById(R.id.b4p10);
        b5p10 = root.findViewById(R.id.b5p10);
        b6p10 = root.findViewById(R.id.b6p10);
        //page 11
        b1p11 = root.findViewById(R.id.b1p11);
        b2p11 = root.findViewById(R.id.b2p11);
        b3p11 = root.findViewById(R.id.b3p11);
        b4p11 = root.findViewById(R.id.b4p11);
        b5p11 = root.findViewById(R.id.b5p11);
        b6p11 = root.findViewById(R.id.b6p11);
        //page 12
        t1p12 = root.findViewById(R.id.t1p12);
        //page 18
        b1p18 = root.findViewById(R.id.b1p18);
        b2p18 = root.findViewById(R.id.b2p18);
        b3p18 = root.findViewById(R.id.b3p18);
        //page 24
        b1p24 = root.findViewById(R.id.b1p24);
        b2p24 = root.findViewById(R.id.b2p24);
        b3p24 = root.findViewById(R.id.b3p24);
        changePage(page);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                page = pageLast.pop();
                changePage(page);
            }
        });
        b1p0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 1;
                changePage(page);
            }
        });
        b2p0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 2;
                changePage(page);
            }
        });
        b3p0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 3;
                changePage(page);
            }
        });
        b4p0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 4;
                changePage(page);
            }
        });
        b1p1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 5;
                changePage(page);
            }
        });
        b2p1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 6;
                changePage(page);
            }
        });
        b3p1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 7;
                changePage(page);
            }
        });
        b4p1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 8;
                changePage(page);
            }
        });
        b5p1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 9;
                changePage(page);
            }
        });
        b1p3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 10;
                changePage(page);
            }
        });
        b2p3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 11;
                changePage(page);
            }
        });
        b3p3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 12;
                changePage(page);
            }
        });
        b1p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 13;
                changePage(page);
            }
        });
        b2p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 14;
                changePage(page);
            }
        });
        b3p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 15;
                changePage(page);
            }
        });
        b4p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 16;
                changePage(page);
            }
        });
        b5p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 17;
                changePage(page);
            }
        });
        b6p10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 18;
                changePage(page);
            }
        });
        b1p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 19;
                changePage(page);
            }
        });
        b2p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 20;
                changePage(page);
            }
        });
        b3p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 21;
                changePage(page);
            }
        });
        b4p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 22;
                changePage(page);
            }
        });
        b5p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 23;
                changePage(page);
            }
        });
        b6p11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 24;
                changePage(page);
            }
        });
        b1p18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 25;
                changePage(page);
            }
        });
        b2p18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 26;
                changePage(page);
            }
        });
        b3p18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                pageLast.push(page);
                page = 27;
                changePage(page);
            }
        });
        return root;
    }

    public void changePage(int i){
        back.setVisibility(View.VISIBLE);
        back.setEnabled(true);
        allDis();
        if(i == 0){
            b1p0.setEnabled(true);
            b1p0.setVisibility(View.VISIBLE);
            b2p0.setEnabled(true);
            b2p0.setVisibility(View.VISIBLE);
            b3p0.setEnabled(true);
            b3p0.setVisibility(View.VISIBLE);
            b4p0.setEnabled(true);
            b4p0.setVisibility(View.VISIBLE);
            t1p0.setVisibility(View.VISIBLE);
            //disable back
            back.setVisibility(View.GONE);
            back.setEnabled(false);
        }
        else if(i == 1){
            t1p1.setVisibility(View.VISIBLE);
            b1p1.setEnabled(true);
            b1p1.setVisibility(View.VISIBLE);
            b2p1.setEnabled(true);
            b2p1.setVisibility(View.VISIBLE);
            b3p1.setEnabled(true);
            b3p1.setVisibility(View.VISIBLE);
            b4p1.setEnabled(true);
            b4p1.setVisibility(View.VISIBLE);
            b5p1.setEnabled(true);
            b5p1.setVisibility(View.VISIBLE);
            t2p1.setVisibility(View.VISIBLE);
        }
        else if(i == 2){
            t1p2.setVisibility(View.VISIBLE);
        }
        else if(i == 3){
            b1p3.setEnabled(true);
            b1p3.setVisibility(View.VISIBLE);
            b2p3.setEnabled(true);
            b2p3.setVisibility(View.VISIBLE);
            b3p3.setEnabled(true);
            b3p3.setVisibility(View.VISIBLE);
            t1p3.setVisibility(View.VISIBLE);
            t2p3.setVisibility(View.VISIBLE);
        }
        else if(i == 4){
            t1p4.setVisibility(View.VISIBLE);
        }
        else if(i == 5){
            t1p5.setVisibility(View.VISIBLE);
            svp5.setEnabled(true);
        }
        else if(i == 6) {
            t1p6.setVisibility(View.VISIBLE);
            svp6.setEnabled(true);
        }
        else if(i == 7){
            t1p7.setVisibility(View.VISIBLE);
        }
        else if(i == 8) {
            t1p8.setVisibility(View.VISIBLE);
        }
        else if(i == 9){
            t1p9.setVisibility(View.VISIBLE);
        }
        else if(i == 10){
            b1p10.setEnabled(true);
            b1p10.setVisibility(View.VISIBLE);
            b2p10.setEnabled(true);
            b2p10.setVisibility(View.VISIBLE);
            b3p10.setEnabled(true);
            b3p10.setVisibility(View.VISIBLE);
            b4p10.setEnabled(true);
            b4p10.setVisibility(View.VISIBLE);
            b5p10.setEnabled(true);
            b5p10.setVisibility(View.VISIBLE);
            b6p10.setEnabled(true);
            b6p10.setVisibility(View.VISIBLE);
        }
        else if(i == 11) {
            b1p11.setEnabled(true);
            b1p11.setVisibility(View.VISIBLE);
            b2p11.setEnabled(true);
            b2p11.setVisibility(View.VISIBLE);
            b3p11.setEnabled(true);
            b3p11.setVisibility(View.VISIBLE);
            b4p11.setEnabled(true);
            b4p11.setVisibility(View.VISIBLE);
            b5p11.setEnabled(true);
            b5p11.setVisibility(View.VISIBLE);
            b6p11.setEnabled(true);
            b6p11.setVisibility(View.VISIBLE);
        }
        else if(i == 12){
            t1p12.setVisibility(View.VISIBLE);
        }
        else if(i == 13){

        }
        else if(i == 14) {

        }
        else if(i == 15){

        }
        else if(i == 16){

        }
        else if(i == 17) {

        }
        else if(i == 18){
            b1p18.setEnabled(true);
            b1p18.setVisibility(View.VISIBLE);
            b2p18.setEnabled(true);
            b2p18.setVisibility(View.VISIBLE);
            b3p18.setEnabled(true);
            b3p18.setVisibility(View.VISIBLE);
        }
        else if(i == 19){

        }
        else if(i == 20) {

        }
        else if(i == 21){

        }
        else if(i == 22){

        }
        else if(i == 23) {

        }
        else if(i == 24){
            b1p24.setEnabled(true);
            b1p24.setVisibility(View.VISIBLE);
            b2p24.setEnabled(true);
            b2p24.setVisibility(View.VISIBLE);
            b3p24.setEnabled(true);
            b3p24.setVisibility(View.VISIBLE);

        }
        else if(i == 25){

        }
        else if(i == 26) {

        }
    }

    public void allDis(){
        //page0
        b1p0.setEnabled(false);
        b1p0.setVisibility(View.GONE);
        b2p0.setEnabled(false);
        b2p0.setVisibility(View.GONE);
        b3p0.setEnabled(false);
        b3p0.setVisibility(View.GONE);
        b4p0.setEnabled(false);
        b4p0.setVisibility(View.GONE);
        t1p0.setVisibility(View.GONE);
        //page 1
        t1p1.setVisibility(View.GONE);
        b1p1.setEnabled(false);
        b1p1.setVisibility(View.GONE);
        b2p1.setEnabled(false);
        b2p1.setVisibility(View.GONE);
        b3p1.setEnabled(false);
        b3p1.setVisibility(View.GONE);
        b4p1.setEnabled(false);
        b4p1.setVisibility(View.GONE);
        b5p1.setEnabled(false);
        b5p1.setVisibility(View.GONE);
        t2p1.setVisibility(View.GONE);
        //page 2
        t1p2.setVisibility(View.GONE);
        //page 3
        b1p3.setEnabled(false);
        b1p3.setVisibility(View.GONE);
        b2p3.setEnabled(false);
        b2p3.setVisibility(View.GONE);
        b3p3.setEnabled(false);
        b3p3.setVisibility(View.GONE);
        t1p3.setVisibility(View.GONE);
        t2p3.setVisibility(View.GONE);
        //page 4
        t1p4.setVisibility(View.GONE);
        //page 5
        t1p5.setVisibility(View.GONE);
        svp5.setEnabled(false);
        //page 6
        t1p6.setVisibility(View.GONE);
        svp6.setEnabled(false);
        //page 7
        t1p7.setVisibility(View.GONE);
        //page 8
        t1p8.setVisibility(View.GONE);
        //page 9
        t1p9.setVisibility(View.GONE);

        //page 10
        b1p10.setEnabled(false);
        b1p10.setVisibility(View.GONE);
        b2p10.setEnabled(false);
        b2p10.setVisibility(View.GONE);
        b3p10.setEnabled(false);
        b3p10.setVisibility(View.GONE);
        b4p10.setEnabled(false);
        b4p10.setVisibility(View.GONE);
        b5p10.setEnabled(false);
        b5p10.setVisibility(View.GONE);
        b6p10.setEnabled(false);
        b6p10.setVisibility(View.GONE);

        //page 11
        b1p11.setEnabled(false);
        b1p11.setVisibility(View.GONE);
        b2p11.setEnabled(false);
        b2p11.setVisibility(View.GONE);
        b3p11.setEnabled(false);
        b3p11.setVisibility(View.GONE);
        b4p11.setEnabled(false);
        b4p11.setVisibility(View.GONE);
        b5p11.setEnabled(false);
        b5p11.setVisibility(View.GONE);
        b6p11.setEnabled(false);
        b6p11.setVisibility(View.GONE);
        //page
        t1p12.setVisibility(View.GONE);
        //page 18
        b1p18.setEnabled(false);
        b1p18.setVisibility(View.GONE);
        b2p18.setEnabled(false);
        b2p18.setVisibility(View.GONE);
        b3p18.setEnabled(false);
        b3p18.setVisibility(View.GONE);

        //page 24
        b1p24.setEnabled(false);
        b1p24.setVisibility(View.GONE);
        b2p24.setEnabled(false);
        b2p24.setVisibility(View.GONE);
        b3p24.setEnabled(false);
        b3p24.setVisibility(View.GONE);
    }

}