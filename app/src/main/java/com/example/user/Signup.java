package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    private EditText name,email,pass;
    private Button signup;
    private View back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.btnsignup);
        name =findViewById(R.id.txtten);
        email =findViewById(R.id.txtsuemail);
        pass=findViewById(R.id.txtsupass);
        back = findViewById(R.id.btnbacksignup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("") || pass.getText().toString().equals("") || name.getText().toString().equals("")){
                    Toast.makeText(Signup.this, "Không được để trống!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String name1=name.getText().toString().trim();
                    String email1=email.getText().toString().trim();
                    String pass1=pass.getText().toString().trim();
                    appunti.email=email1;
                    appunti.name= name1;
                    appunti.pass=pass1;
                    openlognin();
                }

            }
        });

    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openlognin();
        }
    });

    }
    public void openlognin(){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }

}