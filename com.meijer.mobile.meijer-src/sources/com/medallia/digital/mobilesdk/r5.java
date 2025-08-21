package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class r5 extends y5<String> {

    /* renamed from: k, reason: collision with root package name */
    private static final String f93719k = "Android";

    protected r5(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        return f93719k;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93774f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > Os name: %s", strS));
        return strS;
    }
}
