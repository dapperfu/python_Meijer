package f6;

import Q5.K;
import Q5.t;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: f6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13849e {
    public static boolean a(String str) {
        try {
            File fileO = K.f().e().o();
            if (fileO != null && !i.a(str)) {
                return SQLiteDatabase.deleteDatabase(new File(fileO, str));
            }
            return false;
        } catch (Exception unused) {
            t.a("MobileCore", "SQLiteUtils", "Failed to delete (%s) in cache folder.", str);
            return false;
        }
    }
}
