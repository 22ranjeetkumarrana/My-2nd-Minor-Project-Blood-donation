package com.example.ranjeetkumarrana.studenterpmodel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.NewHolder>
{
    Context mContext;
    List<NewsItem> mData;

    public ItemAdapter(Context mContext, List<NewsItem> mData)
    {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public NewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_donner_list,viewGroup,false);

        return new NewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewHolder newHolder, int position)
    {


        newHolder.img_user.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation));
        newHolder.container.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scal_animation));
        newHolder.tv_name.setText(mData.get(position).getName());
        newHolder.tv_bg.setText(mData.get(position).getBloodGroup());
        newHolder.tv_gender.setText(mData.get(position).getGender());
        newHolder.img_user.setImageResource(mData.get(position).getUserImage());
        newHolder.tv_age.setText(mData.get(position).getAge());
        newHolder.tv_phone.setText(mData.get(position).getPhoneNumber());

    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    //todo : new class
    public class NewHolder extends RecyclerView.ViewHolder
    {

        private TextView tv_name,tv_gender,tv_age,tv_bg,tv_phone;
        private ImageView img_user;
        private RelativeLayout container;

        public NewHolder(@NonNull View itemView)
        {
            super(itemView);

            container = itemView.findViewById(R.id.MainLayout);
            tv_name = itemView.findViewById(R.id.UserName);
            tv_gender = itemView.findViewById(R.id.Gender);
            tv_age = itemView.findViewById(R.id.age);
            tv_bg = itemView.findViewById(R.id.BloodGroup);
            tv_phone = itemView.findViewById(R.id.conatactNumber);
            img_user = itemView.findViewById(R.id.UserImage);
        }
    }
}
