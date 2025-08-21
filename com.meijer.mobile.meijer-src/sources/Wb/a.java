package Wb;

import android.content.Context;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f40890b;

    /* renamed from: a, reason: collision with root package name */
    public Context f40891a;

    public static synchronized a a(Context context) {
        try {
            if (f40890b == null) {
                f40890b = new a(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40890b;
    }

    private a(Context context) {
        this.f40891a = context;
    }
}
