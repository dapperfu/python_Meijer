package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.security.SecureRandom;

/* loaded from: classes7.dex */
class z6 extends y5<Object> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f93664l = 100;

    /* renamed from: m, reason: collision with root package name */
    private static final int f93665m = 10000;

    /* renamed from: n, reason: collision with root package name */
    private static final double f93666n = 100.0d;

    /* renamed from: k, reason: collision with root package name */
    private a f93667k;

    enum a {
        INTEGER,
        DOUBLE
    }

    protected z6(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private Object r() {
        return this.f93667k == a.DOUBLE ? Double.valueOf(r0.nextInt(f93665m) / f93666n) : Integer.valueOf(new SecureRandom().nextInt(100));
    }

    public void a(a aVar) {
        this.f93667k = aVar;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92948s;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    protected Object j() {
        Object objR = r();
        a4.b("SessionCalculatedPercentageCollector value: " + objR);
        return objR;
    }
}
