package Xa;

import hb.C14499f;
import java.util.Map;
import java.util.WeakHashMap;
import ob.C16093d;
import ob.C16096g;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static f f41738d;

    /* renamed from: a, reason: collision with root package name */
    private Map<Object, Object> f41739a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private C16093d f41740b;

    /* renamed from: c, reason: collision with root package name */
    private C16096g f41741c;

    public static synchronized f a() {
        try {
            if (f41738d == null) {
                f41738d = new f(C14499f.a().f135268d, C14499f.a().f135273i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41738d;
    }

    public void b() {
        this.f41741c.c();
    }

    public void c() {
        this.f41741c.d();
    }

    private f(C16093d c16093d, C16096g c16096g) {
        this.f41740b = c16093d;
        this.f41741c = c16096g;
    }
}
