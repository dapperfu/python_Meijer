package zt;

import cb.C6380a;
import cb.C6381b;
import ut.C17315a;

/* renamed from: zt.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C18573c {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f173261d = C6381b.a(C18573c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final xt.f f173262a;

    /* renamed from: b, reason: collision with root package name */
    private final k f173263b;

    /* renamed from: c, reason: collision with root package name */
    private Bb.b f173264c;

    private static boolean d(C17315a c17315a) {
        return "network".equals(c17315a.f163453c);
    }

    private static boolean e(C17315a c17315a) {
        return "gps".equals(c17315a.f163453c);
    }

    final float a(C17315a c17315a) {
        return this.f173264c.C() + Math.max(Math.min(c17315a.f163454d, Bb.b.b(this.f173264c.e().f(), 100)), c(c17315a));
    }

    final float b(C17315a c17315a, float f10) {
        float f11;
        double dA;
        float fMax = c17315a.f163454d;
        if (d(c17315a)) {
            fMax = Math.max(Bb.b.b(this.f173264c.e().g(), 50), fMax);
        } else {
            e(c17315a);
        }
        if (d(c17315a)) {
            if (f10 < Bb.b.b(this.f173264c.e().n(), 1000)) {
                dA = Bb.b.a(this.f173264c.e().m(), Float.valueOf(4.5f));
            } else if (f10 < Bb.b.b(this.f173264c.e().l(), 3000)) {
                dA = Bb.b.a(this.f173264c.e().k(), Float.valueOf(3.5f));
            } else if (f10 < Bb.b.b(this.f173264c.e().j(), 10000)) {
                dA = Bb.b.a(this.f173264c.e().i(), Float.valueOf(2.5f));
            } else {
                f11 = 1.0f;
                fMax *= f11;
            }
            f11 = (float) dA;
            fMax *= f11;
        }
        return this.f173264c.C() + Bb.b.b(this.f173264c.e().c(), 100) + Math.max(fMax, c(c17315a));
    }

    public C18573c(xt.f fVar, k kVar, Bb.b bVar) {
        this.f173262a = fVar;
        this.f173263b = kVar;
        this.f173264c = bVar;
    }

    private float c(C17315a c17315a) {
        if (d(c17315a)) {
            if (!this.f173263b.a()) {
                return 0.0f;
            }
            return 1000.0f;
        }
        if (e(c17315a)) {
            return 0.0f;
        }
        String str = c17315a.f163453c;
        return 0.0f;
    }
}
