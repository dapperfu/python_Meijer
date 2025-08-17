package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<LDValue> f91025a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f91026b = false;

    public LDValue b() {
        this.f91026b = true;
        return LDValueArray.C(this.f91025a);
    }

    public a a(LDValue lDValue) {
        if (this.f91026b) {
            this.f91025a = new ArrayList(this.f91025a);
            this.f91026b = false;
        }
        List<LDValue> list = this.f91025a;
        if (lDValue == null) {
            lDValue = LDValue.u();
        }
        list.add(lDValue);
        return this;
    }
}
