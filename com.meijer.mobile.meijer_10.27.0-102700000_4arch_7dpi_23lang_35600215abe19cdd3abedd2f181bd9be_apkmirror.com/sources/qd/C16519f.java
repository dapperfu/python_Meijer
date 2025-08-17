package qd;

import android.content.Context;

/* renamed from: qd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16519f {

    /* renamed from: b, reason: collision with root package name */
    private static final C16519f f157194b = new C16519f();

    /* renamed from: a, reason: collision with root package name */
    private C16518e f157195a = null;

    public final synchronized C16518e b(Context context) {
        try {
            if (this.f157195a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f157195a = new C16518e(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f157195a;
    }

    public static C16518e a(Context context) {
        return f157194b.b(context);
    }
}
