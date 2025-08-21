package net.zetetic.database;

import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.fullstory.FS;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes14.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        FS.log_e("DefaultDatabaseErrorHandler", "deleting the database file: " + str);
        try {
            SQLiteDatabase.j(new File(str));
        } catch (Exception e10) {
            FS.log_w("DefaultDatabaseErrorHandler", "delete failed: " + e10.getMessage());
        }
    }

    @Override // net.zetetic.database.DatabaseErrorHandler
    public void a(SQLiteDatabase sQLiteDatabase) {
        FS.log_e("DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.getPath());
        if (SQLiteDatabase.D()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            b(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> listN = null;
        try {
            try {
                listN = sQLiteDatabase.N();
            } catch (SQLiteException unused) {
            }
            try {
                sQLiteDatabase.close();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (listN != null) {
                Iterator<Pair<String, String>> it = listN.iterator();
                while (it.hasNext()) {
                    b((String) it.next().second);
                }
            } else {
                b(sQLiteDatabase.getPath());
            }
        }
    }
}
