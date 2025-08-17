package hd;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import gd.C14243b;
import gd.C14247f;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class t0 extends C14407h implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f134707b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f134708c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f134709d;

    /* renamed from: e, reason: collision with root package name */
    protected final C14247f f134710e;

    protected abstract void m(C14243b c14243b, int i10);

    protected abstract void n();

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C14243b c14243b, int i10) {
        this.f134708c.set(null);
        m(c14243b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f134708c.set(null);
        n();
    }

    private static final int p(q0 q0Var) {
        if (q0Var == null) {
            return -1;
        }
        return q0Var.a();
    }

    @Override // hd.C14407h
    public final void e(int i10, int i11, Intent intent) {
        q0 q0Var = (q0) this.f134708c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f134710e.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (q0Var == null) {
                        return;
                    }
                    if (q0Var.b().B() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (q0Var != null) {
                l(new C14243b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, q0Var.b().toString()), p(q0Var));
                return;
            }
            return;
        }
        if (q0Var != null) {
            l(q0Var.b(), q0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C14243b(13, null), p((q0) this.f134708c.get()));
    }

    public final void s(C14243b c14243b, int i10) {
        AtomicReference atomicReference;
        q0 q0Var = new q0(c14243b, i10);
        do {
            atomicReference = this.f134708c;
            if (U.d.a(atomicReference, null, q0Var)) {
                this.f134709d.post(new s0(this, q0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    t0(InterfaceC14408i interfaceC14408i, C14247f c14247f) {
        super(interfaceC14408i);
        this.f134708c = new AtomicReference(null);
        this.f134709d = new wd.j(Looper.getMainLooper());
        this.f134710e = c14247f;
    }

    @Override // hd.C14407h
    public final void f(Bundle bundle) {
        q0 q0Var;
        super.f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f134708c;
            if (bundle.getBoolean("resolving_error", false)) {
                q0Var = new q0(new C14243b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                q0Var = null;
            }
            atomicReference.set(q0Var);
        }
    }

    @Override // hd.C14407h
    public final void i(Bundle bundle) {
        super.i(bundle);
        q0 q0Var = (q0) this.f134708c.get();
        if (q0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", q0Var.a());
        bundle.putInt("failed_status", q0Var.b().B());
        bundle.putParcelable("failed_resolution", q0Var.b().c0());
    }

    @Override // hd.C14407h
    public void j() {
        super.j();
        this.f134707b = true;
    }

    @Override // hd.C14407h
    public void k() {
        super.k();
        this.f134707b = false;
    }
}
