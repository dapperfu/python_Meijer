package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private d f92130a;

    /* renamed from: b, reason: collision with root package name */
    private String f92131b;

    /* renamed from: c, reason: collision with root package name */
    private String f92132c;

    /* renamed from: d, reason: collision with root package name */
    private b f92133d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92134e;

    /* renamed from: f, reason: collision with root package name */
    private List<AttributeRef> f92135f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f92136g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f92137h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f92138i;

    c() {
    }

    public boolean n(String str, LDValue lDValue) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        switch (str) {
            case "anonymous":
                if (lDValue.h() != i.BOOLEAN) {
                    return false;
                }
                this.f92134e = lDValue.a();
                return true;
            case "key":
                if (!lDValue.l()) {
                    return false;
                }
                this.f92131b = lDValue.x();
                return true;
            case "kind":
                if (!lDValue.l()) {
                    return false;
                }
                this.f92130a = d.e(lDValue.x());
                return true;
            case "name":
                if (!lDValue.l() && !lDValue.k()) {
                    return false;
                }
                this.f92132c = lDValue.x();
                return true;
            case "_meta":
                return false;
            default:
                if (this.f92136g) {
                    this.f92133d = new b(this.f92133d);
                    this.f92136g = false;
                }
                if (lDValue == null || lDValue.k()) {
                    b bVar = this.f92133d;
                    if (bVar != null) {
                        bVar.e(str);
                    }
                } else {
                    if (this.f92133d == null) {
                        this.f92133d = new b();
                    }
                    this.f92133d.d(str, lDValue);
                }
                return true;
        }
    }

    c(d dVar, String str) {
        this.f92130a = dVar;
        this.f92131b = str;
    }

    private void h() {
        if (this.f92137h) {
            this.f92135f = new ArrayList(this.f92135f);
            this.f92137h = false;
        } else if (this.f92135f == null) {
            this.f92135f = new ArrayList();
        }
    }

    public c a(boolean z10) {
        this.f92134e = z10;
        return this;
    }

    public LDContext b() {
        b bVar = this.f92133d;
        this.f92136g = bVar != null;
        List<AttributeRef> list = this.f92135f;
        this.f92137h = list != null;
        return LDContext.e(this.f92130a, this.f92131b, this.f92132c, bVar, this.f92134e, list, this.f92138i);
    }

    public c d(String str) {
        this.f92131b = str;
        return this;
    }

    public c e(d dVar) {
        this.f92130a = dVar;
        return this;
    }

    public c g(String str) {
        this.f92132c = str;
        return this;
    }

    public c i(AttributeRef... attributeRefArr) {
        if (attributeRefArr != null && attributeRefArr.length != 0) {
            h();
            for (AttributeRef attributeRef : attributeRefArr) {
                this.f92135f.add(attributeRef);
            }
        }
        return this;
    }

    void m(boolean z10) {
        this.f92138i = z10;
    }

    c c(LDContext lDContext) {
        boolean z10;
        this.f92130a = lDContext.o();
        this.f92131b = lDContext.n();
        this.f92132c = lDContext.p();
        this.f92134e = lDContext.u();
        b bVar = lDContext.attributes;
        this.f92133d = bVar;
        List<AttributeRef> list = lDContext.privateAttributes;
        this.f92135f = list;
        boolean z11 = false;
        if (bVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f92136g = z10;
        if (list != null) {
            z11 = true;
        }
        this.f92137h = z11;
        return this;
    }

    public c f(String str) {
        return e(d.e(str));
    }

    public c j(String str, LDValue lDValue) {
        n(str, lDValue);
        return this;
    }

    public c k(String str, String str2) {
        return j(str, LDValue.s(str2));
    }

    public c l(String str, boolean z10) {
        return j(str, LDValue.t(z10));
    }
}
