package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Hl0 implements InterfaceC7225Qg0 {

    /* renamed from: b, reason: collision with root package name */
    private Pu0 f68341b;

    /* renamed from: c, reason: collision with root package name */
    private String f68342c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f68345f;

    /* renamed from: a, reason: collision with root package name */
    private final Nr0 f68340a = new Nr0();

    /* renamed from: d, reason: collision with root package name */
    private int f68343d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f68344e = 8000;

    public final Hl0 a(boolean z10) {
        this.f68345f = true;
        return this;
    }

    public final Hl0 b(int i10) {
        this.f68343d = i10;
        return this;
    }

    public final Hl0 c(int i10) {
        this.f68344e = i10;
        return this;
    }

    public final Hl0 d(Pu0 pu0) {
        this.f68341b = pu0;
        return this;
    }

    public final Hl0 e(String str) {
        this.f68342c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7225Qg0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C8910mo0 zza() {
        C8910mo0 c8910mo0 = new C8910mo0(this.f68342c, this.f68343d, this.f68344e, this.f68345f, false, this.f68340a, null, false, null);
        Pu0 pu0 = this.f68341b;
        if (pu0 != null) {
            c8910mo0.d(pu0);
        }
        return c8910mo0;
    }
}
