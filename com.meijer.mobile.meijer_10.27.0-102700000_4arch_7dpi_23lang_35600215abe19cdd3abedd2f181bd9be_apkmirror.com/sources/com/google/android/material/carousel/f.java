package com.google.android.material.carousel;

import be.C6230a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f86618a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f86619b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86620c;

    /* renamed from: d, reason: collision with root package name */
    private final int f86621d;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f86622a;

        /* renamed from: b, reason: collision with root package name */
        private final float f86623b;

        /* renamed from: d, reason: collision with root package name */
        private c f86625d;

        /* renamed from: e, reason: collision with root package name */
        private c f86626e;

        /* renamed from: c, reason: collision with root package name */
        private final List<c> f86624c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f86627f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f86628g = -1;

        /* renamed from: h, reason: collision with root package name */
        private float f86629h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        private int f86630i = -1;

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
                int i10 = this.f86630i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f86630i = this.f86624c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f86625d == null) {
                    this.f86625d = cVar;
                    this.f86627f = this.f86624c.size();
                }
                if (this.f86628g != -1 && this.f86624c.size() - this.f86628g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f86625d.f86634d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f86626e = cVar;
                this.f86628g = this.f86624c.size();
            } else {
                if (this.f86625d == null && cVar.f86634d < this.f86629h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f86626e != null && cVar.f86634d > this.f86629h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f86629h = cVar.f86634d;
            this.f86624c.add(cVar);
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
            float f16 = this.f86623b;
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
            if (this.f86625d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f86624c.size(); i10++) {
                c cVar = this.f86624c.get(i10);
                arrayList.add(new c(j(this.f86625d.f86632b, this.f86622a, this.f86627f, i10), cVar.f86632b, cVar.f86633c, cVar.f86634d, cVar.f86635e, cVar.f86636f, cVar.f86637g, cVar.f86638h));
            }
            return new f(this.f86622a, arrayList, this.f86627f, this.f86628g);
        }

        b(float f10, float f11) {
            this.f86622a = f10;
            this.f86623b = f11;
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final float f86631a;

        /* renamed from: b, reason: collision with root package name */
        final float f86632b;

        /* renamed from: c, reason: collision with root package name */
        final float f86633c;

        /* renamed from: d, reason: collision with root package name */
        final float f86634d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f86635e;

        /* renamed from: f, reason: collision with root package name */
        final float f86636f;

        /* renamed from: g, reason: collision with root package name */
        final float f86637g;

        /* renamed from: h, reason: collision with root package name */
        final float f86638h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f86631a = f10;
            this.f86632b = f11;
            this.f86633c = f12;
            this.f86634d = f13;
            this.f86635e = z10;
            this.f86636f = f14;
            this.f86637g = f15;
            this.f86638h = f16;
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(C6230a.a(cVar.f86631a, cVar2.f86631a, f10), C6230a.a(cVar.f86632b, cVar2.f86632b, f10), C6230a.a(cVar.f86633c, cVar2.f86633c, f10), C6230a.a(cVar.f86634d, cVar2.f86634d, f10));
        }
    }

    c d() {
        for (int i10 = 0; i10 < this.f86619b.size(); i10++) {
            c cVar = this.f86619b.get(i10);
            if (!cVar.f86635e) {
                return cVar;
            }
        }
        return null;
    }

    private f(float f10, List<c> list, int i10, int i11) {
        this.f86618a = f10;
        this.f86619b = Collections.unmodifiableList(list);
        this.f86620c = i10;
        this.f86621d = i11;
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f86632b) - (fVar.j().f86634d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d((cVar.f86634d / 2.0f) + f11, cVar.f86633c, cVar.f86634d, size >= fVar.b() && size <= fVar.i(), cVar.f86635e);
            f11 += cVar.f86634d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f86619b.get(this.f86620c);
    }

    int b() {
        return this.f86620c;
    }

    c c() {
        return this.f86619b.get(0);
    }

    List<c> e() {
        return this.f86619b.subList(this.f86620c, this.f86621d + 1);
    }

    float f() {
        return this.f86618a;
    }

    List<c> g() {
        return this.f86619b;
    }

    c h() {
        return this.f86619b.get(this.f86621d);
    }

    int i() {
        return this.f86621d;
    }

    c j() {
        return this.f86619b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f86619b.size() - 1; size >= 0; size--) {
            c cVar = this.f86619b.get(size);
            if (!cVar.f86635e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f86619b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f86635e) {
                i10++;
            }
        }
        return this.f86619b.size() - i10;
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
                return new f(fVar.f(), arrayList, C6230a.c(fVar.b(), fVar2.b(), f10), C6230a.c(fVar.i(), fVar2.i(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }
}
