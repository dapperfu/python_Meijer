package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class w8 extends z1<String> {
    protected w8(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93749D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(String str) {
        super.a((w8) str);
        a4.b(String.format(Locale.US, "Collectors > set username: %s", str));
    }
}
