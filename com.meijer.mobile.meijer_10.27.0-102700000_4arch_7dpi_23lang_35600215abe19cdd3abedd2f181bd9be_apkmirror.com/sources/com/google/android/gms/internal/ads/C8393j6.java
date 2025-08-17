package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8393j6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f75331a;

    /* renamed from: b, reason: collision with root package name */
    private final int f75332b;

    /* renamed from: c, reason: collision with root package name */
    private final int f75333c;

    /* renamed from: d, reason: collision with root package name */
    private int f75334d;

    /* renamed from: e, reason: collision with root package name */
    private String f75335e;

    private final void d() {
        if (this.f75334d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void c() {
        int i10 = this.f75334d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f75332b : i10 + this.f75333c;
        this.f75334d = i11;
        this.f75335e = this.f75331a + i11;
    }

    public C8393j6(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i10 + com.medallia.digital.mobilesdk.q2.f92724c;
        }
        this.f75331a = str;
        this.f75332b = i11;
        this.f75333c = i12;
        this.f75334d = Integer.MIN_VALUE;
        this.f75335e = "";
    }

    public final int a() {
        d();
        return this.f75334d;
    }

    public final String b() {
        d();
        return this.f75335e;
    }
}
