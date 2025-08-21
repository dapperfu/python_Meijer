package com.adobe.marketing.mobile.identity;

import com.adobe.marketing.mobile.D;
import g6.C14328a;
import java.util.Map;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f63341a;

    /* renamed from: b, reason: collision with root package name */
    private final D f63342b;

    /* renamed from: c, reason: collision with root package name */
    private final String f63343c;

    boolean a() {
        return (g6.i.a(this.f63341a) || this.f63342b == D.OPT_OUT) ? false : true;
    }

    String b() {
        return this.f63343c;
    }

    String c() {
        return this.f63341a;
    }

    D d() {
        return this.f63342b;
    }

    a(Map<String, Object> map) {
        this.f63341a = C14328a.o(map, "experienceCloud.org", null);
        String strO = C14328a.o(map, "experienceCloud.server", "dpm.demdex.net");
        this.f63343c = g6.i.a(strO) ? "dpm.demdex.net" : strO;
        this.f63342b = D.b(C14328a.o(map, "global.privacy", b.f63344a.e()));
    }
}
