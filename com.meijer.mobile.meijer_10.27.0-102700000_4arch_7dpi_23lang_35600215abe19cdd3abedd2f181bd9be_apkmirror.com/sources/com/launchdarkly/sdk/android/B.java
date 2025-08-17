package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.ConnectionInformation;
import kh.AbstractC15167u;
import mh.C15622c;
import mh.InterfaceC15624e;
import mh.InterfaceC15626g;

/* loaded from: classes7.dex */
final class B extends AbstractC15167u implements InterfaceC15626g, InterfaceC11559u {
    B() {
    }

    @Override // mh.InterfaceC15626g
    public LDValue a(C15622c c15622c) {
        return LDValue.c().f("streamingDisabled", false).b("backgroundPollingIntervalMillis", this.f141963a).b("reconnectTimeMillis", this.f141964b).a();
    }

    @Override // mh.InterfaceC15623d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC15624e b(C15622c c15622c) {
        if (c15622c.k() && !this.f141965c) {
            return AbstractC11558t.d().c(this.f141963a).d(this.f141963a).b(c15622c);
        }
        c15622c.c().c(ConnectionInformation.ConnectionMode.STREAMING, null);
        return new u0(c15622c, c15622c.f(), c15622c.c(), C11557s.p(c15622c).r(), this.f141964b, this.f141965c);
    }
}
