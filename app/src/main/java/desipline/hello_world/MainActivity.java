package desipline.hello_world;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn_toast);
        btn2 = (Button) findViewById(R.id.btn_google);
        btn3 = (Button) findViewById(R.id.btn_tel);
        btn4 = (Button) findViewById(R.id.btn_start);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"시작 버튼이 눌렸어요",Toast.LENGTH_SHORT).show();

            }
        });//end btn1

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(myIntent);
            }
        });//end btn2

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-000-0000"));
                startActivity(myIntent);
            }
        });//end btn3

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "시작 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();


                Intent myIntent = new Intent(MainActivity.this,MyActivity.class);
                startActivity(myIntent);
            }
        });



    }//end onCreate
}
