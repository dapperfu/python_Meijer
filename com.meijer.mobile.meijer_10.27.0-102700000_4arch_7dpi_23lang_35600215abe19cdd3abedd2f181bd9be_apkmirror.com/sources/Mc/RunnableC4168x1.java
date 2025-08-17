package Mc;

import android.os.RemoteException;

/* renamed from: Mc.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC4168x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC4171y1 f19361a;

    RunnableC4168x1(BinderC4171y1 binderC4171y1) {
        this.f19361a = binderC4171y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A1 a12 = this.f19361a.f19369a;
        if (a12.f19136a != null) {
            try {
                a12.f19136a.zze(1);
            } catch (RemoteException e10) {
                Qc.p.h("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
