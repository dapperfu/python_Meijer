package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
public class z7 extends w1<Long> implements LifeCycle.h {

    /* renamed from: g, reason: collision with root package name */
    private Long f94510g;

    protected z7(n0 n0Var) {
        super(n0Var);
        this.f94510g = Long.valueOf(System.currentTimeMillis());
        a4.b("timeInCurrentForeground field set: " + this.f94510g);
    }

    private Long p() {
        if (this.f94510g == null || !h()) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f94510g.longValue());
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public /* bridge */ /* synthetic */ void a(o0 o0Var) {
        super.a(o0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93764S;
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

    protected c0 o() {
        return new c0(f() != null ? f().toString() : com.google.maps.android.BuildConfig.TRAVIS, GroupType.collector, d(), g(), e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        this.f94510g = null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        this.f94510g = Long.valueOf(System.currentTimeMillis());
        a4.b("TimeInCurrentForeground value set: " + this.f94510g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long f() {
        Long lP = p();
        a4.b(String.format(Locale.US, "Collectors > TimeInCurrentForeground : %d", lP));
        a((z7) lP);
        return lP;
    }
}
