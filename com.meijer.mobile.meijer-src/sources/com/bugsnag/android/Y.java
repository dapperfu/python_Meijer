package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class Y implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Z f64059a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f64060b;

    static List<Y> a(Throwable th2, Collection<String> collection, D0 d02) {
        return Z.INSTANCE.a(th2, collection, d02);
    }

    private void f(String str) {
        this.f64060b.e("Invalid null value supplied to error." + str + ", ignoring");
    }

    public String b() {
        return this.f64059a.getErrorClass();
    }

    public String c() {
        return this.f64059a.getErrorMessage();
    }

    public List<c1> d() {
        return this.f64059a.c();
    }

    public ErrorType e() {
        return this.f64059a.getType();
    }

    public void g(String str) {
        if (str != null) {
            this.f64059a.e(str);
        } else {
            f("errorClass");
        }
    }

    public void h(String str) {
        this.f64059a.f(str);
    }

    public void i(ErrorType errorType) {
        if (errorType != null) {
            this.f64059a.g(errorType);
        } else {
            f("type");
        }
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws IOException {
        this.f64059a.toStream(c6624v0);
    }

    Y(Z z10, D0 d02) {
        this.f64059a = z10;
        this.f64060b = d02;
    }
}
