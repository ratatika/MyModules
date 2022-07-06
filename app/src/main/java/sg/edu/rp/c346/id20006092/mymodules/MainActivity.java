package sg.edu.rp.c346.id20006092.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1, tvModule2, tvModule3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textViewModule1);
        tvModule2 = findViewById(R.id.textViewModule2);
        tvModule3 = findViewById(R.id.textViewModule3);


        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModuleCode", "C339");
                intent.putExtra("ModuleName", "Software Testing & Analytics");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W54Q");
                startActivity(intent);
            }
        });

        tvModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("ModuleCode", "C338");
                intent.putExtra("ModuleName", "AI and Machine Learning");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E62L");
                startActivity(intent);
            }
        });
    }
}