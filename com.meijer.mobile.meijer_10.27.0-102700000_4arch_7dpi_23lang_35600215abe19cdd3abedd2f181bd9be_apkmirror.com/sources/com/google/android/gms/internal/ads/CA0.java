package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class CA0 extends NE0 {

    /* renamed from: c, reason: collision with root package name */
    private final C9954xl f65722c;

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C7306Wk d(int i10, C7306Wk c7306Wk, boolean z10) {
        C7306Wk c7306WkD = this.f68846b.d(i10, c7306Wk, z10);
        if (this.f68846b.e(c7306WkD.f71150c, this.f65722c, 0L).b()) {
            c7306WkD.i(c7306Wk.f71148a, c7306Wk.f71149b, c7306Wk.f71150c, c7306Wk.f71151d, 0L, C8867nc.f77098e, true);
            return c7306WkD;
        }
        c7306WkD.f71153f = true;
        return c7306WkD;
    }

    CA0(DA0 da0, AbstractC7307Wl abstractC7307Wl) {
        super(abstractC7307Wl);
        this.f65722c = new C9954xl();
    }
}
