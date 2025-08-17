package hd;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.res.Resources;
import com.google.android.gms.common.api.GoogleApiActivity;
import gd.C14243b;

/* loaded from: classes4.dex */
final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final q0 f134705a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0 f134706b;

    s0(t0 t0Var, q0 q0Var) {
        this.f134706b = t0Var;
        this.f134705a = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        if (this.f134706b.f134707b) {
            C14243b c14243bB = this.f134705a.b();
            if (c14243bB.q0()) {
                t0 t0Var = this.f134706b;
                t0Var.f134649a.startActivityForResult(GoogleApiActivity.a(t0Var.b(), (PendingIntent) com.google.android.gms.common.internal.r.l(c14243bB.c0()), this.f134705a.a(), false), 1);
                return;
            }
            t0 t0Var2 = this.f134706b;
            if (t0Var2.f134710e.b(t0Var2.b(), c14243bB.B(), null) != null) {
                t0 t0Var3 = this.f134706b;
                t0Var3.f134710e.v(t0Var3.b(), t0Var3.f134649a, c14243bB.B(), 2, this.f134706b);
                return;
            }
            if (c14243bB.B() != 18) {
                this.f134706b.l(c14243bB, this.f134705a.a());
                return;
            }
            t0 t0Var4 = this.f134706b;
            Dialog dialogQ = t0Var4.f134710e.q(t0Var4.b(), t0Var4);
            t0 t0Var5 = this.f134706b;
            t0Var5.f134710e.r(t0Var5.b().getApplicationContext(), new r0(this, dialogQ));
        }
    }
}
