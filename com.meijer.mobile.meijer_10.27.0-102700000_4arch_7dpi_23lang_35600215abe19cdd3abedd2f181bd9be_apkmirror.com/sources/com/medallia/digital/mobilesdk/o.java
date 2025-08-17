package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class o extends y5<String> {
    protected o(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        ApplicationInfo applicationInfoA = this.f93625g.a();
        if (applicationInfoA != null) {
            return applicationInfoA.packageName;
        }
        a4.c("ApplicationInfo is null");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92945p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > App id : %s", strS));
        return strS;
    }
}
