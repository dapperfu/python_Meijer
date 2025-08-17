package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C10358a3;
import com.google.android.gms.internal.measurement.C10367b3;
import com.google.android.gms.internal.measurement.C10385d3;
import com.google.android.gms.internal.measurement.C10502q3;
import com.google.android.gms.internal.measurement.C10510r3;
import com.google.android.gms.internal.measurement.C7;
import com.scandit.datacapture.core.source.CameraSettings;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11205o3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f85733a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85734b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85735c;

    CallableC11205o3(BinderC11281z3 binderC11281z3, G g10, String str) {
        this.f85733a = g10;
        this.f85734b = str;
        Objects.requireNonNull(binderC11281z3);
        this.f85735c = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C4 c42;
        byte[] bArr;
        q6 q6Var;
        x6 x6Var;
        q6 q6Var2;
        C11259w2 c11259w2;
        X2 x22;
        com.google.android.gms.internal.measurement.Z2 z22;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        com.google.android.gms.internal.measurement.V2 v22;
        C cA;
        long j10;
        byte[] bArr2;
        BinderC11281z3 binderC11281z3 = this.f85735c;
        binderC11281z3.A9().C();
        C4 c4H0 = binderC11281z3.A9().H0();
        c4H0.f();
        X2 x23 = c4H0.f84868a;
        X2.o();
        G g10 = this.f85733a;
        com.google.android.gms.common.internal.r.l(g10);
        String str2 = this.f85734b;
        com.google.android.gms.common.internal.r.f(str2);
        String str3 = g10.f85021a;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            c4H0.f84868a.a().t().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        q6 q6Var3 = c4H0.f85267b;
        com.google.android.gms.internal.measurement.V2 v2L = com.google.android.gms.internal.measurement.Y2.L();
        q6Var3.D0().p0();
        try {
            C11259w2 c11259w2H0 = q6Var3.D0().H0(str2);
            if (c11259w2H0 == null) {
                c4H0.f84868a.a().t().b("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (c11259w2H0.d()) {
                    com.google.android.gms.internal.measurement.Z2 z2J0 = C10358a3.j0();
                    z2J0.V(1);
                    z2J0.v("android");
                    if (!TextUtils.isEmpty(c11259w2H0.o0())) {
                        z2J0.F(c11259w2H0.o0());
                    }
                    if (!TextUtils.isEmpty(c11259w2H0.H0())) {
                        z2J0.D((String) com.google.android.gms.common.internal.r.l(c11259w2H0.H0()));
                    }
                    if (!TextUtils.isEmpty(c11259w2H0.D0())) {
                        z2J0.G((String) com.google.android.gms.common.internal.r.l(c11259w2H0.D0()));
                    }
                    if (c11259w2H0.F0() != -2147483648L) {
                        z2J0.y0((int) c11259w2H0.F0());
                    }
                    z2J0.H(c11259w2H0.J0());
                    z2J0.G0(c11259w2H0.b());
                    String strR0 = c11259w2H0.r0();
                    if (!TextUtils.isEmpty(strR0)) {
                        z2J0.s0(strR0);
                    }
                    z2J0.O0(c11259w2H0.X());
                    E3 e3E = c4H0.f85267b.e(str2);
                    z2J0.S(c11259w2H0.L0());
                    if (x23.e() && c4H0.f84868a.u().i(z2J0.E()) && e3E.o(Od.v.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        z2J0.B0(null);
                    }
                    z2J0.I0(e3E.k());
                    if (e3E.o(Od.v.AD_STORAGE) && c11259w2H0.P()) {
                        Pair pairK = q6Var3.J0().k(c11259w2H0.o0(), e3E);
                        if (c11259w2H0.P() && !TextUtils.isEmpty((CharSequence) pairK.first)) {
                            try {
                                z2J0.K(C4.k((String) pairK.first, Long.toString(g10.f85024d)));
                                Object obj2 = pairK.second;
                                if (obj2 != null) {
                                    z2J0.N(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                c4H0.f84868a.a().t().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                q6Var = c4H0.f85267b;
                                q6Var.D0().r0();
                                return bArr;
                            }
                        }
                    }
                    X2 x24 = c4H0.f84868a;
                    x24.I().j();
                    z2J0.y(Build.MODEL);
                    x24.I().j();
                    z2J0.x(Build.VERSION.RELEASE);
                    z2J0.C((int) x24.I().m());
                    z2J0.A(x24.I().n());
                    try {
                        if (e3E.o(Od.v.ANALYTICS_STORAGE) && c11259w2H0.p0() != null) {
                            z2J0.Q(C4.k((String) com.google.android.gms.common.internal.r.l(c11259w2H0.p0()), Long.toString(g10.f85024d)));
                        }
                        if (!TextUtils.isEmpty(c11259w2H0.x0())) {
                            z2J0.w0((String) com.google.android.gms.common.internal.r.l(c11259w2H0.x0()));
                        }
                        String strO0 = c11259w2H0.o0();
                        q6 q6Var4 = c4H0.f85267b;
                        List listA0 = q6Var4.D0().A0(strO0);
                        Iterator it = listA0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                x6Var = null;
                                break;
                            }
                            x6Var = (x6) it.next();
                            if ("_lte".equals(x6Var.f86032c)) {
                                break;
                            }
                        }
                        if (x6Var == null || x6Var.f86034e == null) {
                            x6 x6Var2 = new x6(strO0, CameraSettings.FOCUS_STRATEGY_AUTO, "_lte", c4H0.f84868a.zzaZ().a(), 0L);
                            listA0.add(x6Var2);
                            q6Var4.D0().y0(x6Var2);
                        }
                        C10510r3[] c10510r3Arr = new C10510r3[listA0.size()];
                        for (int i10 = 0; i10 < listA0.size(); i10++) {
                            C10502q3 c10502q3P = C10510r3.P();
                            c10502q3P.u(((x6) listA0.get(i10)).f86032c);
                            c10502q3P.t(((x6) listA0.get(i10)).f86033d);
                            q6Var4.I0().E(c10502q3P, ((x6) listA0.get(i10)).f86034e);
                            c10510r3Arr[i10] = (C10510r3) c10502q3P.q();
                        }
                        z2J0.j1(Arrays.asList(c10510r3Arr));
                        q6 q6Var5 = c4H0.f85267b;
                        q6Var5.l(c11259w2H0, z2J0);
                        q6Var5.m(c11259w2H0, z2J0);
                        C11224r2 c11224r2A = C11224r2.a(g10);
                        X2 x25 = c4H0.f84868a;
                        z6 z6VarA = x25.A();
                        Bundle bundle2 = c11224r2A.f85830d;
                        z6VarA.u(bundle2, q6Var4.D0().E(str2));
                        x25.A().s(c11224r2A, x25.u().u(str2));
                        bundle2.putLong("_c", 1L);
                        x25.a().t().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = g10.f85023c;
                        bundle2.putString("_o", str4);
                        if (x25.A().N(z2J0.E(), c11259w2H0.l0())) {
                            x25.A().y(bundle2, "_dbg", 1L);
                            x25.A().y(bundle2, "_r", 1L);
                        }
                        C11242u c11242uD0 = q6Var4.D0();
                        String str5 = g10.f85021a;
                        C cT0 = c11242uD0.t0(str2, str5);
                        if (cT0 == null) {
                            c11259w2 = c11259w2H0;
                            x22 = x25;
                            z22 = z2J0;
                            q6Var2 = q6Var5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            cA = new C(str2, str5, 0L, 0L, 0L, g10.f85024d, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            v22 = v2L;
                        } else {
                            q6Var2 = q6Var5;
                            c11259w2 = c11259w2H0;
                            x22 = x25;
                            z22 = z2J0;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            v22 = v2L;
                            long j11 = cT0.f84934f;
                            cA = cT0.a(g10.f85024d);
                            j10 = j11;
                        }
                        C c10 = cA;
                        q6Var4.D0().u0(c10);
                        X2 x26 = c4H0.f84868a;
                        long j12 = g10.f85024d;
                        boolean z11 = z10;
                        C11259w2 c11259w22 = c11259w2;
                        com.google.android.gms.internal.measurement.Z2 z23 = z22;
                        q6 q6Var6 = q6Var2;
                        try {
                            B b10 = new B(x26, str, str2, str5, j12, j10, bundle);
                            com.google.android.gms.internal.measurement.N2 n2O = com.google.android.gms.internal.measurement.O2.O();
                            n2O.I(b10.f84885d);
                            n2O.F(b10.f84883b);
                            n2O.K(b10.f84886e);
                            E e11 = b10.f84887f;
                            D d10 = new D(e11);
                            while (d10.hasNext()) {
                                String next = d10.next();
                                com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
                                r2Q.u(next);
                                Object objB = e11.B(next);
                                if (objB != null) {
                                    q6Var4.I0().F(r2Q, objB);
                                    n2O.z(r2Q);
                                }
                            }
                            z23.V0(n2O);
                            C10367b3 c10367b3E = C10385d3.E();
                            com.google.android.gms.internal.measurement.P2 p2E = com.google.android.gms.internal.measurement.Q2.E();
                            p2E.u(c10.f84931c);
                            p2E.t(str5);
                            c10367b3E.t(p2E);
                            z23.E0(c10367b3E);
                            z23.u0(q6Var4.G0().k(c11259w22.o0(), Collections.EMPTY_LIST, z23.a1(), Long.valueOf(n2O.H()), Long.valueOf(n2O.H()), false));
                            if (n2O.G()) {
                                z23.o1(n2O.H());
                                z23.q1(n2O.H());
                            }
                            long jB0 = c11259w22.B0();
                            if (jB0 != 0) {
                                z23.t(jB0);
                            }
                            long jZ0 = c11259w22.z0();
                            if (jZ0 != 0) {
                                z23.r1(jZ0);
                            } else if (jB0 != 0) {
                                z23.r1(jB0);
                            }
                            String strT0 = c11259w22.t0();
                            C7.a();
                            if (x22.u().F(str2, C11120d2.f85425N0) && strT0 != null) {
                                z23.J0(strT0);
                            }
                            c11259w22.l();
                            z23.U((int) c11259w22.g());
                            x22.u().y();
                            z23.I(133005L);
                            z23.l1(x22.zzaZ().a());
                            z23.t0(z11);
                            q6Var6.v(z23.E(), z23);
                            v22.x(z23);
                            c11259w22.A0(z23.n1());
                            c11259w22.C0(z23.p1());
                            q6Var4.D0().I0(c11259w22, false, false);
                            q6Var4.D0().q0();
                            q6Var4.D0().r0();
                            try {
                                return q6Var4.I0().T(((com.google.android.gms.internal.measurement.Y2) v22.q()).g());
                            } catch (IOException e12) {
                                c4H0.f84868a.a().m().c("Data loss. Failed to bundle and serialize. appId", C11218q2.v(str2), e12);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c42 = c4H0;
                            c42.f85267b.D0().r0();
                            throw th;
                        }
                    } catch (SecurityException e13) {
                        c42 = c4H0;
                        try {
                            c42.f84868a.a().t().b("app instance id encryption failed", e13.getMessage());
                            bArr = new byte[0];
                            q6Var = c42.f85267b;
                            q6Var.D0().r0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                            c42.f85267b.D0().r0();
                            throw th;
                        }
                    }
                }
                c4H0.f84868a.a().t().b("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            q6Var3.D0().r0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            c42 = c4H0;
            c42.f85267b.D0().r0();
            throw th;
        }
    }
}
