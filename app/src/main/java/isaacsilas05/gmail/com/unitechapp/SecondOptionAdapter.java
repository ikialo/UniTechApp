package isaacsilas05.gmail.com.unitechapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class SecondOptionAdapter extends RecyclerView.Adapter<SecondOptionAdapter.ViewHolder> {

    private List<String> secondOptionsList;
    private Context context;

    public SecondOptionAdapter(List<String> secondOptionsList, Context context) {
        this.secondOptionsList = secondOptionsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.list_item_second_option,viewGroup,false);
        return new SecondOptionAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String listView = secondOptionsList.get(i);

        viewHolder.secondOption.setText(listView);
    }

    @Override
    public int getItemCount() {
        return secondOptionsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView secondOption;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            secondOption = (TextView) itemView.findViewById(R.id.textViewSecondOption);
        }

    }
}
