package M5;

import R5.t;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;

/* loaded from: classes4.dex */
public class m {
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0012: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:19), block:B:8:0x0012 */
    public static boolean a(String str, String str2) throws Throwable {
        SQLiteDatabase sQLiteDatabaseE;
        SQLiteException e10;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                sQLiteDatabaseE = e(str, a.READ_WRITE);
                try {
                    sQLiteDatabaseE.delete(str2, "1", null);
                    b(sQLiteDatabaseE);
                    return true;
                } catch (SQLiteException e11) {
                    e10 = e11;
                    t.f("MobileCore", "SQLiteDatabaseHelper", String.format("clearTable - Error in clearing table(%s) from database(%s).Returning false. Error: (%s)", str2, str, e10.getMessage()), new Object[0]);
                    b(sQLiteDatabaseE);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase2 = sQLiteDatabase;
                b(sQLiteDatabase2);
                throw th;
            }
        } catch (SQLiteException e12) {
            sQLiteDatabaseE = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            b(sQLiteDatabase2);
            throw th;
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            t.a("MobileCore", "SQLiteDatabaseHelper", "closeDatabase - Unable to close database, database passed is null.", new Object[0]);
        } else {
            sQLiteDatabase.close();
            t.e("MobileCore", "SQLiteDatabaseHelper", "closeDatabase - Successfully closed the database.", new Object[0]);
        }
    }

    public static boolean c(String str, String str2) {
        SQLiteDatabase sQLiteDatabaseE = null;
        try {
            try {
                sQLiteDatabaseE = e(str, a.READ_WRITE);
                sQLiteDatabaseE.execSQL(str2);
                b(sQLiteDatabaseE);
                return true;
            } catch (SQLiteException e10) {
                t.f("MobileCore", "SQLiteDatabaseHelper", String.format("createTableIfNotExists - Error in creating/accessing database (%s).Error: (%s)", str, e10.getMessage()), new Object[0]);
                b(sQLiteDatabaseE);
                return false;
            }
        } catch (Throwable th2) {
            b(sQLiteDatabaseE);
            throw th2;
        }
    }

    public static int d(String str, String str2) {
        SQLiteDatabase sQLiteDatabaseE = null;
        try {
            sQLiteDatabaseE = e(str, a.READ_ONLY);
            return (int) sQLiteDatabaseE.compileStatement("Select Count (*) from " + str2).simpleQueryForLong();
        } catch (SQLiteException e10) {
            t.f("MobileCore", "SQLiteDatabaseHelper", String.format("getTableSize - Error in querying table(%s) size from database(%s).Returning 0. Error: (%s)", str2, str, e10.getMessage()), new Object[0]);
            return 0;
        } finally {
            b(sQLiteDatabaseE);
        }
    }

    public static SQLiteDatabase e(String str, a aVar) throws SQLiteException {
        if (str == null || str.isEmpty()) {
            t.a("MobileCore", "SQLiteDatabaseHelper", "openDatabase - Failed to open database - filepath is null or empty", new Object[0]);
            throw new SQLiteException("Invalid database path. Database path is null or empty.");
        }
        try {
            File parentFile = new File(str).getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                t.a("MobileCore", "SQLiteDatabaseHelper", "openDatabase - Creating parent directory (%s)", parentFile.getPath());
                parentFile.mkdirs();
            }
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, null, aVar.f19674a | 268435472);
            t.e("MobileCore", "SQLiteDatabaseHelper", String.format("openDatabase - Successfully opened the database at path (%s)", str), new Object[0]);
            return sQLiteDatabaseOpenDatabase;
        } catch (Exception unused) {
            t.a("MobileCore", "SQLiteDatabaseHelper", "openDatabase - Failed to create parent directory for path (%s)", str);
            throw new SQLiteException("Invalid database path. Unable to create parent directory for database.");
        }
    }

    public static boolean f(String str, a aVar, d dVar) {
        SQLiteDatabase sQLiteDatabaseE = null;
        try {
            try {
                sQLiteDatabaseE = e(str, aVar);
                boolean zA = dVar.a(sQLiteDatabaseE);
                if (sQLiteDatabaseE != null) {
                    b(sQLiteDatabaseE);
                }
                return zA;
            } catch (Exception e10) {
                t.f("MobileCore", "SQLiteDatabaseHelper", "Failed to open database (%s). Error: %s", str, e10.getLocalizedMessage());
                if (sQLiteDatabaseE == null) {
                    return false;
                }
                b(sQLiteDatabaseE);
                return false;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabaseE != null) {
                b(sQLiteDatabaseE);
            }
            throw th2;
        }
    }

    public enum a {
        READ_ONLY(1),
        READ_WRITE(0);


        /* renamed from: a, reason: collision with root package name */
        final int f19674a;

        a(int i10) {
            this.f19674a = i10;
        }
    }
}
