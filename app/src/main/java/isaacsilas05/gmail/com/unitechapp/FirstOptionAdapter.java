package isaacsilas05.gmail.com.unitechapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FirstOptionAdapter extends RecyclerView.Adapter<FirstOptionAdapter.ViewHolder>{

    private List<ListItemFirstOption> firstOptionsList;
    private Context context;

    public FirstOptionAdapter(List<ListItemFirstOption> firstOptionsList, Context context) {
        this.firstOptionsList = firstOptionsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.list_item_first_option,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,  int i) {
        final ListItemFirstOption firstOptionListItem = firstOptionsList.get(i);

        viewHolder.firstOption.setText(firstOptionListItem.getHeading());

        viewHolder.listItemFirstOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,firstOptionListItem.getHeading(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return firstOptionsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstOption;
        ConstraintLayout listItemFirstOption;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            firstOption =  itemView.findViewById(R.id.textViewFirstOption);
            listItemFirstOption = itemView.findViewById(R.id.parentLayoutFirst);


        }
    }
}
