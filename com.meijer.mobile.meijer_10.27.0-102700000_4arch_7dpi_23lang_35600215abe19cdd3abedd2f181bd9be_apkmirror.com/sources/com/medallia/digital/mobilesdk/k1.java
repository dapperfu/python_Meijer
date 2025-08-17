package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class k1 extends y5<String> {
    protected k1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private double s() {
        ActivityManager.MemoryInfo memoryInfoH = this.f93625g.h();
        if (memoryInfoH == null) {
            a4.c("MemoryInfo is null");
            return 0.0d;
        }
        long j10 = memoryInfoH.availMem;
        if (j10 == 0) {
            return 0.0d;
        }
        return j10;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92930a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strB = m1.b(s());
        a4.b(String.format(Locale.US, "Collectors > Device free memory: %s", strB));
        return strB;
    }
}
