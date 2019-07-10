package com.example.mehenditheart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private int[] images = {R.drawable.design1 , R.drawable.design2, R.drawable.design3, R.drawable.design4} ;
    private Context context ;
    private ListModel listModel[] ;

    public MainAdapter(Context context , ListModel list[]){
        this.context = context ;
        this.listModel = list ;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()) ;
        View listRow = inflater.inflate(R.layout.rv_list_row,parent,false) ;
        MyViewHolder viewHolder = new MyViewHolder(listRow) ;
        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.imgDesign.setImageResource(listModel[i].getImageID());
        myViewHolder.tvCount.setText("#"+i);
    }

    @Override
    public int getItemCount() {
        return images.length ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgDesign ;
        TextView tvCount ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgDesign = itemView.findViewById(R.id.imgDesign) ;
            tvCount = itemView.findViewById(R.id.tvCount) ;

        }
    }
}
