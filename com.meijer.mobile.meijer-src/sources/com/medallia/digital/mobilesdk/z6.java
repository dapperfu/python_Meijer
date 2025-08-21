package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.security.SecureRandom;

/* loaded from: classes8.dex */
class z6 extends y5<Object> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f94503l = 100;

    /* renamed from: m, reason: collision with root package name */
    private static final int f94504m = 10000;

    /* renamed from: n, reason: collision with root package name */
    private static final double f94505n = 100.0d;

    /* renamed from: k, reason: collision with root package name */
    private a f94506k;

    enum a {
        INTEGER,
        DOUBLE
    }

    protected z6(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private Object r() {
        return this.f94506k == a.DOUBLE ? Double.valueOf(r0.nextInt(f94504m) / f94505n) : Integer.valueOf(new SecureRandom().nextInt(100));
    }

    public void a(a aVar) {
        this.f94506k = aVar;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93787s;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    protected Object j() {
        Object objR = r();
        a4.b("SessionCalculatedPercentageCollector value: " + objR);
        return objR;
    }
}
