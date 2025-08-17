package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8685ls extends Pc.B {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6807Hr f76666c;

    /* renamed from: d, reason: collision with root package name */
    final AbstractC9647us f76667d;

    /* renamed from: e, reason: collision with root package name */
    private final String f76668e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f76669f;

    public final String e() {
        return this.f76668e;
    }

    @Override // Pc.B
    public final void a() {
        try {
            this.f76667d.o(this.f76668e, this.f76669f);
        } finally {
            Pc.D0.f25081l.post(new RunnableC8578ks(this));
        }
    }

    @Override // Pc.B
    public final com.google.common.util.concurrent.q b() {
        return (((Boolean) Mc.A.c().a(C8659lf.f76308e2)).booleanValue() && (this.f76667d instanceof C6672Ds)) ? C6908Kq.f68179f.i0(new Callable() { // from class: com.google.android.gms.internal.ads.js
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75527a.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() throws Exception {
        return Boolean.valueOf(this.f76667d.r(this.f76668e, this.f76669f, this));
    }

    C8685ls(InterfaceC6807Hr interfaceC6807Hr, AbstractC9647us abstractC9647us, String str, String[] strArr) {
        this.f76666c = interfaceC6807Hr;
        this.f76667d = abstractC9647us;
        this.f76668e = str;
        this.f76669f = strArr;
        Lc.v.C().e(this);
    }
}
