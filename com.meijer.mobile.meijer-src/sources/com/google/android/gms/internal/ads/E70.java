package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public final class E70 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8309h70 f67192a;

    /* renamed from: b, reason: collision with root package name */
    private final C70 f67193b;

    /* renamed from: c, reason: collision with root package name */
    private final C7882d70 f67194c;

    /* renamed from: e, reason: collision with root package name */
    private K70 f67196e;

    /* renamed from: f, reason: collision with root package name */
    private int f67197f = 1;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f67195d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77152e6)).booleanValue() && !Nc.v.s().j().zzg().h()) {
            this.f67195d.clear();
            return;
        }
        if (i()) {
            while (!this.f67195d.isEmpty()) {
                D70 d70 = (D70) this.f67195d.pollFirst();
                if (d70 == null || (d70.zza() != null && this.f67192a.a(d70.zza()))) {
                    K70 k70 = new K70(this.f67192a, this.f67193b, d70);
                    this.f67196e = k70;
                    k70.d(new A70(this, d70));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f67196e == null;
    }

    public final synchronized com.google.common.util.concurrent.q a(D70 d70) {
        this.f67197f = 2;
        if (i()) {
            return null;
        }
        return this.f67196e.a(d70);
    }

    public final synchronized void e(D70 d70) {
        this.f67195d.add(d70);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f67197f = 1;
            h();
        }
    }

    public E70(InterfaceC8309h70 interfaceC8309h70, C7882d70 c7882d70, C70 c70) {
        this.f67192a = interfaceC8309h70;
        this.f67194c = c7882d70;
        this.f67193b = c70;
        c7882d70.b(new C10232z70(this));
    }
}
