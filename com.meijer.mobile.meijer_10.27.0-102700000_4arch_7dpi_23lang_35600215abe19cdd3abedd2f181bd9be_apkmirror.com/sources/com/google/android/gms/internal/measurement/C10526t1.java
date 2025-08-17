package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10526t1 {

    /* renamed from: a, reason: collision with root package name */
    final C10569y f82413a;

    /* renamed from: b, reason: collision with root package name */
    final U1 f82414b;

    /* renamed from: c, reason: collision with root package name */
    final U1 f82415c;

    /* renamed from: d, reason: collision with root package name */
    final C10564x3 f82416d;

    public final InterfaceC10498q a(U1 u12, C3... c3Arr) {
        InterfaceC10498q interfaceC10498qB = InterfaceC10498q.f82342i3;
        for (C3 c32 : c3Arr) {
            interfaceC10498qB = W2.b(c32);
            C10545v2.l(this.f82415c);
            if ((interfaceC10498qB instanceof r) || (interfaceC10498qB instanceof C10489p)) {
                interfaceC10498qB = this.f82413a.b(u12, interfaceC10498qB);
            }
        }
        return interfaceC10498qB;
    }

    public C10526t1() {
        C10569y c10569y = new C10569y();
        this.f82413a = c10569y;
        U1 u12 = new U1(null, c10569y);
        this.f82415c = u12;
        this.f82414b = u12.c();
        C10564x3 c10564x3 = new C10564x3();
        this.f82416d = c10564x3;
        u12.e("require", new Y7(c10564x3));
        c10564x3.a("internal.platform", CallableC10356a1.f82118a);
        u12.e("runtime.counter", new C10435j(Double.valueOf(0.0d)));
    }
}
