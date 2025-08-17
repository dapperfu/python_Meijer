package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public abstract class WG0 {

    /* renamed from: a, reason: collision with root package name */
    private VG0 f71049a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7883eH0 f71050b;

    public HA0 b() {
        throw null;
    }

    public void c() {
        this.f71049a = null;
        this.f71050b = null;
    }

    public void d(HR hr2) {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public abstract XG0 f(IA0[] ia0Arr, C7775dG0 c7775dG0, C7453aF0 c7453aF0, AbstractC7307Wl abstractC7307Wl) throws zzib;

    public abstract void g(Object obj);

    public final void i(VG0 vg0, InterfaceC7883eH0 interfaceC7883eH0) {
        this.f71049a = vg0;
        this.f71050b = interfaceC7883eH0;
    }

    protected final InterfaceC7883eH0 h() {
        InterfaceC7883eH0 interfaceC7883eH0 = this.f71050b;
        C8086gC.b(interfaceC7883eH0);
        return interfaceC7883eH0;
    }

    protected final void j() {
        VG0 vg0 = this.f71049a;
        if (vg0 != null) {
            vg0.zzj();
        }
    }
}
