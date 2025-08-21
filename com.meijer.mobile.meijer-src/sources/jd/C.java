package jd;

import jd.ComponentCallbacks2C14980c;

/* loaded from: classes4.dex */
final class C implements ComponentCallbacks2C14980c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14982e f140243a;

    C(C14982e c14982e) {
        this.f140243a = c14982e;
    }

    @Override // jd.ComponentCallbacks2C14980c.a
    public final void a(boolean z10) {
        C14982e c14982e = this.f140243a;
        c14982e.f140325n.sendMessage(c14982e.f140325n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
