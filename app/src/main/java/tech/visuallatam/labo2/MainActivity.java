package tech.visuallatam.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button loginbtn;
    TextView vista;
    TextView pass;
    TextView username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn =  findViewById(R.id.btn1);
        vista = findViewById(R.id.view);
        pass = findViewById(R.id.password);
        username = findViewById(R.id.username);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                usernamee();
            }
        });

        loginbtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                password();
                return false;
            }
        });


    }
    private void password(){
        vista.setText(pass.getText());
    }
    private void usernamee(){
        vista.setText(username.getText());
    }
}
