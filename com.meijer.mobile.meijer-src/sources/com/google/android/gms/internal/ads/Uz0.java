package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Uz0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f71583a;

    /* renamed from: b, reason: collision with root package name */
    public C10024xA0 f71584b;

    /* renamed from: c, reason: collision with root package name */
    public int f71585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f71586d;

    /* renamed from: e, reason: collision with root package name */
    public int f71587e;

    public Uz0(C10024xA0 c10024xA0) {
        this.f71584b = c10024xA0;
    }

    public final void a(int i10) {
        this.f71583a = 1 == ((this.f71583a ? 1 : 0) | i10);
        this.f71585c += i10;
    }

    public final void b(C10024xA0 c10024xA0) {
        this.f71583a |= this.f71584b != c10024xA0;
        this.f71584b = c10024xA0;
    }

    public final void c(int i10) {
        if (this.f71586d && this.f71587e != 5) {
            C8211gC.d(i10 == 5);
            return;
        }
        this.f71583a = true;
        this.f71586d = true;
        this.f71587e = i10;
    }
}
