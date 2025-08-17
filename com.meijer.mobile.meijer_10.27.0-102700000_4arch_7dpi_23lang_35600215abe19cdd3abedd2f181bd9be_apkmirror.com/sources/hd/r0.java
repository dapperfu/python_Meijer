package hd;

import android.app.Dialog;

/* loaded from: classes4.dex */
final class r0 extends N {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f134696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s0 f134697b;

    r0(s0 s0Var, Dialog dialog) {
        this.f134697b = s0Var;
        this.f134696a = dialog;
    }

    @Override // hd.N
    public final void a() {
        this.f134697b.f134706b.o();
        if (this.f134696a.isShowing()) {
            this.f134696a.dismiss();
        }
    }
}
