package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
public class c7 extends z1<Integer> {
    protected c7(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Integer num) {
        super.a((c7) num);
        a4.b(String.format(Locale.US, "Collectors > SessionPercentageSampledEventsCollector : %d", num));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93768W;
    }
}
