package Ub;

import android.content.Context;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f35865b;

    /* renamed from: a, reason: collision with root package name */
    public Context f35866a;

    public static synchronized a a(Context context) {
        try {
            if (f35865b == null) {
                f35865b = new a(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35865b;
    }

    private a(Context context) {
        this.f35866a = context;
    }
}
