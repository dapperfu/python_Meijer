package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public final class E70 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8184h70 f66352a;

    /* renamed from: b, reason: collision with root package name */
    private final C70 f66353b;

    /* renamed from: c, reason: collision with root package name */
    private final C7757d70 f66354c;

    /* renamed from: e, reason: collision with root package name */
    private K70 f66356e;

    /* renamed from: f, reason: collision with root package name */
    private int f66357f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f66355d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76312e6)).booleanValue() && !Lc.v.s().j().zzg().h()) {
            this.f66355d.clear();
            return;
        }
        if (i()) {
            while (!this.f66355d.isEmpty()) {
                D70 d70 = (D70) this.f66355d.pollFirst();
                if (d70 == null || (d70.zza() != null && this.f66352a.a(d70.zza()))) {
                    K70 k70 = new K70(this.f66352a, this.f66353b, d70);
                    this.f66356e = k70;
                    k70.d(new A70(this, d70));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f66356e == null;
    }

    public final synchronized com.google.common.util.concurrent.q a(D70 d70) {
        this.f66357f = 2;
        if (i()) {
            return null;
        }
        return this.f66356e.a(d70);
    }

    public final synchronized void e(D70 d70) {
        this.f66355d.add(d70);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f66357f = 1;
            h();
        }
    }

    public E70(InterfaceC8184h70 interfaceC8184h70, C7757d70 c7757d70, C70 c70) {
        this.f66352a = interfaceC8184h70;
        this.f66354c = c7757d70;
        this.f66353b = c70;
        c7757d70.b(new C10107z70(this));
    }
}
