package com.debojeet.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Button button = (Button)view;
        CharSequence text = "This button will launch my " + button.getText() + " app.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        TextView textView = (TextView) toast.getView().findViewById(android.R.id.message);
        if(textView != null) textView.setGravity(Gravity.CENTER);
        toast.show();
    }
}
