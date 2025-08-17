package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.m0;
import ih.C14724c;
import jh.InterfaceC14896e;
import mh.C15622c;
import mh.InterfaceC15625f;
import oh.C16066h;

/* renamed from: com.launchdarkly.sdk.android.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11557s extends C15622c {

    /* renamed from: n, reason: collision with root package name */
    private final C16066h f91259n;

    /* renamed from: o, reason: collision with root package name */
    private final M f91260o;

    /* renamed from: p, reason: collision with root package name */
    private final n0 f91261p;

    /* renamed from: q, reason: collision with root package name */
    private final v0 f91262q;

    /* renamed from: r, reason: collision with root package name */
    private final m0.a f91263r;

    static C11557s o(c0 c0Var, String str, String str2, m0.a aVar, M m10, LDContext lDContext, C14724c c14724c, n0 n0Var, InterfaceC14896e interfaceC14896e, v0 v0Var) {
        boolean z10 = (n0Var == null || n0Var.x3()) ? false : true;
        C15622c c15622c = new C15622c(str, interfaceC14896e, c14724c, c0Var, null, str2, c0Var.j(), lDContext, c0Var.f91164h.b(new C15622c(str, interfaceC14896e, c14724c, c0Var, null, str2, c0Var.j(), lDContext, null, z10, null, c0Var.f91158b, c0Var.l())), z10, null, c0Var.f91158b, c0Var.l());
        return new C11557s(c15622c, !c0Var.a() ? new C16066h(L.a(c15622c)) : null, m10, n0Var, v0Var, aVar);
    }

    public static C11557s p(C15622c c15622c) {
        return c15622c instanceof C11557s ? (C11557s) c15622c : new C11557s(c15622c, null, null, null, null, null);
    }

    private static <T> T w(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Attempted to use an SDK component without the necessary dependencies from LDClient;  this should never happen unless an application has tried to construct the component directly outside of normal SDK usage");
    }

    public C16066h q() {
        return this.f91259n;
    }

    public M r() {
        return this.f91260o;
    }

    public m0.a s() {
        return (m0.a) w(this.f91263r);
    }

    public n0 t() {
        return (n0) w(this.f91261p);
    }

    public v0 u() {
        return (v0) w(this.f91262q);
    }

    public C11557s v(LDContext lDContext) {
        return new C11557s(super.m(lDContext), this.f91259n, this.f91260o, this.f91261p, this.f91262q, this.f91263r);
    }

    C11557s(C15622c c15622c, C16066h c16066h, M m10, n0 n0Var, v0 v0Var, m0.a aVar) {
        super(c15622c);
        this.f91259n = c16066h;
        this.f91260o = m10;
        this.f91261p = n0Var;
        this.f91262q = v0Var;
        this.f91263r = aVar;
    }

    public static C11557s n(C15622c c15622c, InterfaceC15625f interfaceC15625f, LDContext lDContext, boolean z10, Boolean bool) {
        C11557s c11557sP = p(c15622c);
        return new C11557s(new C15622c(c15622c.h(), c15622c.e(), c15622c.a(), c15622c.b(), interfaceC15625f, c15622c.d(), c15622c.j(), lDContext, c15622c.g(), z10, bool, c15622c.i(), false), c11557sP.q(), c11557sP.r(), c11557sP.t(), c11557sP.u(), c11557sP.s());
    }
}
