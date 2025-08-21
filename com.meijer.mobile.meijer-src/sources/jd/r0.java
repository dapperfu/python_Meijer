package jd;

import android.app.Dialog;

/* loaded from: classes4.dex */
final class r0 extends N {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f140385a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s0 f140386b;

    r0(s0 s0Var, Dialog dialog) {
        this.f140386b = s0Var;
        this.f140385a = dialog;
    }

    @Override // jd.N
    public final void a() {
        this.f140386b.f140395b.o();
        if (this.f140385a.isShowing()) {
            this.f140385a.dismiss();
        }
    }
}
