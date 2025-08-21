package com.launchdarkly.sdk.android;

import com.google.maps.internal.HttpHeaders;
import com.launchdarkly.sdk.LDValue;
import com.medallia.digital.mobilesdk.q2;
import java.util.HashMap;
import lh.AbstractC15502l;
import nh.C15945c;
import nh.C15952j;
import nh.InterfaceC15949g;

/* renamed from: com.launchdarkly.sdk.android.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11687x extends AbstractC15502l implements InterfaceC15949g {
    C11687x() {
    }

    @Override // nh.InterfaceC15949g
    public LDValue b(C15945c c15945c) {
        return LDValue.c().b("connectTimeoutMillis", this.f149627a).f("useReport", this.f149628b).a();
    }

    @Override // nh.InterfaceC15946d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C15952j a(C15945c c15945c) {
        c15945c.a();
        HashMap map = new HashMap();
        map.put("Authorization", "api_key " + c15945c.h());
        map.put(HttpHeaders.USER_AGENT, "AndroidClient/5.9.1");
        String strA = i0.a(c15945c.e().a(), c15945c.a());
        if (!strA.isEmpty()) {
            map.put("X-LaunchDarkly-Tags", strA);
        }
        String str = this.f149629c;
        if (str != null) {
            if (this.f149630d != null) {
                str = this.f149629c + q2.f93563c + this.f149630d;
            }
            map.put("X-LaunchDarkly-Wrapper", str);
        }
        return new C15952j(this.f149627a, map, null, this.f149628b);
    }
}
