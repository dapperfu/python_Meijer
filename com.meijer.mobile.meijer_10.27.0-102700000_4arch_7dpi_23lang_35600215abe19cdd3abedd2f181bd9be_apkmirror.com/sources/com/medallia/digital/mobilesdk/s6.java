package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class s6 extends z1<MDSdkFrameworkType> {
    s6(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(MDSdkFrameworkType mDSdkFrameworkType) {
        super.a((s6) mDSdkFrameworkType);
        a4.b(String.format(Locale.US, "Collectors > set SDK Framework : %s", mDSdkFrameworkType.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92922P;
    }
}
