package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class FE0 implements InterfaceC8626lF0, InterfaceC9905xD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f66765a;

    /* renamed from: b, reason: collision with root package name */
    private C8519kF0 f66766b;

    /* renamed from: c, reason: collision with root package name */
    private C9798wD0 f66767c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ HE0 f66768d;

    public FE0(HE0 he0, Object obj) {
        this.f66768d = he0;
        this.f66766b = he0.s(null);
        this.f66767c = he0.q(null);
        this.f66765a = obj;
    }

    private final boolean r(int i10, C7453aF0 c7453aF0) {
        C7453aF0 c7453aF0E;
        if (c7453aF0 != null) {
            c7453aF0E = this.f66768d.E(this.f66765a, c7453aF0);
            if (c7453aF0E == null) {
                return false;
            }
        } else {
            c7453aF0E = null;
        }
        this.f66768d.C(this.f66765a, 0);
        C8519kF0 c8519kF0 = this.f66766b;
        int i11 = c8519kF0.f75599a;
        if (!Objects.equals(c8519kF0.f75600b, c7453aF0E)) {
            this.f66766b = this.f66768d.t(0, c7453aF0E);
        }
        C9798wD0 c9798wD0 = this.f66767c;
        int i12 = c9798wD0.f79456a;
        if (Objects.equals(c9798wD0.f79457b, c7453aF0E)) {
            return true;
        }
        this.f66767c = this.f66768d.r(0, c7453aF0E);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void g(int i10, C7453aF0 c7453aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7453aF0)) {
            this.f66766b.e(qe0, q(we0, c7453aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void l(int i10, C7453aF0 c7453aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7453aF0)) {
            this.f66766b.h(qe0, q(we0, c7453aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void n(int i10, C7453aF0 c7453aF0, QE0 qe0, WE0 we0) {
        if (r(0, c7453aF0)) {
            this.f66766b.f(qe0, q(we0, c7453aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void p(int i10, C7453aF0 c7453aF0, WE0 we0) {
        if (r(0, c7453aF0)) {
            this.f66766b.d(q(we0, c7453aF0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8626lF0
    public final void z(int i10, C7453aF0 c7453aF0, QE0 qe0, WE0 we0, IOException iOException, boolean z10) {
        if (r(0, c7453aF0)) {
            this.f66766b.g(qe0, q(we0, c7453aF0), iOException, z10);
        }
    }

    private final WE0 q(WE0 we0, C7453aF0 c7453aF0) {
        HE0 he0 = this.f66768d;
        Object obj = this.f66765a;
        long j10 = we0.f71042c;
        he0.D(obj, j10, c7453aF0);
        HE0 he02 = this.f66768d;
        Object obj2 = this.f66765a;
        long j11 = we0.f71043d;
        he02.D(obj2, j11, c7453aF0);
        return (j10 == we0.f71042c && j11 == we0.f71043d) ? we0 : new WE0(1, we0.f71040a, we0.f71041b, 0, null, j10, j11);
    }
}
