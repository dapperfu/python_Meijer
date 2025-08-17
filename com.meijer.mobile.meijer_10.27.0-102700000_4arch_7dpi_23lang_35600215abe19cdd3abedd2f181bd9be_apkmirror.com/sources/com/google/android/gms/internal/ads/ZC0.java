package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class ZC0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9330ru[] f72103a;

    /* renamed from: b, reason: collision with root package name */
    private final C9263rD0 f72104b;

    /* renamed from: c, reason: collision with root package name */
    private final C7251Uv f72105c;

    public final long b() {
        return this.f72104b.i();
    }

    public final InterfaceC9330ru[] e() {
        return this.f72103a;
    }

    public ZC0(InterfaceC9330ru... interfaceC9330ruArr) {
        C9263rD0 c9263rD0 = new C9263rD0();
        C7251Uv c7251Uv = new C7251Uv();
        InterfaceC9330ru[] interfaceC9330ruArr2 = {c9263rD0, c7251Uv};
        this.f72103a = interfaceC9330ruArr2;
        System.arraycopy(interfaceC9330ruArr, 0, interfaceC9330ruArr2, 0, 0);
        this.f72104b = c9263rD0;
        this.f72105c = c7251Uv;
    }

    public final long a(long j10) {
        return this.f72105c.zzg() ? this.f72105c.c(j10) : j10;
    }

    public final C7488ag c(C7488ag c7488ag) {
        this.f72105c.e(c7488ag.f72461a);
        this.f72105c.d(c7488ag.f72462b);
        return c7488ag;
    }

    public final boolean d(boolean z10) {
        this.f72104b.j(z10);
        return z10;
    }
}
