package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class q8 extends z1<String> {
    protected q8(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93748C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(String str) {
        super.a((q8) str);
        a4.b(String.format(Locale.US, "Collectors > set user email: %s", str));
    }
}
