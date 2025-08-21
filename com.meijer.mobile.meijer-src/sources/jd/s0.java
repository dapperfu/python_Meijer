package jd;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import id.C14719b;

/* loaded from: classes4.dex */
final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final q0 f140394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0 f140395b;

    s0(t0 t0Var, q0 q0Var) {
        this.f140395b = t0Var;
        this.f140394a = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f140395b.f140396b) {
            C14719b c14719bB = this.f140394a.b();
            if (c14719bB.r0()) {
                t0 t0Var = this.f140395b;
                t0Var.f140338a.startActivityForResult(GoogleApiActivity.a(t0Var.b(), (PendingIntent) com.google.android.gms.common.internal.r.l(c14719bB.b0()), this.f140394a.a(), false), 1);
                return;
            }
            t0 t0Var2 = this.f140395b;
            if (t0Var2.f140399e.b(t0Var2.b(), c14719bB.B(), null) != null) {
                t0 t0Var3 = this.f140395b;
                t0Var3.f140399e.v(t0Var3.b(), t0Var3.f140338a, c14719bB.B(), 2, this.f140395b);
                return;
            }
            if (c14719bB.B() != 18) {
                this.f140395b.l(c14719bB, this.f140394a.a());
                return;
            }
            t0 t0Var4 = this.f140395b;
            Dialog dialogQ = t0Var4.f140399e.q(t0Var4.b(), t0Var4);
            t0 t0Var5 = this.f140395b;
            t0Var5.f140399e.r(t0Var5.b().getApplicationContext(), new r0(this, dialogQ));
        }
    }
}
