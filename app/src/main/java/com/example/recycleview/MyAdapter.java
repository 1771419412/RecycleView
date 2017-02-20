package com.example.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 雪无痕 on 2017/2/20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder>{
    private List<Mei> mMeiList;
    private MyAdapter(List<Mei> mMeiList){
        this.mMeiList=mMeiList;
    }
    @Override
    public MyAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.meinv_item,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.Holder holder, int position) {
        Mei mei=mMeiList.get(position);
        holder.imgId.setImageResource(mei.imgId);
        holder.imgName.setText(mei.imgName);
    }

    @Override
    public int getItemCount() {
        return mMeiList.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        ImageView imgId;
        TextView imgName;
        public Holder(View itemView) {
            super(itemView);
            imgId= (ImageView) itemView.findViewById(R.id.imgid);
            imgName= (TextView) itemView.findViewById(R.id.imgname);
        }
    }
}
