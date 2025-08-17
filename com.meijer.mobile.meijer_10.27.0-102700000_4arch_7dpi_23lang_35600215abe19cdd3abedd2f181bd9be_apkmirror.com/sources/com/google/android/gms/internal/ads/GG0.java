package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class GG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f67149e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f67150f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f67151g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f67152h;

    /* renamed from: i, reason: collision with root package name */
    private final int f67153i;

    /* renamed from: j, reason: collision with root package name */
    private final int f67154j;

    /* renamed from: k, reason: collision with root package name */
    private final int f67155k;

    /* renamed from: l, reason: collision with root package name */
    private final int f67156l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f67157m;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f67149e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        return false;
    }

    public GG0(int i10, C9742vm c9742vm, int i11, BG0 bg0, int i12, String str) {
        boolean z10;
        boolean z11;
        AbstractC7917eh0 abstractC7917eh0U;
        int iM;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, c9742vm, i11);
        int i13 = 0;
        this.f67150f = GA0.a(i12, false);
        int i14 = this.f67586d.f65654e;
        int i15 = bg0.f68737w;
        if (1 != (i14 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f67151g = z10;
        if ((i14 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f67152h = z11;
        if (bg0.f68735u.isEmpty()) {
            abstractC7917eh0U = AbstractC7917eh0.u("");
        } else {
            abstractC7917eh0U = bg0.f68735u;
        }
        int i16 = 0;
        while (true) {
            if (i16 < abstractC7917eh0U.size()) {
                iM = NG0.m(this.f67586d, (String) abstractC7917eh0U.get(i16), false);
                if (iM > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i16 = a.e.API_PRIORITY_OTHER;
                iM = 0;
                break;
            }
        }
        this.f67153i = i16;
        this.f67154j = iM;
        int iL = NG0.l(this.f67586d.f65655f, bg0.f68736v);
        this.f67155k = iL;
        if ((this.f67586d.f65655f & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f67157m = z12;
        if (NG0.p(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int iM2 = NG0.m(this.f67586d, str, z13);
        this.f67156l = iM2;
        if (iM > 0 || ((bg0.f68735u.isEmpty() && iL > 0) || this.f67151g || (this.f67152h && iM2 > 0))) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (GA0.a(i12, bg0.f65505O) && z14) {
            i13 = 1;
        }
        this.f67149e = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GG0 gg0) {
        AbstractC7068Ph0 abstractC7068Ph0A;
        AbstractC7202Tg0 abstractC7202Tg0D = AbstractC7202Tg0.i().d(this.f67150f, gg0.f67150f).c(Integer.valueOf(this.f67153i), Integer.valueOf(gg0.f67153i), AbstractC7068Ph0.c().a()).b(this.f67154j, gg0.f67154j).b(this.f67155k, gg0.f67155k).d(this.f67151g, gg0.f67151g);
        Boolean boolValueOf = Boolean.valueOf(this.f67152h);
        Boolean boolValueOf2 = Boolean.valueOf(gg0.f67152h);
        if (this.f67154j == 0) {
            abstractC7068Ph0A = AbstractC7068Ph0.c();
        } else {
            abstractC7068Ph0A = AbstractC7068Ph0.c().a();
        }
        AbstractC7202Tg0 abstractC7202Tg0B = abstractC7202Tg0D.c(boolValueOf, boolValueOf2, abstractC7068Ph0A).b(this.f67156l, gg0.f67156l);
        if (this.f67155k == 0) {
            abstractC7202Tg0B = abstractC7202Tg0B.e(this.f67157m, gg0.f67157m);
        }
        return abstractC7202Tg0B.a();
    }
}
