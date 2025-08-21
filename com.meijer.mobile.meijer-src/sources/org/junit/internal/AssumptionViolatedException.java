package org.junit.internal;

import jw.b;
import jw.c;
import jw.d;

/* loaded from: classes14.dex */
public class AssumptionViolatedException extends RuntimeException implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155481a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f155482b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f155483c;

    @Override // jw.c
    public void a(b bVar) {
        String str = this.f155481a;
        if (str != null) {
            bVar.a(str);
        }
        if (this.f155482b) {
            if (this.f155481a != null) {
                bVar.a(": ");
            }
            bVar.a("got: ");
            bVar.b(this.f155483c);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return d.k(this);
    }
}
