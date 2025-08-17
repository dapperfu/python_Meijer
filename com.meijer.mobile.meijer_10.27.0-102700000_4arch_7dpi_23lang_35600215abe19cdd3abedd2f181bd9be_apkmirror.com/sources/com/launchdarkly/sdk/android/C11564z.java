package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.ConnectionInformation;
import kh.AbstractC15164r;
import mh.C15622c;
import mh.InterfaceC15624e;
import mh.InterfaceC15626g;

/* renamed from: com.launchdarkly.sdk.android.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11564z extends AbstractC15164r implements InterfaceC15626g, InterfaceC11559u {
    @Override // mh.InterfaceC15623d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC15624e b(C15622c c15622c) {
        C11557s c11557sP = C11557s.p(c15622c);
        c11557sP.c().c(c11557sP.k() ? ConnectionInformation.ConnectionMode.BACKGROUND_POLLING : ConnectionInformation.ConnectionMode.POLLING, null);
        int i10 = c11557sP.k() ? this.f141955a : this.f141956b;
        Long lD = c11557sP.s().d(i0.k(c11557sP.f()), i0.i(c11557sP.f()));
        long j10 = 0;
        if (lD == null) {
            lD = 0L;
        }
        long j11 = i10;
        long jMax = Math.max(j11 - (System.currentTimeMillis() - lD.longValue()), 0L);
        if (!this.f141957c) {
            j10 = Long.MAX_VALUE;
        } else if (jMax > 0) {
            c15622c.a().i("One shot polling attempt will be blocked by rate limiting.");
        } else {
            j10 = 1;
        }
        return new p0(c11557sP.f(), c11557sP.c(), jMax, j11, j10, c11557sP.r(), c11557sP.t(), c11557sP.u(), c15622c.a());
    }

    C11564z() {
    }

    @Override // mh.InterfaceC15626g
    public LDValue a(C15622c c15622c) {
        return LDValue.c().f("streamingDisabled", true).b("backgroundPollingIntervalMillis", this.f141955a).b("pollingIntervalMillis", this.f141956b).a();
    }
}
