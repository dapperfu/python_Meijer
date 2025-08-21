package com.google.android.material.carousel;

import de.C13661a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f87458a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f87459b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87460c;

    /* renamed from: d, reason: collision with root package name */
    private final int f87461d;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f87462a;

        /* renamed from: b, reason: collision with root package name */
        private final float f87463b;

        /* renamed from: d, reason: collision with root package name */
        private c f87465d;

        /* renamed from: e, reason: collision with root package name */
        private c f87466e;

        /* renamed from: c, reason: collision with root package name */
        private final List<c> f87464c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f87467f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f87468g = -1;

        /* renamed from: h, reason: collision with root package name */
        private float f87469h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        private int f87470i = -1;

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f87470i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f87470i = this.f87464c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f87465d == null) {
                    this.f87465d = cVar;
                    this.f87467f = this.f87464c.size();
                }
                if (this.f87468g != -1 && this.f87464c.size() - this.f87468g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f87465d.f87474d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f87466e = cVar;
                this.f87468g = this.f87464c.size();
            } else {
                if (this.f87465d == null && cVar.f87474d < this.f87469h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f87466e != null && cVar.f87474d > this.f87469h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f87469h = cVar.f87474d;
            this.f87464c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f87463b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        f i() {
            if (this.f87465d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f87464c.size(); i10++) {
                c cVar = this.f87464c.get(i10);
                arrayList.add(new c(j(this.f87465d.f87472b, this.f87462a, this.f87467f, i10), cVar.f87472b, cVar.f87473c, cVar.f87474d, cVar.f87475e, cVar.f87476f, cVar.f87477g, cVar.f87478h));
            }
            return new f(this.f87462a, arrayList, this.f87467f, this.f87468g);
        }

        b(float f10, float f11) {
            this.f87462a = f10;
            this.f87463b = f11;
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final float f87471a;

        /* renamed from: b, reason: collision with root package name */
        final float f87472b;

        /* renamed from: c, reason: collision with root package name */
        final float f87473c;

        /* renamed from: d, reason: collision with root package name */
        final float f87474d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f87475e;

        /* renamed from: f, reason: collision with root package name */
        final float f87476f;

        /* renamed from: g, reason: collision with root package name */
        final float f87477g;

        /* renamed from: h, reason: collision with root package name */
        final float f87478h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f87471a = f10;
            this.f87472b = f11;
            this.f87473c = f12;
            this.f87474d = f13;
            this.f87475e = z10;
            this.f87476f = f14;
            this.f87477g = f15;
            this.f87478h = f16;
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(C13661a.a(cVar.f87471a, cVar2.f87471a, f10), C13661a.a(cVar.f87472b, cVar2.f87472b, f10), C13661a.a(cVar.f87473c, cVar2.f87473c, f10), C13661a.a(cVar.f87474d, cVar2.f87474d, f10));
        }
    }

    c d() {
        for (int i10 = 0; i10 < this.f87459b.size(); i10++) {
            c cVar = this.f87459b.get(i10);
            if (!cVar.f87475e) {
                return cVar;
            }
        }
        return null;
    }

    private f(float f10, List<c> list, int i10, int i11) {
        this.f87458a = f10;
        this.f87459b = Collections.unmodifiableList(list);
        this.f87460c = i10;
        this.f87461d = i11;
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f87472b) - (fVar.j().f87474d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d((cVar.f87474d / 2.0f) + f11, cVar.f87473c, cVar.f87474d, size >= fVar.b() && size <= fVar.i(), cVar.f87475e);
            f11 += cVar.f87474d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f87459b.get(this.f87460c);
    }

    int b() {
        return this.f87460c;
    }

    c c() {
        return this.f87459b.get(0);
    }

    List<c> e() {
        return this.f87459b.subList(this.f87460c, this.f87461d + 1);
    }

    float f() {
        return this.f87458a;
    }

    List<c> g() {
        return this.f87459b;
    }

    c h() {
        return this.f87459b.get(this.f87461d);
    }

    int i() {
        return this.f87461d;
    }

    c j() {
        return this.f87459b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f87459b.size() - 1; size >= 0; size--) {
            c cVar = this.f87459b.get(size);
            if (!cVar.f87475e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f87459b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f87475e) {
                i10++;
            }
        }
        return this.f87459b.size() - i10;
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() == fVar2.f()) {
            List<c> listG = fVar.g();
            List<c> listG2 = fVar2.g();
            if (listG.size() == listG2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < fVar.g().size(); i10++) {
                    arrayList.add(c.a(listG.get(i10), listG2.get(i10), f10));
                }
                return new f(fVar.f(), arrayList, C13661a.c(fVar.b(), fVar2.b(), f10), C13661a.c(fVar.i(), fVar2.i(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }
}
