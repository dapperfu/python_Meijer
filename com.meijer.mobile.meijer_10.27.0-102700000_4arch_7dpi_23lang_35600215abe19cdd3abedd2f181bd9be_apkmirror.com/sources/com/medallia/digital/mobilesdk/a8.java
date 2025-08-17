package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class a8 extends w1<Long> implements LifeCycle.h, LifeCycle.g {

    /* renamed from: g, reason: collision with root package name */
    private Long f91619g;

    protected a8(n0 n0Var) {
        super(n0Var);
        this.f91619g = Long.valueOf(System.currentTimeMillis());
    }

    private Long p() {
        if (this.f91619g == null || !h()) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f91619g.longValue());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j10) {
        this.f91619g = Long.valueOf(this.f91619g.longValue() + j10);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92914H;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        try {
            LifeCycle.b().a((LifeCycle.g) this);
            LifeCycle.b().a((LifeCycle.h) this);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            LifeCycle.b().b((LifeCycle.g) this);
            LifeCycle.b().b((LifeCycle.h) this);
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

    protected c0 o() {
        return new c0(f().toString(), GroupType.collector, d(), g(), e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        a((a8) f());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long f() {
        Long lP = p();
        a4.b(String.format(Locale.US, "Collectors > Time in foreground: %d", lP));
        return lP;
    }

    protected void r() {
        this.f91619g = Long.valueOf(System.currentTimeMillis());
    }
}
