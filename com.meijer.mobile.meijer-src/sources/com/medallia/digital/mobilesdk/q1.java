package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class q1 extends y5<String> {
    protected q1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        return Build.MANUFACTURER;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93773e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > Device vendor : %s", strS));
        return strS;
    }
}
