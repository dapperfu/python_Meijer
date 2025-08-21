package sd;

import android.content.Context;

/* renamed from: sd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17067f {

    /* renamed from: b, reason: collision with root package name */
    private static final C17067f f160309b = new C17067f();

    /* renamed from: a, reason: collision with root package name */
    private C17066e f160310a = null;

    public final synchronized C17066e b(Context context) {
        try {
            if (this.f160310a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f160310a = new C17066e(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f160310a;
    }

    public static C17066e a(Context context) {
        return f160309b.b(context);
    }
}
