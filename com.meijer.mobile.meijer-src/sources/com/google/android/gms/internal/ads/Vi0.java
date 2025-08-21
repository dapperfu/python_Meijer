package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Vi0 extends Pi0 {
    /* synthetic */ Vi0(C8046ej0 c8046ej0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Si0 a(AbstractC7620aj0 abstractC7620aj0, Si0 si0) {
        Si0 si02;
        synchronized (abstractC7620aj0) {
            try {
                si02 = abstractC7620aj0.f73322b;
                if (si02 != si0) {
                    abstractC7620aj0.f73322b = si0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return si02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Zi0 b(AbstractC7620aj0 abstractC7620aj0, Zi0 zi0) {
        Zi0 zi02;
        synchronized (abstractC7620aj0) {
            try {
                zi02 = abstractC7620aj0.f73323c;
                if (zi02 != zi0) {
                    abstractC7620aj0.f73323c = zi0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zi02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void c(Zi0 zi0, Zi0 zi02) {
        zi0.f73075b = zi02;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void d(Zi0 zi0, Thread thread) {
        zi0.f73074a = thread;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean e(AbstractC7620aj0 abstractC7620aj0, Si0 si0, Si0 si02) {
        synchronized (abstractC7620aj0) {
            try {
                if (abstractC7620aj0.f73322b != si0) {
                    return false;
                }
                abstractC7620aj0.f73322b = si02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean f(AbstractC7620aj0 abstractC7620aj0, Object obj, Object obj2) {
        synchronized (abstractC7620aj0) {
            try {
                if (abstractC7620aj0.f73321a != obj) {
                    return false;
                }
                abstractC7620aj0.f73321a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean g(AbstractC7620aj0 abstractC7620aj0, Zi0 zi0, Zi0 zi02) {
        synchronized (abstractC7620aj0) {
            try {
                if (abstractC7620aj0.f73323c != zi0) {
                    return false;
                }
                abstractC7620aj0.f73323c = zi02;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
