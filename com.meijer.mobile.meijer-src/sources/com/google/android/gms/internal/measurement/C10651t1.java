package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10651t1 {

    /* renamed from: a, reason: collision with root package name */
    final C10694y f83253a;

    /* renamed from: b, reason: collision with root package name */
    final U1 f83254b;

    /* renamed from: c, reason: collision with root package name */
    final U1 f83255c;

    /* renamed from: d, reason: collision with root package name */
    final C10689x3 f83256d;

    public final InterfaceC10623q a(U1 u12, C3... c3Arr) {
        InterfaceC10623q interfaceC10623qB = InterfaceC10623q.f83182i3;
        for (C3 c32 : c3Arr) {
            interfaceC10623qB = W2.b(c32);
            C10670v2.l(this.f83255c);
            if ((interfaceC10623qB instanceof r) || (interfaceC10623qB instanceof C10614p)) {
                interfaceC10623qB = this.f83253a.b(u12, interfaceC10623qB);
            }
        }
        return interfaceC10623qB;
    }

    public C10651t1() {
        C10694y c10694y = new C10694y();
        this.f83253a = c10694y;
        U1 u12 = new U1(null, c10694y);
        this.f83255c = u12;
        this.f83254b = u12.c();
        C10689x3 c10689x3 = new C10689x3();
        this.f83256d = c10689x3;
        u12.e("require", new Y7(c10689x3));
        c10689x3.a("internal.platform", CallableC10481a1.f82958a);
        u12.e("runtime.counter", new C10560j(Double.valueOf(0.0d)));
    }
}
