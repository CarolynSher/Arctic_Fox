package android.carolynbicycleshop.arcticfox.Database;

import android.carolynbicycleshop.arcticfox.DAO.PartDAO;
import android.carolynbicycleshop.arcticfox.DAO.ProductDAO;
import android.carolynbicycleshop.arcticfox.Entity.Part;
import android.carolynbicycleshop.arcticfox.Entity.Product;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * Project: Arctic Fox
 * Package: android.carolynbicycleshop.arcticfox.Database
 * <p>
 * User: carolyn.sher
 * Date: 1/21/2022
 * Time: 3:04 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */

@Database(entities={Product.class, Part.class}, version=1, exportSchema = false)
public abstract class BicycleDatabaseBuilder extends RoomDatabase {
    public abstract ProductDAO productDAO();
    public abstract PartDAO partDAO();

    private static volatile BicycleDatabaseBuilder INSTANCE;

    static BicycleDatabaseBuilder getDatabase(final Context context) {
        if(INSTANCE==null){
        synchronized (BicycleDatabaseBuilder.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), BicycleDatabaseBuilder.class, "myBicycleDatabase.db")
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
    }
    return INSTANCE;
    }
}
