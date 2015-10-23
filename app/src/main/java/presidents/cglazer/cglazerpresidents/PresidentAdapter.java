package presidents.cglazer.cglazerpresidents;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */

    public class PresidentAdapter extends RecyclerView.Adapter<PresidentViewHolder>{
        private President[] presidents;
        public PresidentAdapter(President[] presidents){
            this.presidents= presidents;
        }

        public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.president_list_item, parent, false);

            return new PresidentViewHolder(itemView);
        }
        public void onBindViewHolder(PresidentViewHolder holder, int position){
            holder.bind(presidents[position]);
        }
        public int getItemCount(){
            return 0;
        }
    }

