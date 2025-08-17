package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10391e0 {

    /* renamed from: a, reason: collision with root package name */
    final C10526t1 f82164a;

    /* renamed from: b, reason: collision with root package name */
    U1 f82165b;

    /* renamed from: c, reason: collision with root package name */
    final C10372c f82166c;

    /* renamed from: d, reason: collision with root package name */
    private final b8 f82167d;

    public final C10372c e() {
        return this.f82166c;
    }

    public C10391e0() {
        C10526t1 c10526t1 = new C10526t1();
        this.f82164a = c10526t1;
        this.f82165b = c10526t1.f82414b.c();
        this.f82166c = new C10372c();
        this.f82167d = new b8();
        c10526t1.f82416d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f81667a.g();
            }
        });
        c10526t1.f82416d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new X3(this.f82117a.f82166c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f82164a.f82416d.a(str, callable);
    }

    public final boolean b(C10363b c10363b) throws zzd {
        try {
            C10372c c10372c = this.f82166c;
            c10372c.b(c10363b);
            this.f82164a.f82415c.e("runtime.counter", new C10435j(Double.valueOf(0.0d)));
            this.f82167d.b(this.f82165b.c(), c10372c);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean c() {
        C10372c c10372c = this.f82166c;
        return !c10372c.c().equals(c10372c.a());
    }

    public final boolean d() {
        return !this.f82166c.f().isEmpty();
    }

    public final void f(C10573y3 c10573y3) throws zzd {
        AbstractC10444k abstractC10444k;
        try {
            C10526t1 c10526t1 = this.f82164a;
            this.f82165b = c10526t1.f82414b.c();
            if (c10526t1.a(this.f82165b, (C3[]) c10573y3.E().toArray(new C3[0])) instanceof C10417h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C10546v3 c10546v3 : c10573y3.F().E()) {
                List listF = c10546v3.F();
                String strE = c10546v3.E();
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    InterfaceC10498q interfaceC10498qA = c10526t1.a(this.f82165b, (C3) it.next());
                    if (!(interfaceC10498qA instanceof C10471n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    U1 u12 = this.f82165b;
                    if (u12.d(strE)) {
                        InterfaceC10498q interfaceC10498qH = u12.h(strE);
                        if (!(interfaceC10498qH instanceof AbstractC10444k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strE)));
                        }
                        abstractC10444k = (AbstractC10444k) interfaceC10498qH;
                    } else {
                        abstractC10444k = null;
                    }
                    if (abstractC10444k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strE)));
                    }
                    abstractC10444k.b(this.f82165b, Collections.singletonList(interfaceC10498qA));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    final /* synthetic */ AbstractC10444k g() {
        return new X7(this.f82167d);
    }
}
