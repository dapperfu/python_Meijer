package zt;

import eb.C13784a;
import eb.C13785b;
import ut.C17467a;

/* renamed from: zt.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C18549c {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f173222d = C13785b.a(C18549c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final xt.f f173223a;

    /* renamed from: b, reason: collision with root package name */
    private final k f173224b;

    /* renamed from: c, reason: collision with root package name */
    private Db.b f173225c;

    private static boolean d(C17467a c17467a) {
        return "network".equals(c17467a.f164531c);
    }

    private static boolean e(C17467a c17467a) {
        return "gps".equals(c17467a.f164531c);
    }

    final float a(C17467a c17467a) {
        return this.f173225c.C() + Math.max(Math.min(c17467a.f164532d, Db.b.b(this.f173225c.e().f(), 100)), c(c17467a));
    }

    final float b(C17467a c17467a, float f10) {
        float f11;
        double dA;
        float fMax = c17467a.f164532d;
        if (d(c17467a)) {
            fMax = Math.max(Db.b.b(this.f173225c.e().g(), 50), fMax);
        } else {
            e(c17467a);
        }
        if (d(c17467a)) {
            if (f10 < Db.b.b(this.f173225c.e().n(), 1000)) {
                dA = Db.b.a(this.f173225c.e().m(), Float.valueOf(4.5f));
            } else if (f10 < Db.b.b(this.f173225c.e().l(), 3000)) {
                dA = Db.b.a(this.f173225c.e().k(), Float.valueOf(3.5f));
            } else if (f10 < Db.b.b(this.f173225c.e().j(), 10000)) {
                dA = Db.b.a(this.f173225c.e().i(), Float.valueOf(2.5f));
            } else {
                f11 = 1.0f;
                fMax *= f11;
            }
            f11 = (float) dA;
            fMax *= f11;
        }
        return this.f173225c.C() + Db.b.b(this.f173225c.e().c(), 100) + Math.max(fMax, c(c17467a));
    }

    public C18549c(xt.f fVar, k kVar, Db.b bVar) {
        this.f173223a = fVar;
        this.f173224b = kVar;
        this.f173225c = bVar;
    }

    private float c(C17467a c17467a) {
        if (d(c17467a)) {
            if (!this.f173224b.a()) {
                return 0.0f;
            }
            return 1000.0f;
        }
        if (e(c17467a)) {
            return 0.0f;
        }
        String str = c17467a.f164531c;
        return 0.0f;
    }
}
