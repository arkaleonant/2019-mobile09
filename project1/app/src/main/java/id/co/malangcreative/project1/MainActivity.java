package id.co.malangcreative.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.co.malangcreative.project1.adapters.ProductAdapter;
import id.co.malangcreative.project1.models.Product;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvProduct;
    //instansiasi list album
    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProduct = findViewById(R.id.rvProduct);

        Product list = new Product(
                "Macbook Pro 2017 i8 8th 8/256 SSD",
                "Rp.22.000.000",
                 R.drawable.images);
        listProduct.add(list);

        Product list2 = new Product(
                "Lenovo Legion i7 8th 16/512 SSD",
                "Rp.23.000.000",
                R.drawable.legion);
        listProduct.add(list2);

        Product list3 = new Product(
                "ASUS TUF Gaming Ryzen5 16/256 SSD",
                "Rp.16.450.000",
                R.drawable.tufgaming);
        listProduct.add(list3);

        Product list4 = new Product(
                "ASUS Zenbook 14 i7 9th 16/256 SSD",
                "Rp.19.800.000",
                R.drawable.zembook);
        listProduct.add(list4);

        ProductAdapter productAdapter = new ProductAdapter(listProduct);
        //set adapter dan layoutmanager
        rvProduct.setAdapter(productAdapter);
        rvProduct.setLayoutManager(new LinearLayoutManager(this));

    }
}
