package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Vi0 extends Pi0 {
    /* synthetic */ Vi0(C7921ej0 c7921ej0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Si0 a(AbstractC7495aj0 abstractC7495aj0, Si0 si0) {
        Si0 si02;
        synchronized (abstractC7495aj0) {
            try {
                si02 = abstractC7495aj0.f72482b;
                if (si02 != si0) {
                    abstractC7495aj0.f72482b = si0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return si02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Zi0 b(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0) {
        Zi0 zi02;
        synchronized (abstractC7495aj0) {
            try {
                zi02 = abstractC7495aj0.f72483c;
                if (zi02 != zi0) {
                    abstractC7495aj0.f72483c = zi0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zi02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void c(Zi0 zi0, Zi0 zi02) {
        zi0.f72235b = zi02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void d(Zi0 zi0, Thread thread) {
        zi0.f72234a = thread;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean e(AbstractC7495aj0 abstractC7495aj0, Si0 si0, Si0 si02) {
        synchronized (abstractC7495aj0) {
            try {
                if (abstractC7495aj0.f72482b != si0) {
                    return false;
                }
                abstractC7495aj0.f72482b = si02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean f(AbstractC7495aj0 abstractC7495aj0, Object obj, Object obj2) {
        synchronized (abstractC7495aj0) {
            try {
                if (abstractC7495aj0.f72481a != obj) {
                    return false;
                }
                abstractC7495aj0.f72481a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean g(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0, Zi0 zi02) {
        synchronized (abstractC7495aj0) {
            try {
                if (abstractC7495aj0.f72483c != zi0) {
                    return false;
                }
                abstractC7495aj0.f72483c = zi02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
