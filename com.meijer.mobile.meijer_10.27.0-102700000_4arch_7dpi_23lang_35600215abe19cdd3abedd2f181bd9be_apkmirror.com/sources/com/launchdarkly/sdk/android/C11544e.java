package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;

/* renamed from: com.launchdarkly.sdk.android.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11544e implements T {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f91205a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f91206b;

    @Override // com.launchdarkly.sdk.android.T
    public LDContext a(LDContext lDContext) {
        if (!this.f91206b) {
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

    public C11544e(m0 m0Var, boolean z10) {
        this.f91205a = m0Var;
        this.f91206b = z10;
    }

    private LDContext b(LDContext lDContext) {
        return LDContext.c(lDContext).d(this.f91205a.h(lDContext.o())).b();
    }
}
