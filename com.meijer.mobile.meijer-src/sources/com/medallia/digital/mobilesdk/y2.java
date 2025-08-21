package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class y2 extends z1<Boolean> {
    protected y2(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((y2) bool);
        a4.b(String.format(Locale.US, "Collectors > Intercept Enabled : %s", bool));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93754I;
    }
}
