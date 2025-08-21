package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.bugsnag.android.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6585b0 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name */
    private final C6589d0 f64096a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f64097b;

    C6585b0(Throwable th2, ImmutableConfig kVar, a1 a1Var, D0 d02) {
        this(th2, kVar, a1Var, new Metadata(), new C6611o0(), d02);
    }

    C6585b0(Throwable th2, ImmutableConfig kVar, a1 a1Var, Metadata h02, C6611o0 c6611o0, D0 d02) {
        this(new C6589d0(th2, kVar, a1Var, h02, c6611o0), d02);
    }

    private void k(String str) {
        this.f64097b.e("Invalid null value supplied to config." + str + ", ignoring");
    }

    public void a(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            k("addMetadata");
        } else {
            this.f64096a.b(str, str2, obj);
        }
    }

    public void b(String str, Map<String, ?> map) {
        if (str == null || map == null) {
            k("addMetadata");
        } else {
            this.f64096a.c(str, map);
        }
    }

    public String c() {
        return this.f64096a.getApiKey();
    }

    public C6604l d() {
        return this.f64096a.e();
    }

    public List<Y> e() {
        return this.f64096a.i();
    }

    C6589d0 f() {
        return this.f64096a;
    }

    V0 g() {
        return this.f64096a.session;
    }

    public Severity h() {
        return this.f64096a.l();
    }

    public List<k1> i() {
        return this.f64096a.n();
    }

    public boolean j() {
        return this.f64096a.o();
    }

    void l(C6604l c6604l) {
        this.f64096a.r(c6604l);
    }

    void m(List<Breadcrumb> list) {
        this.f64096a.s(list);
    }

    public void n(String str) {
        this.f64096a.t(str);
    }

    void o(W w10) {
        this.f64096a.u(w10);
    }

    void p(R6.m mVar) {
        this.f64096a.w(mVar);
    }

    void q(Collection<Pattern> collection) {
        this.f64096a.y(collection);
    }

    void r(V0 v02) {
        this.f64096a.session = v02;
    }

    public void s(String str, String str2, String str3) {
        this.f64096a.A(str, str2, str3);
    }

    protected void t(Severity severity) {
        this.f64096a.E(severity);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws IOException {
        this.f64096a.toStream(c6624v0);
    }

    C6585b0(C6589d0 c6589d0, D0 d02) {
        this.f64096a = c6589d0;
        this.f64097b = d02;
    }
}
