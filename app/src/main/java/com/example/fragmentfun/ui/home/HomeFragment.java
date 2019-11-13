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

public class HomeFragment extends Fragment {

    public Button b1p0, b2p0, b3p0, b4p0;
    TextView tv;
    int page = 0;
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
        b1p0 = root.findViewById(R.id.b1p0);
        b2p0 = root.findViewById(R.id.b2p0);
        b3p0 = root.findViewById(R.id.b3p0);
        b4p0 = root.findViewById(R.id.b4p0);
        tv = root.findViewById(R.id.test_text);
        changePage(0);
        b1p0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                changePage(1);
            }
        });
        return root;
    }

    public void changePage(int i){
        if(i == 0){
            //disable everything we don't want initially
        }
        if(i == 1){
            b1p0.setEnabled(false);
            b1p0.setVisibility(View.GONE);
            b2p0.setEnabled(false);
            b2p0.setVisibility(View.GONE);
            b3p0.setEnabled(false);
            b3p0.setVisibility(View.GONE);
            b4p0.setEnabled(false);
            b4p0.setVisibility(View.GONE);
        }
    }

}