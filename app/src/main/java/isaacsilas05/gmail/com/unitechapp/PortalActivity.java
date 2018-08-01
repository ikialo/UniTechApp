package isaacsilas05.gmail.com.unitechapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);



        TextView home = findViewById(R.id.homePortal);
        TextView student = findViewById(R.id.studentPortal);
        final TextView staff = findViewById(R.id.staffPortal);
        TextView library = findViewById(R.id.libraryPortal);
        TextView alumni = findViewById(R.id.alumniPortal);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PortalActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PortalActivity.this, "STudent portal Clicked", Toast.LENGTH_SHORT).show();

                Intent studentIntent = new Intent(PortalActivity.this, LoginActivity.class);
                startActivity(studentIntent);
            }
        });

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PortalActivity.this, "Staffportal Clicked", Toast.LENGTH_SHORT).show();
                Intent staffIntent = new Intent(PortalActivity.this, StaffLoginActivity.class);
                startActivity(staffIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PortalActivity.this, "library portal Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PortalActivity.this, "alumni portal Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
