package LAB.Experiment1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textToFormat = findViewById(R.id.textToFormat);
        Button fontChangeButton = findViewById(R.id.fontChangeButton);
        Button colourChangeButton = findViewById(R.id.colourChangeButton);


        fontChangeButton.setOnClickListener(new View.OnClickListener() {
            float font=30;
            @Override
            public void onClick(View view) {
                font += 3;
                textToFormat.setTextSize(font);
                if (font == 42) font = 30;
            }
        });

        colourChangeButton.setOnClickListener(new View.OnClickListener() {
            int choice=1;
            public void onClick(View view) {
                switch (choice){
                    case 1: textToFormat.setTextColor(Color.RED);
                        break;
                    case 2: textToFormat.setTextColor(Color.GREEN);
                        break;
                    case 3: textToFormat.setTextColor(Color.BLUE);
                        break;
                    case 4: textToFormat.setTextColor(Color.CYAN);
                        break;
                    case 5: textToFormat.setTextColor(Color.MAGENTA);
                        break;
                    case 6: textToFormat.setTextColor(Color.YELLOW);
                        break;
                }
                choice++;
                if(choice==6) choice=1;
            }
        });

    }
}