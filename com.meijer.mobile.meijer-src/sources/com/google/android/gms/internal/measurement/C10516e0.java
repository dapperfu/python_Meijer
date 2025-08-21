package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10516e0 {

    /* renamed from: a, reason: collision with root package name */
    final C10651t1 f83004a;

    /* renamed from: b, reason: collision with root package name */
    U1 f83005b;

    /* renamed from: c, reason: collision with root package name */
    final C10497c f83006c;

    /* renamed from: d, reason: collision with root package name */
    private final b8 f83007d;

    public final C10497c e() {
        return this.f83006c;
    }

    public C10516e0() {
        C10651t1 c10651t1 = new C10651t1();
        this.f83004a = c10651t1;
        this.f83005b = c10651t1.f83254b.c();
        this.f83006c = new C10497c();
        this.f83007d = new b8();
        c10651t1.f83256d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f82507a.g();
            }
        });
        c10651t1.f83256d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new X3(this.f82957a.f83006c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f83004a.f83256d.a(str, callable);
    }

    public final boolean b(C10488b c10488b) throws zzd {
        try {
            C10497c c10497c = this.f83006c;
            c10497c.b(c10488b);
            this.f83004a.f83255c.e("runtime.counter", new C10560j(Double.valueOf(0.0d)));
            this.f83007d.b(this.f83005b.c(), c10497c);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean c() {
        C10497c c10497c = this.f83006c;
        return !c10497c.c().equals(c10497c.a());
    }

    public final boolean d() {
        return !this.f83006c.f().isEmpty();
    }

    public final void f(C10698y3 c10698y3) throws zzd {
        AbstractC10569k abstractC10569k;
        try {
            C10651t1 c10651t1 = this.f83004a;
            this.f83005b = c10651t1.f83254b.c();
            if (c10651t1.a(this.f83005b, (C3[]) c10698y3.E().toArray(new C3[0])) instanceof C10542h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C10671v3 c10671v3 : c10698y3.F().E()) {
                List listF = c10671v3.F();
                String strE = c10671v3.E();
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    InterfaceC10623q interfaceC10623qA = c10651t1.a(this.f83005b, (C3) it.next());
                    if (!(interfaceC10623qA instanceof C10596n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    U1 u12 = this.f83005b;
                    if (u12.d(strE)) {
                        InterfaceC10623q interfaceC10623qH = u12.h(strE);
                        if (!(interfaceC10623qH instanceof AbstractC10569k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strE)));
                        }
                        abstractC10569k = (AbstractC10569k) interfaceC10623qH;
                    } else {
                        abstractC10569k = null;
                    }
                    if (abstractC10569k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strE)));
                    }
                    abstractC10569k.b(this.f83005b, Collections.singletonList(interfaceC10623qA));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    final /* synthetic */ AbstractC10569k g() {
        return new X7(this.f83007d);
    }
}
