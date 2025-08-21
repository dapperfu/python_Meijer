package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9033nw0 {

    /* renamed from: a, reason: collision with root package name */
    private int f78107a;

    public final void a(int i10) {
        this.f78107a |= 536870912;
    }

    public void b() {
        this.f78107a = 0;
    }

    public final void c(int i10) {
        this.f78107a = i10;
    }

    protected final boolean d(int i10) {
        return (this.f78107a & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }

    public final boolean h() {
        return d(536870912);
    }

    public final boolean i() {
        return d(67108864);
    }
}
