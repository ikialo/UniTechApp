package isaacsilas05.gmail.com.unitechapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListItemFirstOption firstOptionListItem = firstOptionsList.get(i);

        viewHolder.firstOption.setText(firstOptionListItem.getHeading());
    }

    @Override
    public int getItemCount() {
        return firstOptionsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstOption;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            firstOption = (TextView) itemView.findViewById(R.id.textViewFirstOption);
        }
    }
}
