package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6590Bg {

    /* renamed from: a, reason: collision with root package name */
    private final C9481tF0 f65570a = new C9481tF0();

    public final C6590Bg c(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.f65570a.a(iArr[i10]);
        }
        return this;
    }

    public final C6590Bg a(int i10) {
        this.f65570a.a(i10);
        return this;
    }

    public final C6590Bg d(int i10, boolean z10) {
        if (z10) {
            this.f65570a.a(i10);
        }
        return this;
    }

    public final C7597bh e() {
        return new C7597bh(this.f65570a.b(), null);
    }

    public final C6590Bg b(C7597bh c7597bh) {
        C9483tG0 c9483tG0 = c7597bh.f72856a;
        for (int i10 = 0; i10 < c9483tG0.b(); i10++) {
            this.f65570a.a(c9483tG0.a(i10));
        }
        return this;
    }
}
