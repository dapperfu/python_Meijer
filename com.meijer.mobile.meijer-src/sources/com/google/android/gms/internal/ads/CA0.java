package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class CA0 extends NE0 {

    /* renamed from: c, reason: collision with root package name */
    private final C10079xl f66562c;

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7432Wl
    public final C7431Wk d(int i10, C7431Wk c7431Wk, boolean z10) {
        C7431Wk c7431WkD = this.f69686b.d(i10, c7431Wk, z10);
        if (this.f69686b.e(c7431WkD.f71990c, this.f66562c, 0L).b()) {
            c7431WkD.i(c7431Wk.f71988a, c7431Wk.f71989b, c7431Wk.f71990c, c7431Wk.f71991d, 0L, C8992nc.f77938e, true);
            return c7431WkD;
        }
        c7431WkD.f71993f = true;
        return c7431WkD;
    }

    CA0(DA0 da0, AbstractC7432Wl abstractC7432Wl) {
        super(abstractC7432Wl);
        this.f66562c = new C10079xl();
    }
}
