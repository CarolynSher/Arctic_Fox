package android.carolynbicycleshop.arcticfox.DAO;

import android.carolynbicycleshop.arcticfox.Entity.Part;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Project: Arctic Fox
 * Package: android.carolynbicycleshop.arcticfox.DAO
 * <p>
 * User: carolyn.sher
 * Date: 1/21/2022
 * Time: 3:22 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
@Dao
public interface PartDAO {
    @Insert(onConflict= OnConflictStrategy.IGNORE)
    void insert(Part part);

    @Update
    void update(Part part);

    @Delete
    void delete(Part part);

    @Query("SELECT * FROM PARTS ORDER BY partID ASC")
    List<Part> getAllParts();
}
