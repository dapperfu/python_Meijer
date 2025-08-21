package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.m0;
import jh.C15034c;
import kh.InterfaceC15130e;
import nh.C15945c;
import nh.InterfaceC15948f;
import ph.C16431h;

/* renamed from: com.launchdarkly.sdk.android.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11682s extends C15945c {

    /* renamed from: n, reason: collision with root package name */
    private final C16431h f92098n;

    /* renamed from: o, reason: collision with root package name */
    private final M f92099o;

    /* renamed from: p, reason: collision with root package name */
    private final n0 f92100p;

    /* renamed from: q, reason: collision with root package name */
    private final v0 f92101q;

    /* renamed from: r, reason: collision with root package name */
    private final m0.a f92102r;

    static C11682s o(c0 c0Var, String str, String str2, m0.a aVar, M m10, LDContext lDContext, C15034c c15034c, n0 n0Var, InterfaceC15130e interfaceC15130e, v0 v0Var) {
        boolean z10 = (n0Var == null || n0Var.x3()) ? false : true;
        C15945c c15945c = new C15945c(str, interfaceC15130e, c15034c, c0Var, null, str2, c0Var.j(), lDContext, c0Var.f92003h.a(new C15945c(str, interfaceC15130e, c15034c, c0Var, null, str2, c0Var.j(), lDContext, null, z10, null, c0Var.f91997b, c0Var.l())), z10, null, c0Var.f91997b, c0Var.l());
        return new C11682s(c15945c, !c0Var.a() ? new C16431h(L.a(c15945c)) : null, m10, n0Var, v0Var, aVar);
    }

    public static C11682s p(C15945c c15945c) {
        return c15945c instanceof C11682s ? (C11682s) c15945c : new C11682s(c15945c, null, null, null, null, null);
    }

    private static <T> T w(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Attempted to use an SDK component without the necessary dependencies from LDClient;  this should never happen unless an application has tried to construct the component directly outside of normal SDK usage");
    }

    public C16431h q() {
        return this.f92098n;
    }

    public M r() {
        return this.f92099o;
    }

    public m0.a s() {
        return (m0.a) w(this.f92102r);
    }

    public n0 t() {
        return (n0) w(this.f92100p);
    }

    public v0 u() {
        return (v0) w(this.f92101q);
    }

    public C11682s v(LDContext lDContext) {
        return new C11682s(super.m(lDContext), this.f92098n, this.f92099o, this.f92100p, this.f92101q, this.f92102r);
    }

    C11682s(C15945c c15945c, C16431h c16431h, M m10, n0 n0Var, v0 v0Var, m0.a aVar) {
        super(c15945c);
        this.f92098n = c16431h;
        this.f92099o = m10;
        this.f92100p = n0Var;
        this.f92101q = v0Var;
        this.f92102r = aVar;
    }

    public static C11682s n(C15945c c15945c, InterfaceC15948f interfaceC15948f, LDContext lDContext, boolean z10, Boolean bool) {
        C11682s c11682sP = p(c15945c);
        return new C11682s(new C15945c(c15945c.h(), c15945c.e(), c15945c.a(), c15945c.b(), interfaceC15948f, c15945c.d(), c15945c.j(), lDContext, c15945c.g(), z10, bool, c15945c.i(), false), c11682sP.q(), c11682sP.r(), c11682sP.t(), c11682sP.u(), c11682sP.s());
    }
}
