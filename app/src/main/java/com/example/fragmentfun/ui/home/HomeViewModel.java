package com.example.fragmentfun.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragmentfun.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public Button b;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is home fragment");
    }

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

    public LiveData<String> getText() {
        return mText;
    }
}