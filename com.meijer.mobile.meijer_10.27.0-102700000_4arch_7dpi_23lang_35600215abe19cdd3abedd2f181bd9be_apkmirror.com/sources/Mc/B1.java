package Mc;

import android.os.RemoteException;

/* loaded from: classes4.dex */
final class B1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1 f19138a;

    B1(C1 c12) {
        this.f19138a = c12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1 c12 = this.f19138a;
        if (c12.f19139a != null) {
            try {
                c12.f19139a.zze(1);
            } catch (RemoteException e10) {
                Qc.p.h("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
