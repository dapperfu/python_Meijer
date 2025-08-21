package com.launchdarkly.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private volatile Map<String, LDValue> f92177a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f92178b = false;

    public LDValue a() {
        this.f92178b = true;
        return LDValueObject.C(this.f92177a);
    }

    public j d(String str, LDValue lDValue) {
        if (this.f92178b) {
            this.f92177a = new HashMap(this.f92177a);
            this.f92178b = false;
        }
        Map<String, LDValue> map = this.f92177a;
        if (lDValue == null) {
            lDValue = LDValue.u();
        }
        map.put(str, lDValue);
        return this;
    }

    public j b(String str, int i10) {
        return d(str, LDValue.q(i10));
    }

    public j c(String str, long j10) {
        return d(str, LDValue.r(j10));
    }

    public j e(String str, String str2) {
        return d(str, LDValue.s(str2));
    }

    public j f(String str, boolean z10) {
        return d(str, LDValue.t(z10));
    }
}
