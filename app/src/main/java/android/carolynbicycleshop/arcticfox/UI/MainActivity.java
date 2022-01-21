package android.carolynbicycleshop.arcticfox.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.carolynbicycleshop.arcticfox.Database.Repository;
import android.carolynbicycleshop.arcticfox.Entity.Part;
import android.carolynbicycleshop.arcticfox.Entity.Product;
import android.carolynbicycleshop.arcticfox.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add a line of code
    }

    public void EnterHere(View view) {
        Intent intent=new Intent(MainActivity.this, ProductList.class );
        startActivity(intent);
        Repository repo=new Repository(getApplication());
        Product product=new Product(2,"bicycle",10.0);
        repo.insert(product);
        Part part=new Part(2,"brake",10.0,1);
        repo.insert(part);

    }
}