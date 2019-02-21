package sdu.cs.sirichai.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    //Explicit
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ผูกตัวแปร java กับ XML
        TextView nameTextView = findViewById(R.id.tvNameLogin);

        //รับตัวแปร Name จากการ Intent
        getNameString = getIntent().getStringExtra("Name");
        nameTextView.setText("ยินดีต้อนรับ " + getNameString + " เข้าสู่ระบบ");
    }//end onCreate
}//end class
