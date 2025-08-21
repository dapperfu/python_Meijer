package Gc;

import Oc.P1;
import Oc.Y0;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11365a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Y0 f11366b;

    /* renamed from: c, reason: collision with root package name */
    private a f11367c;

    public static abstract class a {
        public void a() {
        }

        public void b(boolean z10) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public void a(a aVar) {
        P1 p12;
        synchronized (this.f11365a) {
            this.f11367c = aVar;
            Y0 y02 = this.f11366b;
            if (y02 == null) {
                return;
            }
            if (aVar == null) {
                p12 = null;
            } else {
                try {
                    p12 = new P1(aVar);
                } catch (RemoteException e10) {
                    Sc.p.e("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            y02.v5(p12);
        }
    }

    public final Y0 b() {
        Y0 y02;
        synchronized (this.f11365a) {
            y02 = this.f11366b;
        }
        return y02;
    }

    public final void c(Y0 y02) {
        synchronized (this.f11365a) {
            try {
                this.f11366b = y02;
                a aVar = this.f11367c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
