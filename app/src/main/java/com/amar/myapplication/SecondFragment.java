package com.amar.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    public static final String TAG = "myTag";
    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
           Log.e(TAG, "onAttach: Fragment  Two ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           Log.e(TAG, "onCreate: Fragment  Two");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
           Log.e(TAG, "onCreateView: Fragment Two");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
           Log.e(TAG, "onActivityCreated: Fragment  Two");
    }

    @Override
    public void onStart() {
        super.onStart();
           Log.e(TAG, "onStart: Fragment  Two");
    }

    @Override
    public void onResume() {
        super.onResume();
           Log.e(TAG, "onResume: Fragment  Two");
    }

    @Override
    public void onPause() {
        super.onPause();
           Log.e(TAG, "onPause: Fragment  Two");
    }

    @Override
    public void onStop() {
        super.onStop();
           Log.e(TAG, "onStop: Fragment  Two");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
           Log.e(TAG, "onDestroyView: Fragment  Two");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
           Log.e(TAG, "onDestroy: Fragment  Two");
    }

    @Override
    public void onDetach() {
        super.onDetach();
           Log.e(TAG, "onDetach: Fragment  Two");
    }
}
