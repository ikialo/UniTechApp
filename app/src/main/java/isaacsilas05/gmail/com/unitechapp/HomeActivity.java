package isaacsilas05.gmail.com.unitechapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

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

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewTopOption);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerViewSecOption);
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
}
