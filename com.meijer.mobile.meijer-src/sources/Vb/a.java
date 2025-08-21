package Vb;

import xb.C18150d;
import xb.C18154h;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static C18150d f39826a;

    public static synchronized C18150d a() {
        try {
            if (f39826a == null) {
                C18150d c18150d = new C18150d();
                f39826a = c18150d;
                c18150d.b(new C18154h(), new Class[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f39826a;
    }
}
