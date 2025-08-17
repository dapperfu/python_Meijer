package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Uz0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f70743a;

    /* renamed from: b, reason: collision with root package name */
    public C9899xA0 f70744b;

    /* renamed from: c, reason: collision with root package name */
    public int f70745c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70746d;

    /* renamed from: e, reason: collision with root package name */
    public int f70747e;

    public Uz0(C9899xA0 c9899xA0) {
        this.f70744b = c9899xA0;
    }

    public final void a(int i10) {
        this.f70743a = 1 == ((this.f70743a ? 1 : 0) | i10);
        this.f70745c += i10;
    }

    public final void b(C9899xA0 c9899xA0) {
        this.f70743a |= this.f70744b != c9899xA0;
        this.f70744b = c9899xA0;
    }

    public final void c(int i10) {
        if (this.f70746d && this.f70747e != 5) {
            C8086gC.d(i10 == 5);
            return;
        }
        this.f70743a = true;
        this.f70746d = true;
        this.f70747e = i10;
    }
}
