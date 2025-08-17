package com.medallia.digital.mobilesdk;

import android.telephony.TelephonyManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class m5 extends y5<String> {

    /* renamed from: k, reason: collision with root package name */
    private static final String f92547k = "UNKNOWN";

    protected m5(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String s() {
        TelephonyManager telephonyManagerK = this.f93625g.k();
        if (telephonyManagerK != null) {
            return telephonyManagerK.getNetworkOperatorName() == null ? f92547k : telephonyManagerK.getNetworkOperatorName();
        }
        a4.c("TelephonyManager memory is not available");
        return f92547k;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92937h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format(Locale.US, "Collectors > Network provider : %s", strS));
        return strS;
    }
}
