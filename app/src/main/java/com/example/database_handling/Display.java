package com.example.database_handling;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
