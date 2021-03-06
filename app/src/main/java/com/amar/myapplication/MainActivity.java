package com.amar.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private String TAG = "myTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: activity");
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d(TAG, "onAttachFragment: Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: activity");
    }

    public void addFragment(View view) {
        FirstFragment firstFragment = new FirstFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_one_container,firstFragment,firstFragment.getTag());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void replaceFragment(View view) {
        SecondFragment secondFragment = new SecondFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_one_container,secondFragment,secondFragment.getTag());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
