package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class p extends y5<String> {
    protected p(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        ApplicationInfo applicationInfoA = this.f94464g.a();
        if (applicationInfoA == null) {
            a4.c("Context is null");
            return null;
        }
        int i10 = applicationInfoA.labelRes;
        if (i10 != 0) {
            return i4.c().b().getString(i10);
        }
        CharSequence charSequence = applicationInfoA.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93783o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > App name : %s", strS));
        return strS;
    }
}
