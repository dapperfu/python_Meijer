package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class S implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final T f63220a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6495t0 f63221b;

    static List<S> a(Throwable th2, Collection<String> collection, InterfaceC6495t0 interfaceC6495t0) {
        return T.INSTANCE.a(th2, collection, interfaceC6495t0);
    }

    private void f(String str) {
        this.f63221b.e("Invalid null value supplied to error." + str + ", ignoring");
    }

    public String b() {
        return this.f63220a.getErrorClass();
    }

    public String c() {
        return this.f63220a.getErrorMessage();
    }

    public List<R0> d() {
        return this.f63220a.c();
    }

    public ErrorType e() {
        return this.f63220a.getType();
    }

    public void g(String str) {
        if (str != null) {
            this.f63220a.e(str);
        } else {
            f("errorClass");
        }
    }

    public void h(String str) {
        this.f63220a.f(str);
    }

    public void i(ErrorType errorType) {
        if (errorType != null) {
            this.f63220a.g(errorType);
        } else {
            f("type");
        }
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws IOException {
        this.f63220a.toStream(c6482m0);
    }

    S(T t10, InterfaceC6495t0 interfaceC6495t0) {
        this.f63220a = t10;
        this.f63221b = interfaceC6495t0;
    }
}
