package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.rA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9382rA0 implements InterfaceC8751lF0, InterfaceC10030xD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9596tA0 f78796a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9917wA0 f78797b;

    public C9382rA0(C9917wA0 c9917wA0, C9596tA0 c9596tA0) {
        this.f78797b = c9917wA0;
        this.f78796a = c9596tA0;
    }

    private final Pair q(int i10, C7578aF0 c7578aF0) {
        C7578aF0 c7578aF0A;
        C7578aF0 c7578aF02 = null;
        if (c7578aF0 != null) {
            C9596tA0 c9596tA0 = this.f78796a;
            int i11 = 0;
            while (true) {
                if (i11 >= c9596tA0.f79340c.size()) {
                    c7578aF0A = null;
                    break;
                }
                if (((C7578aF0) c9596tA0.f79340c.get(i11)).f73225d == c7578aF0.f73225d) {
                    c7578aF0A = c7578aF0.a(Pair.create(c9596tA0.f79339b, c7578aF0.f73222a));
                    break;
                }
                i11++;
            }
            if (c7578aF0A == null) {
                return null;
            }
            c7578aF02 = c7578aF0A;
        }
        return Pair.create(Integer.valueOf(this.f78796a.f79341d), c7578aF02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void g(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7578aF0);
        if (pairQ != null) {
            this.f78797b.f80285i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.nA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77846a.f78797b.f80284h.g(((Integer) pair.first).intValue(), (C7578aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void l(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7578aF0);
        if (pairQ != null) {
            this.f78797b.f80285i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.oA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f78171a.f78797b.f80284h.l(((Integer) pair.first).intValue(), (C7578aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void n(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7578aF0);
        if (pairQ != null) {
            this.f78797b.f80285i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.qA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f78582a.f78797b.f80284h.n(((Integer) pair.first).intValue(), (C7578aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void p(int i10, C7578aF0 c7578aF0, final WE0 we0) {
        final Pair pairQ = q(0, c7578aF0);
        if (pairQ != null) {
            this.f78797b.f80285i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.pA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f78360a.f78797b.f80284h.p(((Integer) pair.first).intValue(), (C7578aF0) pair.second, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8751lF0
    public final void z(int i10, C7578aF0 c7578aF0, final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        final Pair pairQ = q(0, c7578aF0);
        if (pairQ != null) {
            this.f78797b.f80285i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.mA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77588a.f78797b.f80284h.z(((Integer) pair.first).intValue(), (C7578aF0) pair.second, qe0, we0, iOException, z10);
                }
            });
        }
    }
}
