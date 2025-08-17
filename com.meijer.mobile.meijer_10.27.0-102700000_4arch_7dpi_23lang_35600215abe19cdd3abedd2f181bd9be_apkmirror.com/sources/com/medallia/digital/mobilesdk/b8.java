package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class b8 extends y5<String> {
    protected b8(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        try {
            return this.f93625g.b().getTimeZone().getDisplayName(false, 0);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92940k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > Timezone : %s", strS));
        return strS;
    }
}
