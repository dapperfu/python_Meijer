package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8628k70 {

    /* renamed from: a, reason: collision with root package name */
    private final C8521j70 f76427a = new C8521j70();

    /* renamed from: b, reason: collision with root package name */
    private int f76428b;

    /* renamed from: c, reason: collision with root package name */
    private int f76429c;

    /* renamed from: d, reason: collision with root package name */
    private int f76430d;

    /* renamed from: e, reason: collision with root package name */
    private int f76431e;

    /* renamed from: f, reason: collision with root package name */
    private int f76432f;

    C8628k70() {
    }

    public final void c() {
        this.f76432f++;
    }

    public final void d() {
        this.f76428b++;
        this.f76427a.f76180a = true;
    }

    public final void e() {
        this.f76431e++;
    }

    public final void f() {
        this.f76430d++;
    }

    public final void g() {
        this.f76429c++;
        this.f76427a.f76181b = true;
    }

    public final C8521j70 a() {
        C8521j70 c8521j70 = this.f76427a;
        C8521j70 c8521j70Clone = c8521j70.clone();
        c8521j70.f76180a = false;
        c8521j70.f76181b = false;
        return c8521j70Clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f76430d + "\n\tNew pools created: " + this.f76428b + "\n\tPools removed: " + this.f76429c + "\n\tEntries added: " + this.f76432f + "\n\tNo entries retrieved: " + this.f76431e + "\n";
    }
}
