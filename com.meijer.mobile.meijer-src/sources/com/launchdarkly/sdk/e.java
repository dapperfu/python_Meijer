package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private List<LDContext> f92142a;

    public e a(LDContext lDContext) {
        if (lDContext != null) {
            if (this.f92142a == null) {
                this.f92142a = new ArrayList();
            }
            if (lDContext.v()) {
                for (LDContext lDContext2 : lDContext.multiContexts) {
                    this.f92142a.add(lDContext2);
                }
            } else {
                this.f92142a.add(lDContext);
            }
        }
        return this;
    }

    public LDContext b() {
        List<LDContext> list = this.f92142a;
        if (list == null || list.size() == 0) {
            return LDContext.g("multi-kind context must contain at least one kind");
        }
        if (this.f92142a.size() == 1) {
            return this.f92142a.get(0);
        }
        List<LDContext> list2 = this.f92142a;
        return LDContext.d((LDContext[]) list2.toArray(new LDContext[list2.size()]));
    }

    e() {
    }
}
