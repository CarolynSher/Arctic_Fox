package android.carolynbicycleshop.arcticfox.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.carolynbicycleshop.arcticfox.Database.Repository;
import android.carolynbicycleshop.arcticfox.Entity.Product;
import android.carolynbicycleshop.arcticfox.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

public class ProductList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        Repository repo=new Repository(getApplication());
        List<Product> products=repo.getAllProducts();
        final ProductAdapter adapter=new ProductAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setProducts(products);
    }
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_productlist, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    this.finish();
                    return true;
            }
                return super.onOptionsItemSelected(item);

    }

    public void goToPartsList(View view) {
        Intent intent=new Intent(ProductList.this,PartList.class);
        startActivity(intent);
    }
}