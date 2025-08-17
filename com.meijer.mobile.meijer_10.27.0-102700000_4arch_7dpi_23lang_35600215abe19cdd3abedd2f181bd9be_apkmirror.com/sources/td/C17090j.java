package td;

import android.content.Context;
import android.content.SharedPreferences;
import zd.C18445d;

/* renamed from: td.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17090j {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f161631a;

    public static SharedPreferences a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f161631a == null) {
                    f161631a = (SharedPreferences) C18445d.a(new CallableC17091k(context));
                }
                sharedPreferences = f161631a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
