package com.page_envy.multipanefragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        int screenOrientation = getResources().getConfiguration().orientation;

        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT){

            hideSidePane();

        }

    }

    private void hideSidePane() {

        View sidePane = findViewById(R.id.side_panel);

        if(sidePane.getVisibility() == View.VISIBLE){

            sidePane.setVisibility(View.GONE);

        }

    }


}
