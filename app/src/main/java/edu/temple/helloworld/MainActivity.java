package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeAfterClick();
    }
    //After the button is clicked, the old textView gets changed
    private void changeAfterClick(){
        final TextView afterClick = findViewById(R.id.textView);
        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afterClick.setText("The button has been clicked");
            }
        });
    }
}
