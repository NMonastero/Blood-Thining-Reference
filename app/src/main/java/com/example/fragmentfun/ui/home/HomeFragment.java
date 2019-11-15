package com.example.fragmentfun.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.fragmentfun.R;

import java.util.Stack;

public class HomeFragment extends Fragment {

    public Button back, b1p0, b2p0, b3p0, b4p0, b1p1, b2p1, b3p1, b4p1, b5p1;
    TextView t1p0, t1p1, t2p1;
    int page = 0;
    Stack<Integer> pageLast = new Stack<Integer>();
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
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
        return root;
    }

    public void changePage(int i){
        back.setVisibility(View.VISIBLE);
        back.setEnabled(true);
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
            page1Dis();
        }
        else if(i == 1){
            //page 0 disable
            page0Dis();
            //page 2 disable

            //page 1 enable
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
            page0Dis();
        }
        else if(i == 3){
            page0Dis();
        }
        else if(i == 4){
            page0Dis();
        }
        else if(i == 5){
            page1Dis();
        }
        else if(i == 6) {
            page1Dis();
        }
        else if(i == 7){
            page1Dis();
        }
        else if(i == 8) {
            page1Dis();
        }
        else if(i == 9){
            page1Dis();
        }

    }

    public void page0Dis(){
        b1p0.setEnabled(false);
        b1p0.setVisibility(View.GONE);
        b2p0.setEnabled(false);
        b2p0.setVisibility(View.GONE);
        b3p0.setEnabled(false);
        b3p0.setVisibility(View.GONE);
        b4p0.setEnabled(false);
        b4p0.setVisibility(View.GONE);
        t1p0.setVisibility(View.GONE);
    }

    public void page1Dis(){
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
    }

}