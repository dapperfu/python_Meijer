package Tb;

import vb.C17538d;
import vb.C17542h;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static C17538d f34893a;

    public static synchronized C17538d a() {
        try {
            if (f34893a == null) {
                C17538d c17538d = new C17538d();
                f34893a = c17538d;
                c17538d.b(new C17542h(), new Class[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34893a;
    }
}
