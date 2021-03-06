package com.savatechnology.emall.Adapters;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.savatechnology.emall.Models.ProductList;
import com.savatechnology.emall.R;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.MyViewHolder> {
    Context context;
    private List<ProductList> lists;
    public AdapterProduct(List<ProductList> lists,Context context) {
        this.lists = lists;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_products, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String image = lists.get(position).getimageProduct();
        String product_name = lists.get(position).gettvProductTitle();
        int product_price = lists.get(position).gettvProductPrice();
        double product_rating = lists.get(position).getproductRating();
        String supplier_name = lists.get(position).gettvSupplierName();

        //Log.v("abc",image);

        //adding images from online

        Log.v("abc", String.valueOf(product_price));

        Glide.with(context)
                .asBitmap()
                .load(image)
                .into(holder.imageProduct);


        holder.tvProductTitle.setText(product_name);

        holder.tvProductPrice.setText("Rs " +product_price);
        holder.productRating.setRating((float) product_rating);
        holder.tvSupplierName.setText(supplier_name);



    }
    @Override
    public int getItemCount() {
        return lists.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageProduct;
        TextView tvProductTitle;
        TextView tvProductPrice;
        RatingBar productRating;
        TextView tvSupplierName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageProduct = itemView.findViewById(R.id.imageProduct);
            tvProductTitle =(TextView) itemView.findViewById(R.id.tvProductTitle);
            tvProductPrice =(TextView) itemView.findViewById(R.id.tvProductPrice);
            productRating = itemView.findViewById(R.id.productRating);
            tvSupplierName =(TextView) itemView.findViewById(R.id.tvSupplierName);


        }
    }
}