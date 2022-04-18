package com.example.less7_hw;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.less7_hw.R;
public class MainActivity extends AppCompatActivity {
    RadioButton excl,good,okay,poor;
    CheckBox mne_len,mne_ln,yeap;
    Button submit;
    String tolem_turu , zhetkizu_turu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        excl = findViewById(R.id.excl);
        good = findViewById(R.id.good);
        okay = findViewById(R.id.okay);
        poor = findViewById(R.id.poor);
        mne_len = findViewById(R.id.mne_len);
        mne_ln = findViewById(R.id.mne_ln);
        yeap = findViewById(R.id.yeap);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (excl.isChecked()){
                    tolem_turu="excl";
                }
                else if (okay.isChecked()){
                    tolem_turu="okay";
                }
                if (good.isChecked()){
                    tolem_turu="good";
                }
                else if (poor.isChecked()){
                    tolem_turu="poor";
                }
                if (mne_len.isChecked()){
                    zhetkizu_turu="neploho";
                }
                if (mne_ln.isChecked()){
                    zhetkizu_turu="uhuuuu";
                }
                if (yeap.isChecked()){
                    zhetkizu_turu="yeeeap";
                }
                String res = "Rate of the lesson" + "tolem turu:"+tolem_turu+"/n"+
                        "my suggestion:"+zhetkizu_turu;
                Toast.makeText(MainActivity.this,res,Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}