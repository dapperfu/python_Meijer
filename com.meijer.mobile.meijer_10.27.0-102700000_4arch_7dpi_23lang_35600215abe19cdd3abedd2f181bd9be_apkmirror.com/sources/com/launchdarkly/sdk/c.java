package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private d f91291a;

    /* renamed from: b, reason: collision with root package name */
    private String f91292b;

    /* renamed from: c, reason: collision with root package name */
    private String f91293c;

    /* renamed from: d, reason: collision with root package name */
    private b f91294d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f91295e;

    /* renamed from: f, reason: collision with root package name */
    private List<AttributeRef> f91296f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f91297g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f91298h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f91299i;

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
                this.f91295e = lDValue.a();
                return true;
            case "key":
                if (!lDValue.l()) {
                    return false;
                }
                this.f91292b = lDValue.x();
                return true;
            case "kind":
                if (!lDValue.l()) {
                    return false;
                }
                this.f91291a = d.e(lDValue.x());
                return true;
            case "name":
                if (!lDValue.l() && !lDValue.k()) {
                    return false;
                }
                this.f91293c = lDValue.x();
                return true;
            case "_meta":
                return false;
            default:
                if (this.f91297g) {
                    this.f91294d = new b(this.f91294d);
                    this.f91297g = false;
                }
                if (lDValue == null || lDValue.k()) {
                    b bVar = this.f91294d;
                    if (bVar != null) {
                        bVar.e(str);
                    }
                } else {
                    if (this.f91294d == null) {
                        this.f91294d = new b();
                    }
                    this.f91294d.d(str, lDValue);
                }
                return true;
        }
    }

    c(d dVar, String str) {
        this.f91291a = dVar;
        this.f91292b = str;
    }

    private void h() {
        if (this.f91298h) {
            this.f91296f = new ArrayList(this.f91296f);
            this.f91298h = false;
        } else if (this.f91296f == null) {
            this.f91296f = new ArrayList();
        }
    }

    public c a(boolean z10) {
        this.f91295e = z10;
        return this;
    }

    public LDContext b() {
        b bVar = this.f91294d;
        this.f91297g = bVar != null;
        List<AttributeRef> list = this.f91296f;
        this.f91298h = list != null;
        return LDContext.e(this.f91291a, this.f91292b, this.f91293c, bVar, this.f91295e, list, this.f91299i);
    }

    public c d(String str) {
        this.f91292b = str;
        return this;
    }

    public c e(d dVar) {
        this.f91291a = dVar;
        return this;
    }

    public c g(String str) {
        this.f91293c = str;
        return this;
    }

    public c i(AttributeRef... attributeRefArr) {
        if (attributeRefArr != null && attributeRefArr.length != 0) {
            h();
            for (AttributeRef attributeRef : attributeRefArr) {
                this.f91296f.add(attributeRef);
            }
        }
        return this;
    }

    void m(boolean z10) {
        this.f91299i = z10;
    }

    c c(LDContext lDContext) {
        boolean z10;
        this.f91291a = lDContext.o();
        this.f91292b = lDContext.n();
        this.f91293c = lDContext.p();
        this.f91295e = lDContext.u();
        b bVar = lDContext.attributes;
        this.f91294d = bVar;
        List<AttributeRef> list = lDContext.privateAttributes;
        this.f91296f = list;
        boolean z11 = false;
        if (bVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f91297g = z10;
        if (list != null) {
            z11 = true;
        }
        this.f91298h = z11;
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
