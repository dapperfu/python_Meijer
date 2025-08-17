package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private List<LDContext> f91303a;

    public e a(LDContext lDContext) {
        if (lDContext != null) {
            if (this.f91303a == null) {
                this.f91303a = new ArrayList();
            }
            if (lDContext.v()) {
                for (LDContext lDContext2 : lDContext.multiContexts) {
                    this.f91303a.add(lDContext2);
                }
            } else {
                this.f91303a.add(lDContext);
            }
        }
        return this;
    }

    public LDContext b() {
        List<LDContext> list = this.f91303a;
        if (list == null || list.size() == 0) {
            return LDContext.g("multi-kind context must contain at least one kind");
        }
        if (this.f91303a.size() == 1) {
            return this.f91303a.get(0);
        }
        List<LDContext> list2 = this.f91303a;
        return LDContext.d((LDContext[]) list2.toArray(new LDContext[list2.size()]));
    }

    e() {
    }
}
