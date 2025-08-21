package com.adobe.marketing.mobile.analytics.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    Object f62948a = null;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f62949b = new HashMap();

    boolean a(String str) {
        return this.f62949b.containsKey(str);
    }

    h b(String str) {
        return (h) this.f62949b.get(str);
    }

    void c(String str, h hVar) {
        this.f62949b.put(str, hVar);
    }

    h() {
    }
}
