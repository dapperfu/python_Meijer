package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9857wq extends Pc.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6568Aq f79549c;

    C9857wq(C6568Aq c6568Aq) {
        this.f79549c = c6568Aq;
    }

    @Override // Pc.B
    public final void a() {
        C6568Aq c6568Aq = this.f79549c;
        C8980of c8980of = new C8980of(c6568Aq.f65192e, c6568Aq.f65193f.f29929a);
        synchronized (this.f79549c.f65188a) {
            try {
                Lc.v.h();
                C9300rf.a(this.f79549c.f65195h, c8980of);
            } catch (IllegalArgumentException e10) {
                Qc.p.h("Cannot config CSI reporter.", e10);
            }
        }
    }
}
