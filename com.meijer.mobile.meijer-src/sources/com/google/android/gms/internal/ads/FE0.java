package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class FE0 implements InterfaceC8751lF0, InterfaceC10030xD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f67605a;

    /* renamed from: b, reason: collision with root package name */
    private C8644kF0 f67606b;

    /* renamed from: c, reason: collision with root package name */
    private C9923wD0 f67607c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ HE0 f67608d;

    public FE0(HE0 he0, Object obj) {
        this.f67608d = he0;
        this.f67606b = he0.s(null);
        this.f67607c = he0.q(null);
        this.f67605a = obj;
    }

    private final boolean r(int i10, C7578aF0 c7578aF0) {
        C7578aF0 c7578aF0E;
        if (c7578aF0 != null) {
            c7578aF0E = this.f67608d.E(this.f67605a, c7578aF0);
            if (c7578aF0E == null) {
                return false;
            }
        } else {
            c7578aF0E = null;
        }
        this.f67608d.C(this.f67605a, 0);
        C8644kF0 c8644kF0 = this.f67606b;
        int i11 = c8644kF0.f76439a;
        if (!Objects.equals(c8644kF0.f76440b, c7578aF0E)) {
            this.f67606b = this.f67608d.t(0, c7578aF0E);
        }
        C9923wD0 c9923wD0 = this.f67607c;
        int i12 = c9923wD0.f80296a;
        if (Objects.equals(c9923wD0.f80297b, c7578aF0E)) {
            return true;
        }
        this.f67607c = this.f67608d.r(0, c7578aF0E);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void g(int i10, C7578aF0 c7578aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7578aF0)) {
            this.f67606b.e(qe0, q(we0, c7578aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void l(int i10, C7578aF0 c7578aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7578aF0)) {
            this.f67606b.h(qe0, q(we0, c7578aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void n(int i10, C7578aF0 c7578aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7578aF0)) {
            this.f67606b.f(qe0, q(we0, c7578aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void p(int i10, C7578aF0 c7578aF0, WE0 we0) {
        if (r(0, c7578aF0)) {
            this.f67606b.d(q(we0, c7578aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void z(int i10, C7578aF0 c7578aF0, QE0 qe0, WE0 we0, IOException iOException, boolean z10) {
        if (r(0, c7578aF0)) {
            this.f67606b.g(qe0, q(we0, c7578aF0), iOException, z10);
        }
    }

    private final WE0 q(WE0 we0, C7578aF0 c7578aF0) {
        HE0 he0 = this.f67608d;
        Object obj = this.f67605a;
        long j10 = we0.f71882c;
        he0.D(obj, j10, c7578aF0);
        HE0 he02 = this.f67608d;
        Object obj2 = this.f67605a;
        long j11 = we0.f71883d;
        he02.D(obj2, j11, c7578aF0);
        return (j10 == we0.f71882c && j11 == we0.f71883d) ? we0 : new WE0(1, we0.f71880a, we0.f71881b, 0, null, j10, j11);
    }
}
