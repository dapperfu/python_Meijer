package net.zetetic.database.sqlcipher;

import android.os.StatFs;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class SQLiteGlobal {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f152370a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f152371b = 4096;

    public static int d() {
        return 10000;
    }

    private static native int nativeReleaseMemory();

    public static String a() {
        return "delete";
    }

    public static int b() {
        synchronized (f152370a) {
            try {
                if (f152371b == 0) {
                    f152371b = new StatFs("/data").getBlockSize();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    public static String c() {
        return "normal";
    }

    public static int e() {
        return Math.max(1, 1000);
    }

    public static int f() {
        return Math.max(2, 10);
    }

    public static String g() {
        return "normal";
    }

    private SQLiteGlobal() {
    }
}
