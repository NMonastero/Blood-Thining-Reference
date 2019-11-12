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

    public Button b;
    TextView tv;
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
        b = root.findViewById(R.id.test_button);
        tv = root.findViewById(R.id.test_text);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //tv.setText("goodbye");
                b.setEnabled(false);
                b.setVisibility(View.GONE);
            }
        });
        return root;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle viewInstanceState ){
//        View view = inflater.inflate(R.layout.fragment_home,
//                container, false);
//        Button button = view.findViewById(R.id.test_button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                b.setEnabled(false);
//                b.setVisibility(View.GONE);
//            }
//        });
//        return view;
//    }
}