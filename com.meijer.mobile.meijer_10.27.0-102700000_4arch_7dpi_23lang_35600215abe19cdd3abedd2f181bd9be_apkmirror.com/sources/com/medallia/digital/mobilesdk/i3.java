package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
public class i3 extends z1<Boolean> {
    protected i3(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    public void a(Boolean bool) {
        super.a((i3) bool);
        a4.b(String.format(Locale.US, "Collectors > IsSessionSampledEventsCollector : %s", bool.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92928V;
    }
}
