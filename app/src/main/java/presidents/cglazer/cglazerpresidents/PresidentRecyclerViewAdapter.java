package presidents.cglazer.cglazerpresidents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */

    public class PresidentRecyclerViewAdapter extends RecyclerView.Adapter<PresidentViewHolder>{
        private President[] presidents;
        public PresidentRecyclerViewAdapter(President[] presidents){
            this.presidents= presidents;
        }

        public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.president_list_item, parent, false);

            return new PresidentViewHolder(itemView);
        }
        public void onBindViewHolder(final PresidentViewHolder holder, final int position){
            holder.bind(presidents[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //going from main activity to detail activity
                    Context context= holder.itemView.getContext();
                    Intent intent= new Intent(context, DetailActivity.class);
                    intent.putExtra("POSITION", position);
                    intent.putExtra("PRESIDENTS", presidents);
                    context.startActivity(intent);

                }
            });
        }
        public int getItemCount(){
            return presidents.length;
        }
    }

