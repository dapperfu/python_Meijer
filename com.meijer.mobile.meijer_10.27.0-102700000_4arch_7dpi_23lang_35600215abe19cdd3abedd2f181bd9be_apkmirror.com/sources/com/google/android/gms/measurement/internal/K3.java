package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes6.dex */
final class K3 implements com.google.common.util.concurrent.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S5 f85087a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85088b;

    K3(C11268x4 c11268x4, S5 s52) {
        this.f85087a = s52;
        Objects.requireNonNull(c11268x4);
        this.f85088b = c11268x4;
    }

    private final void a() {
        X2 x22 = this.f85088b.f84868a;
        SparseArray sparseArrayP = x22.v().p();
        S5 s52 = this.f85087a;
        sparseArrayP.put(s52.f85221c, Long.valueOf(s52.f85220b));
        E2 e2V = x22.v();
        int[] iArr = new int[sparseArrayP.size()];
        long[] jArr = new long[sparseArrayP.size()];
        for (int i10 = 0; i10 < sparseArrayP.size(); i10++) {
            iArr[i10] = sparseArrayP.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayP.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        e2V.f84983o.b(bundle);
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        C11268x4 c11268x4 = this.f85088b;
        c11268x4.f();
        c11268x4.X(false);
        X2 x22 = c11268x4.f84868a;
        int iB0 = (x22.u().F(null, C11120d2.f85439U0) ? c11268x4.b0(th2) : 2) - 1;
        if (iB0 == 0) {
            x22.a().p().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C11218q2.v(c11268x4.f84868a.J().o()), C11218q2.v(th2.toString()));
            c11268x4.Z(1);
            c11268x4.u0().add(this.f85087a);
            return;
        }
        if (iB0 != 1) {
            x22.a().m().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C11218q2.v(c11268x4.f84868a.J().o()), th2);
            a();
            c11268x4.Z(1);
            c11268x4.v0();
            return;
        }
        c11268x4.u0().add(this.f85087a);
        if (c11268x4.Y() > ((Integer) C11120d2.f85509x0.b(null)).intValue()) {
            c11268x4.Z(1);
            x22.a().p().c("registerTriggerAsync failed. May try later. App ID, throwable", C11218q2.v(c11268x4.f84868a.J().o()), C11218q2.v(th2.toString()));
        } else {
            x22.a().p().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C11218q2.v(c11268x4.f84868a.J().o()), C11218q2.v(String.valueOf(c11268x4.Y())), C11218q2.v(th2.toString()));
            c11268x4.T(c11268x4.Y());
            int iY = c11268x4.Y();
            c11268x4.Z(iY + iY);
        }
    }

    @Override // com.google.common.util.concurrent.j
    public final void onSuccess(Object obj) {
        C11268x4 c11268x4 = this.f85088b;
        c11268x4.f();
        a();
        c11268x4.X(false);
        c11268x4.Z(1);
        c11268x4.f84868a.a().t().b("Successfully registered trigger URI", this.f85087a.f85219a);
        c11268x4.v0();
    }
}
