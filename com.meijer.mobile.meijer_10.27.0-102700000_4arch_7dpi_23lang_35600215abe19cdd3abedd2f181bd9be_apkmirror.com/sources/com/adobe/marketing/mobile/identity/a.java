package com.adobe.marketing.mobile.identity;

import com.adobe.marketing.mobile.D;
import f6.C13845a;
import java.util.Map;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f62502a;

    /* renamed from: b, reason: collision with root package name */
    private final D f62503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62504c;

    boolean a() {
        return (f6.i.a(this.f62502a) || this.f62503b == D.OPT_OUT) ? false : true;
    }

    String b() {
        return this.f62504c;
    }

    String c() {
        return this.f62502a;
    }

    D d() {
        return this.f62503b;
    }

    a(Map<String, Object> map) {
        this.f62502a = C13845a.o(map, "experienceCloud.org", null);
        String strO = C13845a.o(map, "experienceCloud.server", "dpm.demdex.net");
        this.f62504c = f6.i.a(strO) ? "dpm.demdex.net" : strO;
        this.f62503b = D.b(C13845a.o(map, "global.privacy", b.f62505a.e()));
    }
}
