package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class x2 extends z1<Boolean> {
    protected x2(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((x2) bool);
        a4.b(String.format(Locale.US, "Collectors > Intercept Disabled : %s", bool));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92916J;
    }
}
