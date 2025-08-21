package com.adobe.marketing.mobile;

import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6578l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6579m f63390a;

    protected String b() {
        return null;
    }

    protected Map<String, String> d() {
        return null;
    }

    protected abstract String e();

    protected String f() {
        return null;
    }

    public boolean i(C6574h c6574h) {
        return true;
    }

    private String c() {
        return "Extension[" + e() + "(" + f() + ")]";
    }

    public final AbstractC6579m a() {
        return this.f63390a;
    }

    protected AbstractC6578l(AbstractC6579m abstractC6579m) {
        this.f63390a = abstractC6579m;
    }

    protected void g() {
        R5.t.e("MobileCore", c(), "Extension registered successfully.", new Object[0]);
    }

    protected void h() {
        R5.t.e("MobileCore", c(), "Extension unregistered successfully.", new Object[0]);
    }
}
