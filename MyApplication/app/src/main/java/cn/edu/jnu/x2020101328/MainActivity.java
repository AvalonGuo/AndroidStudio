package cn.edu.jnu.x2020101328;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.Button1);
        EditText editText = this.findViewById(R.id.edit_score_text);
        TextView textView = this.findViewById(R.id.text_view);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "进行计算", Toast.LENGTH_SHORT).show();
                String scores = editText.getText().toString();
                String []scoreArray = scores.split(",");
                BowlingGame game =new BowlingGame();
                for(int i=0;i<scoreArray.length;i++){
                    game.roll(Integer.parseInt(scoreArray[i]));

                }
                textView.setText("Total score is:"+game.score());
            }
        });


    }
}