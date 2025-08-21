package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.ConnectionInformation;
import lh.AbstractC15508r;
import nh.C15945c;
import nh.InterfaceC15947e;
import nh.InterfaceC15949g;

/* renamed from: com.launchdarkly.sdk.android.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11689z extends AbstractC15508r implements InterfaceC15949g, InterfaceC11684u {
    @Override // nh.InterfaceC15946d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC15947e a(C15945c c15945c) {
        C11682s c11682sP = C11682s.p(c15945c);
        c11682sP.c().c(c11682sP.k() ? ConnectionInformation.ConnectionMode.BACKGROUND_POLLING : ConnectionInformation.ConnectionMode.POLLING, null);
        int i10 = c11682sP.k() ? this.f149638a : this.f149639b;
        Long lD = c11682sP.s().d(i0.k(c11682sP.f()), i0.i(c11682sP.f()));
        long j10 = 0;
        if (lD == null) {
            lD = 0L;
        }
        long j11 = i10;
        long jMax = Math.max(j11 - (System.currentTimeMillis() - lD.longValue()), 0L);
        if (!this.f149640c) {
            j10 = Long.MAX_VALUE;
        } else if (jMax > 0) {
            c15945c.a().i("One shot polling attempt will be blocked by rate limiting.");
        } else {
            j10 = 1;
        }
        return new p0(c11682sP.f(), c11682sP.c(), jMax, j11, j10, c11682sP.r(), c11682sP.t(), c11682sP.u(), c15945c.a());
    }

    C11689z() {
    }

    @Override // nh.InterfaceC15949g
    public LDValue b(C15945c c15945c) {
        return LDValue.c().f("streamingDisabled", true).b("backgroundPollingIntervalMillis", this.f149638a).b("pollingIntervalMillis", this.f149639b).a();
    }
}
