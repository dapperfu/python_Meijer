package com.launchdarkly.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private volatile Map<String, LDValue> f91338a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f91339b = false;

    public LDValue a() {
        this.f91339b = true;
        return LDValueObject.C(this.f91338a);
    }

    public j d(String str, LDValue lDValue) {
        if (this.f91339b) {
            this.f91338a = new HashMap(this.f91338a);
            this.f91339b = false;
        }
        Map<String, LDValue> map = this.f91338a;
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
