package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;

/* renamed from: com.launchdarkly.sdk.android.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11669e implements T {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f92044a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f92045b;

    @Override // com.launchdarkly.sdk.android.T
    public LDContext a(LDContext lDContext) {
        if (!this.f92045b) {
            return lDContext;
        }
        if (!lDContext.v()) {
            return lDContext.u() ? b(lDContext) : lDContext;
        }
        for (int i10 = 0; i10 < lDContext.m(); i10++) {
            if (lDContext.k(i10).u()) {
                com.launchdarkly.sdk.e eVarX = LDContext.x();
                for (int i11 = 0; i11 < lDContext.m(); i11++) {
                    LDContext lDContextK = lDContext.k(i11);
                    if (lDContextK.u()) {
                        lDContextK = b(lDContextK);
                    }
                    eVarX.a(lDContextK);
                }
                return eVarX.b();
            }
        }
        return lDContext;
    }

    public C11669e(m0 m0Var, boolean z10) {
        this.f92044a = m0Var;
        this.f92045b = z10;
    }

    private LDContext b(LDContext lDContext) {
        return LDContext.c(lDContext).d(this.f92044a.h(lDContext.o())).b();
    }
}
