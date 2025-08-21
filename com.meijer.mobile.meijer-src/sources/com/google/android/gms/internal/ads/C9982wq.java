package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9982wq extends Rc.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6693Aq f80389c;

    C9982wq(C6693Aq c6693Aq) {
        this.f80389c = c6693Aq;
    }

    @Override // Rc.B
    public final void a() {
        C6693Aq c6693Aq = this.f80389c;
        C9105of c9105of = new C9105of(c6693Aq.f66032e, c6693Aq.f66033f.f34479a);
        synchronized (this.f80389c.f66028a) {
            try {
                Nc.v.h();
                C9425rf.a(this.f80389c.f66035h, c9105of);
            } catch (IllegalArgumentException e10) {
                Sc.p.h("Cannot config CSI reporter.", e10);
            }
        }
    }
}
