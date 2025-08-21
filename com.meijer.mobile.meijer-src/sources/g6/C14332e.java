package g6;

import R5.K;
import R5.t;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14332e {
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
