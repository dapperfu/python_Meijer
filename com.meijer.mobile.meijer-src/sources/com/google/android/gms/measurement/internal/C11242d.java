package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C10635r3;
import com.google.android.gms.internal.measurement.T6;
import com.google.maps.android.BuildConfig;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11242d extends AbstractC11234c {

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.H1 f86234g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C11250e f86235h;

    @Override // com.google.android.gms.measurement.internal.AbstractC11234c
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11234c
    final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11234c
    final int a() {
        return this.f86234g.F();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11242d(C11250e c11250e, String str, int i10, com.google.android.gms.internal.measurement.H1 h12) {
        super(str, i10);
        Objects.requireNonNull(c11250e);
        this.f86235h = c11250e;
        this.f86234g = h12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, C10635r3 c10635r3, boolean z10) {
        Object[] objArr;
        Object obj;
        T6.a();
        X2 x22 = this.f86235h.f85708a;
        boolean zF = x22.u().F(this.f86208a, C11245d2.f86247E0);
        com.google.android.gms.internal.measurement.H1 h12 = this.f86234g;
        boolean zI = h12.I();
        boolean zJ = h12.J();
        boolean zL = h12.L();
        if (zI || zJ || zL) {
            objArr = true;
        } else {
            objArr = false;
        }
        Boolean boolE = null;
        Integer numValueOf = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && objArr == false) {
            C11329o2 c11329o2U = x22.a().u();
            Integer numValueOf2 = Integer.valueOf(this.f86209b);
            if (h12.E()) {
                numValueOf = Integer.valueOf(h12.F());
            }
            c11329o2U.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", numValueOf2, numValueOf);
            return true;
        }
        com.google.android.gms.internal.measurement.B1 b1H = h12.H();
        boolean zJ2 = b1H.J();
        if (c10635r3.J()) {
            if (!b1H.G()) {
                x22.a().p().b("No number filter for long property. property", x22.B().c(c10635r3.G()));
            } else {
                boolE = AbstractC11234c.e(AbstractC11234c.g(c10635r3.K(), b1H.H()), zJ2);
            }
        } else if (c10635r3.N()) {
            if (!b1H.G()) {
                x22.a().p().b("No number filter for double property. property", x22.B().c(c10635r3.G()));
            } else {
                boolE = AbstractC11234c.e(AbstractC11234c.h(c10635r3.O(), b1H.H()), zJ2);
            }
        } else if (c10635r3.H()) {
            if (!b1H.E()) {
                if (!b1H.G()) {
                    x22.a().p().b("No string or number filter defined. property", x22.B().c(c10635r3.G()));
                } else if (u6.M(c10635r3.I())) {
                    boolE = AbstractC11234c.e(AbstractC11234c.i(c10635r3.I(), b1H.H()), zJ2);
                } else {
                    x22.a().p().c("Invalid user property value for Numeric number filter. property, value", x22.B().c(c10635r3.G()), c10635r3.I());
                }
            } else {
                boolE = AbstractC11234c.e(AbstractC11234c.f(c10635r3.I(), b1H.F(), x22.a()), zJ2);
            }
        } else {
            x22.a().p().b("User property has no value, property", x22.B().c(c10635r3.G()));
        }
        C11329o2 c11329o2U2 = x22.a().u();
        if (boolE == null) {
            obj = BuildConfig.TRAVIS;
        } else {
            obj = boolE;
        }
        c11329o2U2.b("Property filter result", obj);
        if (boolE == null) {
            return false;
        }
        this.f86210c = Boolean.TRUE;
        if (zL && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || h12.I()) {
            this.f86211d = boolE;
        }
        if (boolE.booleanValue() && objArr != false && c10635r3.E()) {
            long jF = c10635r3.F();
            if (l10 != null) {
                jF = l10.longValue();
            }
            if (zF && h12.I() && !h12.J() && l11 != null) {
                jF = l11.longValue();
            }
            if (h12.J()) {
                this.f86213f = Long.valueOf(jF);
            } else {
                this.f86212e = Long.valueOf(jF);
            }
        }
        return true;
    }
}
