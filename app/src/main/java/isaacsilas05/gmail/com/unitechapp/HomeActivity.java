package isaacsilas05.gmail.com.unitechapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItemFirstOption> listItemFirstOption;
    private RecyclerView recyclerView2;
    private RecyclerView.Adapter adapter2;
    private List<String> listItemSecondOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView =  findViewById(R.id.recyclerViewTopOption);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        recyclerView2 = findViewById(R.id.recyclerViewSecOption);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        listItemFirstOption = new ArrayList<>();

        listItemFirstOption.add( new ListItemFirstOption("Home"));
        listItemFirstOption.add( new ListItemFirstOption("About"));
        listItemFirstOption.add( new ListItemFirstOption("Admission"));
        listItemFirstOption.add( new ListItemFirstOption("Department"));
        listItemFirstOption.add( new ListItemFirstOption("Research"));
        listItemFirstOption.add( new ListItemFirstOption("Student Life"));
        listItemFirstOption.add( new ListItemFirstOption("Employment"));
        listItemFirstOption.add( new ListItemFirstOption("Blog"));

        listItemSecondOption = new ArrayList<>();

        listItemSecondOption.add("Our Partner");
        listItemSecondOption.add("Our Magazine");
        listItemSecondOption.add("Development");
        listItemSecondOption.add("Announcement");
        listItemSecondOption.add("Journals");
        listItemSecondOption.add("Our Vision");
        listItemSecondOption.add("Graduation");

        adapter = new FirstOptionAdapter(listItemFirstOption,this);
        adapter2 = new SecondOptionAdapter(listItemSecondOption,this);

        recyclerView.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.student:
                Toast.makeText(HomeActivity.this, "STUDENT CLICKED", Toast.LENGTH_SHORT).show();
                Intent studentIntent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(studentIntent);
                return true;

            case R.id.staff:
                Toast.makeText(HomeActivity.this, "STAFF CLICKED", Toast.LENGTH_SHORT).show();
                Intent staffIntent = new Intent(HomeActivity.this, StaffLoginActivity.class);
                startActivity(staffIntent);
                return true;
            case R.id.library:
                Toast.makeText(HomeActivity.this, "LIBRARY CLICKED", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.alumni:
                Toast.makeText(HomeActivity.this, "ALumni CLICKED", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
