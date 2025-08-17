package org.junit.internal;

import nw.b;
import nw.c;
import nw.d;

/* loaded from: classes13.dex */
public class AssumptionViolatedException extends RuntimeException implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f154908a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f154909b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f154910c;

    @Override // nw.c
    public void a(b bVar) {
        String str = this.f154908a;
        if (str != null) {
            bVar.a(str);
        }
        if (this.f154909b) {
            if (this.f154908a != null) {
                bVar.a(": ");
            }
            bVar.a("got: ");
            bVar.b(this.f154910c);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return d.k(this);
    }
}
