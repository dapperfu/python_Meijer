package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
final class GG0 extends IG0 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final int f67989e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f67990f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f67991g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f67992h;

    /* renamed from: i, reason: collision with root package name */
    private final int f67993i;

    /* renamed from: j, reason: collision with root package name */
    private final int f67994j;

    /* renamed from: k, reason: collision with root package name */
    private final int f67995k;

    /* renamed from: l, reason: collision with root package name */
    private final int f67996l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f67997m;

    @Override // com.google.android.gms.internal.ads.IG0
    public final int a() {
        return this.f67989e;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final /* bridge */ /* synthetic */ boolean b(IG0 ig0) {
        return false;
    }

    public GG0(int i10, C9867vm c9867vm, int i11, BG0 bg0, int i12, String str) {
        boolean z10;
        boolean z11;
        AbstractC8042eh0 abstractC8042eh0U;
        int iM;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, c9867vm, i11);
        int i13 = 0;
        this.f67990f = GA0.a(i12, false);
        int i14 = this.f68426d.f66494e;
        int i15 = bg0.f69577w;
        if (1 != (i14 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f67991g = z10;
        if ((i14 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f67992h = z11;
        if (bg0.f69575u.isEmpty()) {
            abstractC8042eh0U = AbstractC8042eh0.u("");
        } else {
            abstractC8042eh0U = bg0.f69575u;
        }
        int i16 = 0;
        while (true) {
            if (i16 < abstractC8042eh0U.size()) {
                iM = NG0.m(this.f68426d, (String) abstractC8042eh0U.get(i16), false);
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
        this.f67993i = i16;
        this.f67994j = iM;
        int iL = NG0.l(this.f68426d.f66495f, bg0.f69576v);
        this.f67995k = iL;
        if ((this.f68426d.f66495f & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f67997m = z12;
        if (NG0.p(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int iM2 = NG0.m(this.f68426d, str, z13);
        this.f67996l = iM2;
        if (iM > 0 || ((bg0.f69575u.isEmpty() && iL > 0) || this.f67991g || (this.f67992h && iM2 > 0))) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (GA0.a(i12, bg0.f66345O) && z14) {
            i13 = 1;
        }
        this.f67989e = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GG0 gg0) {
        AbstractC7193Ph0 abstractC7193Ph0A;
        AbstractC7327Tg0 abstractC7327Tg0D = AbstractC7327Tg0.i().d(this.f67990f, gg0.f67990f).c(Integer.valueOf(this.f67993i), Integer.valueOf(gg0.f67993i), AbstractC7193Ph0.c().a()).b(this.f67994j, gg0.f67994j).b(this.f67995k, gg0.f67995k).d(this.f67991g, gg0.f67991g);
        Boolean boolValueOf = Boolean.valueOf(this.f67992h);
        Boolean boolValueOf2 = Boolean.valueOf(gg0.f67992h);
        if (this.f67994j == 0) {
            abstractC7193Ph0A = AbstractC7193Ph0.c();
        } else {
            abstractC7193Ph0A = AbstractC7193Ph0.c().a();
        }
        AbstractC7327Tg0 abstractC7327Tg0B = abstractC7327Tg0D.c(boolValueOf, boolValueOf2, abstractC7193Ph0A).b(this.f67996l, gg0.f67996l);
        if (this.f67995k == 0) {
            abstractC7327Tg0B = abstractC7327Tg0B.e(this.f67997m, gg0.f67997m);
        }
        return abstractC7327Tg0B.a();
    }
}
