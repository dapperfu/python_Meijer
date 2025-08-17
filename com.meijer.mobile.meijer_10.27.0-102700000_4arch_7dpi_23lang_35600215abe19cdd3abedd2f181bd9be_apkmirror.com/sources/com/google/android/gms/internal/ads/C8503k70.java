package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8503k70 {

    /* renamed from: a, reason: collision with root package name */
    private final C8396j70 f75587a = new C8396j70();

    /* renamed from: b, reason: collision with root package name */
    private int f75588b;

    /* renamed from: c, reason: collision with root package name */
    private int f75589c;

    /* renamed from: d, reason: collision with root package name */
    private int f75590d;

    /* renamed from: e, reason: collision with root package name */
    private int f75591e;

    /* renamed from: f, reason: collision with root package name */
    private int f75592f;

    C8503k70() {
    }

    public final void c() {
        this.f75592f++;
    }

    public final void d() {
        this.f75588b++;
        this.f75587a.f75340a = true;
    }

    public final void e() {
        this.f75591e++;
    }

    public final void f() {
        this.f75590d++;
    }

    public final void g() {
        this.f75589c++;
        this.f75587a.f75341b = true;
    }

    public final C8396j70 a() {
        C8396j70 c8396j70 = this.f75587a;
        C8396j70 c8396j70Clone = c8396j70.clone();
        c8396j70.f75340a = false;
        c8396j70.f75341b = false;
        return c8396j70Clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.f75590d + "\n\tNew pools created: " + this.f75588b + "\n\tPools removed: " + this.f75589c + "\n\tEntries added: " + this.f75592f + "\n\tNo entries retrieved: " + this.f75591e + "\n";
    }
}
