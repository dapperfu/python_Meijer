package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class ZC0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9455ru[] f72943a;

    /* renamed from: b, reason: collision with root package name */
    private final C9388rD0 f72944b;

    /* renamed from: c, reason: collision with root package name */
    private final C7376Uv f72945c;

    public final long b() {
        return this.f72944b.i();
    }

    public final InterfaceC9455ru[] e() {
        return this.f72943a;
    }

    public ZC0(InterfaceC9455ru... interfaceC9455ruArr) {
        C9388rD0 c9388rD0 = new C9388rD0();
        C7376Uv c7376Uv = new C7376Uv();
        InterfaceC9455ru[] interfaceC9455ruArr2 = {c9388rD0, c7376Uv};
        this.f72943a = interfaceC9455ruArr2;
        System.arraycopy(interfaceC9455ruArr, 0, interfaceC9455ruArr2, 0, 0);
        this.f72944b = c9388rD0;
        this.f72945c = c7376Uv;
    }

    public final long a(long j10) {
        return this.f72945c.zzg() ? this.f72945c.c(j10) : j10;
    }

    public final C7613ag c(C7613ag c7613ag) {
        this.f72945c.e(c7613ag.f73301a);
        this.f72945c.d(c7613ag.f73302b);
        return c7613ag;
    }

    public final boolean d(boolean z10) {
        this.f72944b.j(z10);
        return z10;
    }
}
