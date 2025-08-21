package Oc;

import android.os.RemoteException;

/* renamed from: Oc.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC4446x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC4449y1 f23548a;

    RunnableC4446x1(BinderC4449y1 binderC4449y1) {
        this.f23548a = binderC4449y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A1 a12 = this.f23548a.f23556a;
        if (a12.f23323a != null) {
            try {
                a12.f23323a.zze(1);
            } catch (RemoteException e10) {
                Sc.p.h("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
