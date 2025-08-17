package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class G70 {

    /* renamed from: a, reason: collision with root package name */
    private final long f67108a;

    /* renamed from: c, reason: collision with root package name */
    private long f67110c;

    /* renamed from: b, reason: collision with root package name */
    private final F70 f67109b = new F70();

    /* renamed from: d, reason: collision with root package name */
    private int f67111d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f67112e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f67113f = 0;

    public final int a() {
        return this.f67111d;
    }

    public final long b() {
        return this.f67108a;
    }

    public final long c() {
        return this.f67110c;
    }

    public final void g() {
        this.f67113f++;
        this.f67109b.f66745b++;
    }

    public final void h() {
        this.f67112e++;
        this.f67109b.f66744a = true;
    }

    public final F70 d() {
        F70 f70 = this.f67109b;
        F70 f70Clone = f70.clone();
        f70.f66744a = false;
        f70.f66745b = 0;
        return f70Clone;
    }

    public final String e() {
        return "Created: " + this.f67108a + " Last accessed: " + this.f67110c + " Accesses: " + this.f67111d + "\nEntries retrieved: Valid: " + this.f67112e + " Stale: " + this.f67113f;
    }

    public G70() {
        long jA = Lc.v.c().a();
        this.f67108a = jA;
        this.f67110c = jA;
    }

    public final void f() {
        this.f67110c = Lc.v.c().a();
        this.f67111d++;
    }
}
