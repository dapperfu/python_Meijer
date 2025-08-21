package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8518j6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f76171a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76172b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76173c;

    /* renamed from: d, reason: collision with root package name */
    private int f76174d;

    /* renamed from: e, reason: collision with root package name */
    private String f76175e;

    private final void d() {
        if (this.f76174d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void c() {
        int i10 = this.f76174d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f76172b : i10 + this.f76173c;
        this.f76174d = i11;
        this.f76175e = this.f76171a + i11;
    }

    public C8518j6(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i10 + com.medallia.digital.mobilesdk.q2.f93563c;
        }
        this.f76171a = str;
        this.f76172b = i11;
        this.f76173c = i12;
        this.f76174d = Integer.MIN_VALUE;
        this.f76175e = "";
    }

    public final int a() {
        d();
        return this.f76174d;
    }

    public final String b() {
        d();
        return this.f76175e;
    }
}
