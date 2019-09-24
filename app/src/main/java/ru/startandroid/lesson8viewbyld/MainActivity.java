package ru.startandroid.lesson8viewbyld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText); //нахожу вьюху по айди
        myTextView.setText("New text in TextView"); //присваиваю текст
        
        Button myBtn = (Button) findViewById(R.id.myBtn); //нахожу вьюху по айди
        myBtn.setText("My button"); //присваиваю текст
        myBtn.setEnabled(false); //отключил возможность нажатия

        CheckBox myChb = (CheckBox) findViewById(R.id.myChb); //нахожу вьюху по айди
        myChb.setChecked(true); //отключил возможность нажатия
    }
}
