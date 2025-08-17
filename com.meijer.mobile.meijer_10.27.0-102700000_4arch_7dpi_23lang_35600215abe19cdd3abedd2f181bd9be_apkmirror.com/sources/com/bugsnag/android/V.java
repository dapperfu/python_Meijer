package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class V implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final X f63293a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6495t0 f63294b;

    V(Throwable th2, ImmutableConfig fVar, P0 p02, InterfaceC6495t0 interfaceC6495t0) {
        this(th2, fVar, p02, new Metadata(), new C6466e0(), interfaceC6495t0);
    }

    V(Throwable th2, ImmutableConfig fVar, P0 p02, Metadata c6503x0, C6466e0 c6466e0, InterfaceC6495t0 interfaceC6495t0) {
        this(new X(th2, fVar, p02, c6503x0, c6466e0), interfaceC6495t0);
    }

    private void k(String str) {
        this.f63294b.e("Invalid null value supplied to config." + str + ", ignoring");
    }

    public void a(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            k("addMetadata");
        } else {
            this.f63293a.b(str, str2, obj);
        }
    }

    public void b(String str, Map<String, ?> map) {
        if (str == null || map == null) {
            k("addMetadata");
        } else {
            this.f63293a.c(str, map);
        }
    }

    public String c() {
        return this.f63293a.getApiKey();
    }

    public C6473i d() {
        return this.f63293a.e();
    }

    public List<S> e() {
        return this.f63293a.h();
    }

    X f() {
        return this.f63293a;
    }

    K0 g() {
        return this.f63293a.session;
    }

    public Severity h() {
        return this.f63293a.k();
    }

    public List<Z0> i() {
        return this.f63293a.m();
    }

    public boolean j() {
        return this.f63293a.n();
    }

    void l(C6473i c6473i) {
        this.f63293a.q(c6473i);
    }

    void m(List<Breadcrumb> list) {
        this.f63293a.r(list);
    }

    public void n(String str) {
        this.f63293a.s(str);
    }

    void o(P p10) {
        this.f63293a.t(p10);
    }

    void p(Q6.h hVar) {
        this.f63293a.v(hVar);
    }

    void q(Collection<String> collection) {
        this.f63293a.x(collection);
    }

    void r(K0 k02) {
        this.f63293a.session = k02;
    }

    public void s(String str, String str2, String str3) {
        this.f63293a.y(str, str2, str3);
    }

    protected void t(Severity severity) {
        this.f63293a.C(severity);
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws IOException {
        this.f63293a.toStream(c6482m0);
    }

    V(X x10, InterfaceC6495t0 interfaceC6495t0) {
        this.f63293a = x10;
        this.f63294b = interfaceC6495t0;
    }
}
