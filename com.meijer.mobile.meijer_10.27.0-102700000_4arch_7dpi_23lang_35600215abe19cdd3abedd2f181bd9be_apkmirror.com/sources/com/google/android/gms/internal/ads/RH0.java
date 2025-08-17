package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class RH0 {

    /* renamed from: a, reason: collision with root package name */
    private C f69850a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8380j f69851b;

    /* synthetic */ RH0(C8380j c8380j, C8275i c8275i) {
        this.f69851b = c8380j;
    }

    public final void a(C9113ps c9113ps) {
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.G(c9113ps.f77645a);
        c9592uH0.k(c9113ps.f77646b);
        c9592uH0.B("video/raw");
        this.f69850a = c9592uH0.H();
        Iterator it = this.f69851b.f75309i.iterator();
        while (it.hasNext()) {
            ((InterfaceC7847e) it.next()).n(this.f69851b, c9113ps);
        }
    }

    public final void b(long j10, long j11, boolean z10) {
        if (z10) {
            C8380j c8380j = this.f69851b;
            if (c8380j.f75312l != null) {
                Iterator it = c8380j.f75309i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7847e) it.next()).l(this.f69851b);
                }
            }
        }
        if (this.f69851b.f75310j != null) {
            C cH = this.f69850a;
            if (cH == null) {
                cH = new C9592uH0().H();
            }
            C c10 = cH;
            C8380j c8380j2 = this.f69851b;
            c8380j2.f75310j.f(j11, c8380j2.f75308h.zzc(), c10, null);
        }
        C8086gC.b(null);
        throw null;
    }
}
