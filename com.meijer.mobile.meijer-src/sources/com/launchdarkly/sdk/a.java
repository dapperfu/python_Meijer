package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<LDValue> f91864a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f91865b = false;

    public LDValue b() {
        this.f91865b = true;
        return LDValueArray.C(this.f91864a);
    }

    public a a(LDValue lDValue) {
        if (this.f91865b) {
            this.f91864a = new ArrayList(this.f91864a);
            this.f91865b = false;
        }
        List<LDValue> list = this.f91864a;
        if (lDValue == null) {
            lDValue = LDValue.u();
        }
        list.add(lDValue);
        return this;
    }
}
