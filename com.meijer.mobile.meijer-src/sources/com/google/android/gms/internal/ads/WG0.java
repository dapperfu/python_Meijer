package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public abstract class WG0 {

    /* renamed from: a, reason: collision with root package name */
    private VG0 f71889a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC8008eH0 f71890b;

    public HA0 b() {
        throw null;
    }

    public void c() {
        this.f71889a = null;
        this.f71890b = null;
    }

    public void d(HR hr2) {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public abstract XG0 f(IA0[] ia0Arr, C7900dG0 c7900dG0, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl) throws zzib;

    public abstract void g(Object obj);

    public final void i(VG0 vg0, InterfaceC8008eH0 interfaceC8008eH0) {
        this.f71889a = vg0;
        this.f71890b = interfaceC8008eH0;
    }

    protected final InterfaceC8008eH0 h() {
        InterfaceC8008eH0 interfaceC8008eH0 = this.f71890b;
        C8211gC.b(interfaceC8008eH0);
        return interfaceC8008eH0;
    }

    protected final void j() {
        VG0 vg0 = this.f71889a;
        if (vg0 != null) {
            vg0.zzj();
        }
    }
}
