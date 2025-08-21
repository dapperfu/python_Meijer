package vd;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vd.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17665j {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f165809a;

    public static SharedPreferences a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f165809a == null) {
                    f165809a = (SharedPreferences) Bd.d.a(new CallableC17666k(context));
                }
                sharedPreferences = f165809a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
