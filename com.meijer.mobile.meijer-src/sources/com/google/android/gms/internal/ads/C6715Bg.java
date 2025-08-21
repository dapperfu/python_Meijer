package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6715Bg {

    /* renamed from: a, reason: collision with root package name */
    private final C9606tF0 f66410a = new C9606tF0();

    public final C6715Bg c(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.f66410a.a(iArr[i10]);
        }
        return this;
    }

    public final C6715Bg a(int i10) {
        this.f66410a.a(i10);
        return this;
    }

    public final C6715Bg d(int i10, boolean z10) {
        if (z10) {
            this.f66410a.a(i10);
        }
        return this;
    }

    public final C7722bh e() {
        return new C7722bh(this.f66410a.b(), null);
    }

    public final C6715Bg b(C7722bh c7722bh) {
        C9608tG0 c9608tG0 = c7722bh.f73696a;
        for (int i10 = 0; i10 < c9608tG0.b(); i10++) {
            this.f66410a.a(c9608tG0.a(i10));
        }
        return this;
    }
}
