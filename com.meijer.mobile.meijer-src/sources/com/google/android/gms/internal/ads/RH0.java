package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class RH0 {

    /* renamed from: a, reason: collision with root package name */
    private C f70690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8505j f70691b;

    /* synthetic */ RH0(C8505j c8505j, C8400i c8400i) {
        this.f70691b = c8505j;
    }

    public final void a(C9238ps c9238ps) {
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.G(c9238ps.f78485a);
        c9717uH0.k(c9238ps.f78486b);
        c9717uH0.B("video/raw");
        this.f70690a = c9717uH0.H();
        Iterator it = this.f70691b.f76149i.iterator();
        while (it.hasNext()) {
            ((InterfaceC7972e) it.next()).n(this.f70691b, c9238ps);
        }
    }

    public final void b(long j10, long j11, boolean z10) {
        if (z10) {
            C8505j c8505j = this.f70691b;
            if (c8505j.f76152l != null) {
                Iterator it = c8505j.f76149i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7972e) it.next()).l(this.f70691b);
                }
            }
        }
        if (this.f70691b.f76150j != null) {
            C cH = this.f70690a;
            if (cH == null) {
                cH = new C9717uH0().H();
            }
            C c10 = cH;
            C8505j c8505j2 = this.f70691b;
            c8505j2.f76150j.g(j11, c8505j2.f76148h.zzc(), c10, null);
        }
        C8211gC.b(null);
        throw null;
    }
}
