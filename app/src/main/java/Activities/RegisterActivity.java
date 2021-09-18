package Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.blood_bank.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText nameEt,cityEt,bloodGroupEt,passawordEt,mobileET;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        nameEt = findViewById(R.id.name);
        cityEt = findViewById(R.id.city);
        bloodGroupEt = findViewById(R.id.bloodgroup);
        passawordEt =findViewById(R.id.password);
        mobileET = findViewById(R.id.number);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,city,bloodG,passaword,mobile;
                name = nameEt.getText().toString();
                city = cityEt.getText().toString();
                bloodG = bloodGroupEt.getText().toString();
                passaword =passawordEt.getText().toString();
                mobile = mobileET.getText().toString();

                showMessage(name+"\n"+city+"\n"+bloodG+"\n"+passaword+"\n"+mobile);
            }
        });
    }

    private void showMessage(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
