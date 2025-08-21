package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.ConnectionInformation;
import lh.AbstractC15511u;
import nh.C15945c;
import nh.InterfaceC15947e;
import nh.InterfaceC15949g;

/* loaded from: classes8.dex */
final class B extends AbstractC15511u implements InterfaceC15949g, InterfaceC11684u {
    B() {
    }

    @Override // nh.InterfaceC15949g
    public LDValue b(C15945c c15945c) {
        return LDValue.c().f("streamingDisabled", false).b("backgroundPollingIntervalMillis", this.f149646a).b("reconnectTimeMillis", this.f149647b).a();
    }

    @Override // nh.InterfaceC15946d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC15947e a(C15945c c15945c) {
        if (c15945c.k() && !this.f149648c) {
            return AbstractC11683t.d().c(this.f149646a).d(this.f149646a).a(c15945c);
        }
        c15945c.c().c(ConnectionInformation.ConnectionMode.STREAMING, null);
        return new u0(c15945c, c15945c.f(), c15945c.c(), C11682s.p(c15945c).r(), this.f149647b, this.f149648c);
    }
}
