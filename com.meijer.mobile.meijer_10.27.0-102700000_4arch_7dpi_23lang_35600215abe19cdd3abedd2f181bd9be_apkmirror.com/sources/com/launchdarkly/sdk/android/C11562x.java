package com.launchdarkly.sdk.android;

import com.google.maps.internal.HttpHeaders;
import com.launchdarkly.sdk.LDValue;
import com.medallia.digital.mobilesdk.q2;
import java.util.HashMap;
import kh.AbstractC15158l;
import mh.C15622c;
import mh.C15629j;
import mh.InterfaceC15626g;

/* renamed from: com.launchdarkly.sdk.android.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11562x extends AbstractC15158l implements InterfaceC15626g {
    C11562x() {
    }

    @Override // mh.InterfaceC15626g
    public LDValue a(C15622c c15622c) {
        return LDValue.c().b("connectTimeoutMillis", this.f141944a).f("useReport", this.f141945b).a();
    }

    @Override // mh.InterfaceC15623d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C15629j b(C15622c c15622c) {
        c15622c.a();
        HashMap map = new HashMap();
        map.put("Authorization", "api_key " + c15622c.h());
        map.put(HttpHeaders.USER_AGENT, "AndroidClient/5.9.1");
        String strA = i0.a(c15622c.e().a(), c15622c.a());
        if (!strA.isEmpty()) {
            map.put("X-LaunchDarkly-Tags", strA);
        }
        String str = this.f141946c;
        if (str != null) {
            if (this.f141947d != null) {
                str = this.f141946c + q2.f92724c + this.f141947d;
            }
            map.put("X-LaunchDarkly-Wrapper", str);
        }
        return new C15629j(this.f141944a, map, null, this.f141945b);
    }
}
