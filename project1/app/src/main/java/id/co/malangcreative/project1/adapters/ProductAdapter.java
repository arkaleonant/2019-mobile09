package id.co.malangcreative.project1.adapters;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.text.CollationElementIterator;
import java.util.List;

import id.co.malangcreative.project1.R;
import id.co.malangcreative.project1.models.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>{

    List<Product> listProduct;

    public ProductAdapter(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View productView = layoutInflater.inflate(R.layout.product_layout,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(productView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {
        Product product = listProduct.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.namaLaptop.setText(product.getNamaLaptop());
        holder.hargaLaptop.setText(product.getHargaLaptop());
        holder.imageLaptop.setImageResource(product.getImageLaptop());
    }

    @Override
    public int getItemCount() {
        return (listProduct != null) ? listProduct.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView namaLaptop;
        public TextView hargaLaptop;
        public ImageView imageLaptop;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namaLaptop = itemView.findViewById(R.id.namaLaptop);
            hargaLaptop = itemView.findViewById(R.id.hargaLaptop);
            imageLaptop = itemView.findViewById(R.id.imageLaptop);
        }
    }
}
