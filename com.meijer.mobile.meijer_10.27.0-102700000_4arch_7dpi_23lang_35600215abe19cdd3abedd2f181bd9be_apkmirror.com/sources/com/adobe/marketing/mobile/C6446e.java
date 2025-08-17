package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.assurance.internal.AssuranceExtension;
import java.util.HashMap;

/* renamed from: com.adobe.marketing.mobile.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6446e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends AbstractC6453l> f62473a = AssuranceExtension.class;

    public static String a() {
        return "3.0.7";
    }

    public static void b(String str) {
        if (str == null || !str.contains("adb_validation_sessionid")) {
            Q5.t.f("Assurance", "Assurance", String.format("Not a valid Assurance deeplink, Ignorning start session API call. URL : %s", str), new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("startSessionURL", str);
        B.e(new C6449h.b("Assurance Start Session", "com.adobe.eventType.assurance", "com.adobe.eventSource.requestContent").d(map).a());
    }
}
