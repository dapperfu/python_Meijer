package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.rA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9257rA0 implements InterfaceC8626lF0, InterfaceC9905xD0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9471tA0 f77956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9792wA0 f77957b;

    public C9257rA0(C9792wA0 c9792wA0, C9471tA0 c9471tA0) {
        this.f77957b = c9792wA0;
        this.f77956a = c9471tA0;
    }

    private final Pair q(int i10, C7453aF0 c7453aF0) {
        C7453aF0 c7453aF0A;
        C7453aF0 c7453aF02 = null;
        if (c7453aF0 != null) {
            C9471tA0 c9471tA0 = this.f77956a;
            int i11 = 0;
            while (true) {
                if (i11 >= c9471tA0.f78500c.size()) {
                    c7453aF0A = null;
                    break;
                }
                if (((C7453aF0) c9471tA0.f78500c.get(i11)).f72385d == c7453aF0.f72385d) {
                    c7453aF0A = c7453aF0.a(Pair.create(c9471tA0.f78499b, c7453aF0.f72382a));
                    break;
                }
                i11++;
            }
            if (c7453aF0A == null) {
                return null;
            }
            c7453aF02 = c7453aF0A;
        }
        return Pair.create(Integer.valueOf(this.f77956a.f78501d), c7453aF02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void g(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7453aF0);
        if (pairQ != null) {
            this.f77957b.f79445i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.nA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77006a.f77957b.f79444h.g(((Integer) pair.first).intValue(), (C7453aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void l(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7453aF0);
        if (pairQ != null) {
            this.f77957b.f79445i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.oA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77331a.f77957b.f79444h.l(((Integer) pair.first).intValue(), (C7453aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void n(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0) {
        final Pair pairQ = q(0, c7453aF0);
        if (pairQ != null) {
            this.f77957b.f79445i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.qA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77742a.f77957b.f79444h.n(((Integer) pair.first).intValue(), (C7453aF0) pair.second, qe0, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void p(int i10, C7453aF0 c7453aF0, final WE0 we0) {
        final Pair pairQ = q(0, c7453aF0);
        if (pairQ != null) {
            this.f77957b.f79445i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.pA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f77520a.f77957b.f79444h.p(((Integer) pair.first).intValue(), (C7453aF0) pair.second, we0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void z(int i10, C7453aF0 c7453aF0, final QE0 qe0, final WE0 we0, final IOException iOException, final boolean z10) {
        final Pair pairQ = q(0, c7453aF0);
        if (pairQ != null) {
            this.f77957b.f79445i.b(new Runnable() { // from class: com.google.android.gms.internal.ads.mA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairQ;
                    this.f76748a.f77957b.f79444h.z(((Integer) pair.first).intValue(), (C7453aF0) pair.second, qe0, we0, iOException, z10);
                }
            });
        }
    }
}
