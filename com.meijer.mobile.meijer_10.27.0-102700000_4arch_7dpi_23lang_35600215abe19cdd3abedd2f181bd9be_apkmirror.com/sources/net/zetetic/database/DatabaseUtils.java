package net.zetetic.database;

import android.database.SQLException;
import java.text.Collator;
import java.util.Locale;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteStatement;

/* loaded from: classes13.dex */
public class DatabaseUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f151236a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static Collator f151237b = null;

    @Deprecated
    public static class InsertHelper {

        /* renamed from: a, reason: collision with root package name */
        private final SQLiteDatabase f151238a;

        /* renamed from: b, reason: collision with root package name */
        private final String f151239b;

        /* renamed from: c, reason: collision with root package name */
        private String f151240c = null;

        /* renamed from: d, reason: collision with root package name */
        private SQLiteStatement f151241d = null;

        /* renamed from: e, reason: collision with root package name */
        private SQLiteStatement f151242e = null;

        /* renamed from: f, reason: collision with root package name */
        private SQLiteStatement f151243f = null;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.f151238a = sQLiteDatabase;
            this.f151239b = str;
        }
    }

    public static int a(int i10, int i11) {
        return Math.max(i10 - (i11 / 3), 0);
    }

    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static int b(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        String upperCase = strTrim.substring(0, 3).toUpperCase(Locale.ROOT);
        if (upperCase.equals("SEL")) {
            return 1;
        }
        if (!upperCase.equals("INS") && !upperCase.equals("UPD") && !upperCase.equals("REP") && !upperCase.equals("DEL")) {
            if (upperCase.equals("ATT")) {
                return 3;
            }
            if (upperCase.equals("COM") || upperCase.equals("END")) {
                return 5;
            }
            if (upperCase.equals("ROL")) {
                return 6;
            }
            if (upperCase.equals("BEG")) {
                return 4;
            }
            if (upperCase.equals("PRA")) {
                return 7;
            }
            if (!upperCase.equals("CRE") && !upperCase.equals("DRO") && !upperCase.equals("ALT")) {
                if (!upperCase.equals("ANA") && !upperCase.equals("DET")) {
                    return 99;
                }
                return 9;
            }
            return 8;
        }
        return 2;
    }

    public static long d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) throws SQLException {
        SQLiteStatement sQLiteStatementY1 = sQLiteDatabase.Y1(str);
        try {
            return e(sQLiteStatementY1, strArr);
        } finally {
            sQLiteStatementY1.close();
        }
    }

    public static long e(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.h(strArr);
        return sQLiteStatement.z();
    }
}
