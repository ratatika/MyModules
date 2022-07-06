package sg.edu.rp.c346.id20006092.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModuleCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        btnBack = findViewById(R.id.buttonBack);

        Intent intentRecieved = getIntent();

        String moduleCode = intentRecieved.getStringExtra("ModuleCode");
        String moduleName = intentRecieved.getStringExtra("ModuleName");
        int academicYear = intentRecieved.getIntExtra("academicYear", 0);
        int semester = intentRecieved.getIntExtra("semester", 0);
        int moduleCredit = intentRecieved.getIntExtra("academicYear", 0);
        String venue = intentRecieved.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: " + moduleCode);
        tvModuleName.setText("Module Name: " + moduleName);
        tvAcademicYear.setText("Academic Year: " + academicYear);
        tvSemester.setText("Semester: " + semester);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}