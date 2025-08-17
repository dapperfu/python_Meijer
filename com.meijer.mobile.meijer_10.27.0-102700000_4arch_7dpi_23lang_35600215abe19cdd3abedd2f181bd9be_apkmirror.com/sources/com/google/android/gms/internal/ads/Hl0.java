package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Hl0 implements InterfaceC7100Qg0 {

    /* renamed from: b, reason: collision with root package name */
    private Pu0 f67501b;

    /* renamed from: c, reason: collision with root package name */
    private String f67502c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f67505f;

    /* renamed from: a, reason: collision with root package name */
    private final Nr0 f67500a = new Nr0();

    /* renamed from: d, reason: collision with root package name */
    private int f67503d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f67504e = 8000;

    public final Hl0 a(boolean z10) {
        this.f67505f = true;
        return this;
    }

    public final Hl0 b(int i10) {
        this.f67503d = i10;
        return this;
    }

    public final Hl0 c(int i10) {
        this.f67504e = i10;
        return this;
    }

    public final Hl0 d(Pu0 pu0) {
        this.f67501b = pu0;
        return this;
    }

    public final Hl0 e(String str) {
        this.f67502c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7100Qg0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C8785mo0 zza() {
        C8785mo0 c8785mo0 = new C8785mo0(this.f67502c, this.f67503d, this.f67504e, this.f67505f, false, this.f67500a, null, false, null);
        Pu0 pu0 = this.f67501b;
        if (pu0 != null) {
            c8785mo0.d(pu0);
        }
        return c8785mo0;
    }
}
