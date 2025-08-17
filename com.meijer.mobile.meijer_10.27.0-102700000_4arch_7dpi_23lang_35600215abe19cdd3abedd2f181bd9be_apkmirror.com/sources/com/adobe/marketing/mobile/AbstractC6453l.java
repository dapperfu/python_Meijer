package com.adobe.marketing.mobile;

import java.util.Map;

/* renamed from: com.adobe.marketing.mobile.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6453l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6454m f62551a;

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

    public boolean i(C6449h c6449h) {
        return true;
    }

    private String c() {
        return "Extension[" + e() + "(" + f() + ")]";
    }

    public final AbstractC6454m a() {
        return this.f62551a;
    }

    protected AbstractC6453l(AbstractC6454m abstractC6454m) {
        this.f62551a = abstractC6454m;
    }

    protected void g() {
        Q5.t.e("MobileCore", c(), "Extension registered successfully.", new Object[0]);
    }

    protected void h() {
        Q5.t.e("MobileCore", c(), "Extension unregistered successfully.", new Object[0]);
    }
}
