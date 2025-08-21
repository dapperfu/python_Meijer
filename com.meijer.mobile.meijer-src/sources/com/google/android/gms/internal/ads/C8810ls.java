package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8810ls extends Rc.B {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6932Hr f77506c;

    /* renamed from: d, reason: collision with root package name */
    final AbstractC9772us f77507d;

    /* renamed from: e, reason: collision with root package name */
    private final String f77508e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f77509f;

    public final String e() {
        return this.f77508e;
    }

    @Override // Rc.B
    public final void a() {
        try {
            this.f77507d.o(this.f77508e, this.f77509f);
        } finally {
            Rc.D0.f32295l.post(new RunnableC8703ks(this));
        }
    }

    @Override // Rc.B
    public final com.google.common.util.concurrent.q b() {
        return (((Boolean) Oc.A.c().a(C8784lf.f77148e2)).booleanValue() && (this.f77507d instanceof C6797Ds)) ? C7033Kq.f69019f.k0(new Callable() { // from class: com.google.android.gms.internal.ads.js
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f76367a.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() throws Exception {
        return Boolean.valueOf(this.f77507d.r(this.f77508e, this.f77509f, this));
    }

    C8810ls(InterfaceC6932Hr interfaceC6932Hr, AbstractC9772us abstractC9772us, String str, String[] strArr) {
        this.f77506c = interfaceC6932Hr;
        this.f77507d = abstractC9772us;
        this.f77508e = str;
        this.f77509f = strArr;
        Nc.v.C().e(this);
    }
}
