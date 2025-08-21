package com.medallia.digital.mobilesdk;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class v extends y5<String> {
    protected v(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        try {
            PackageManager packageManagerI = this.f94464g.i();
            PackageInfo packageInfo = packageManagerI != null ? packageManagerI.getPackageInfo(i4.c().b().getPackageName(), 0) : null;
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            a4.c(e10.getMessage());
        }
        a4.c("Context is null");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93785q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > App version : %s", strS));
        return strS;
    }
}
