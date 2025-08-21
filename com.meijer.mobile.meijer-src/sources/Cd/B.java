package Cd;

import Vd.C5517k;
import android.os.RemoteException;
import jd.C14996t;

/* loaded from: classes6.dex */
final class B extends z0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f4186a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ld.K f4187b;

    B(C5517k c5517k, Ld.K k10) {
        this.f4186a = c5517k;
        this.f4187b = k10;
    }

    @Override // Cd.A0
    public final void zze() throws RemoteException {
        this.f4187b.zzf();
    }

    @Override // Cd.A0
    public final void h9(w0 w0Var) {
        C14996t.a(w0Var.a(), this.f4186a);
    }
}
