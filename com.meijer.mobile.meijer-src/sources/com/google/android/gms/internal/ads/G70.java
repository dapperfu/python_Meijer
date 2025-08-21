package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class G70 {

    /* renamed from: a, reason: collision with root package name */
    private final long f67948a;

    /* renamed from: c, reason: collision with root package name */
    private long f67950c;

    /* renamed from: b, reason: collision with root package name */
    private final F70 f67949b = new F70();

    /* renamed from: d, reason: collision with root package name */
    private int f67951d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f67952e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f67953f = 0;

    public final int a() {
        return this.f67951d;
    }

    public final long b() {
        return this.f67948a;
    }

    public final long c() {
        return this.f67950c;
    }

    public final void g() {
        this.f67953f++;
        this.f67949b.f67585b++;
    }

    public final void h() {
        this.f67952e++;
        this.f67949b.f67584a = true;
    }

    public final F70 d() {
        F70 f70 = this.f67949b;
        F70 f70Clone = f70.clone();
        f70.f67584a = false;
        f70.f67585b = 0;
        return f70Clone;
    }

    public final String e() {
        return "Created: " + this.f67948a + " Last accessed: " + this.f67950c + " Accesses: " + this.f67951d + "\nEntries retrieved: Valid: " + this.f67952e + " Stale: " + this.f67953f;
    }

    public G70() {
        long jA = Nc.v.c().a();
        this.f67948a = jA;
        this.f67950c = jA;
    }

    public final void f() {
        this.f67950c = Nc.v.c().a();
        this.f67951d++;
    }
}
