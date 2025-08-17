package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8908nw0 {

    /* renamed from: a, reason: collision with root package name */
    private int f77267a;

    public final void a(int i10) {
        this.f77267a |= 536870912;
    }

    public void b() {
        this.f77267a = 0;
    }

    public final void c(int i10) {
        this.f77267a = i10;
    }

    protected final boolean d(int i10) {
        return (this.f77267a & i10) == i10;
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
