package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class y7 extends w1<Long> implements LifeCycle.g {
    protected y7(n0 n0Var) {
        super(n0Var);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j10) {
        a((y7) Long.valueOf(j10));
        a4.b(String.format(Locale.US, "Collectors > Time in background was: %d", Long.valueOf(j10)));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93752G;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        try {
            LifeCycle.b().a(this);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            LifeCycle.b().b(this);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.w1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long j() {
        return f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long f() {
        if (super.f() == null) {
            return 0L;
        }
        return (Long) super.f();
    }

    protected void p() {
        a((y7) 0L);
    }
}
