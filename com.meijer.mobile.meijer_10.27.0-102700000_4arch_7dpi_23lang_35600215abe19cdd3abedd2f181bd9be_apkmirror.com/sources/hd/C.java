package hd;

import hd.ComponentCallbacks2C14402c;

/* loaded from: classes4.dex */
final class C implements ComponentCallbacks2C14402c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14404e f134554a;

    C(C14404e c14404e) {
        this.f134554a = c14404e;
    }

    @Override // hd.ComponentCallbacks2C14402c.a
    public final void a(boolean z10) {
        C14404e c14404e = this.f134554a;
        c14404e.f134636n.sendMessage(c14404e.f134636n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
