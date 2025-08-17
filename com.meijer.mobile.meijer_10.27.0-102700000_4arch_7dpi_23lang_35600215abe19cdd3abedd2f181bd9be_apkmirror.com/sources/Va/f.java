package Va;

import fb.C13869f;
import java.util.Map;
import java.util.WeakHashMap;
import mb.C15583d;
import mb.C15586g;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static f f37026d;

    /* renamed from: a, reason: collision with root package name */
    private Map<Object, Object> f37027a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private C15583d f37028b;

    /* renamed from: c, reason: collision with root package name */
    private C15586g f37029c;

    public static synchronized f a() {
        try {
            if (f37026d == null) {
                f37026d = new f(C13869f.a().f130922d, C13869f.a().f130927i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37026d;
    }

    public void b() {
        this.f37029c.c();
    }

    public void c() {
        this.f37029c.d();
    }

    private f(C15583d c15583d, C15586g c15586g) {
        this.f37028b = c15583d;
        this.f37029c = c15586g;
    }
}
