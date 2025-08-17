package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class p3 extends y5<String> {
    protected p3(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        o0 o0Var = this.f93625g;
        if (o0Var != null) {
            return o0Var.g().toString();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92939j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > Language : %s", strS));
        return strS;
    }
}
