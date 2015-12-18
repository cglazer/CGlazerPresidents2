package presidents.cglazer.cglazerpresidents;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */

public class PresidentRecyclerViewAdapter extends RecyclerView.Adapter<PresidentViewHolder> {

    private final OnPresidentSelectedListener listener;
    private President[] presidents;

    public PresidentRecyclerViewAdapter(President[] presidents, OnPresidentSelectedListener listener) {
        this.presidents = presidents;
        this.listener= listener;
    }

    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.president_list_item, parent, false);

        return new PresidentViewHolder(itemView);
    }

    public void onBindViewHolder(final PresidentViewHolder holder, final int position) {
        holder.bind(presidents[position]);
        holder.itemView.setOnClickListener(
                new View.OnClickListener(){
            public void onClick(View v){
                listener.onSelect(presidents, position);
            }
        });


    }

    public int getItemCount() {
        return presidents.length;
    }
}

