package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.U6;

/* renamed from: com.google.android.gms.internal.pal.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10612b7 extends V6 {
    /* synthetic */ C10612b7(U6.a aVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final Y6 a(U6 u62, Y6 y62) {
        Y6 y63;
        synchronized (u62) {
            try {
                y63 = u62.f82908b;
                if (y63 != y62) {
                    u62.f82908b = y62;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y63;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final C10680f7 b(U6 u62, C10680f7 c10680f7) {
        C10680f7 c10680f72;
        synchronized (u62) {
            try {
                c10680f72 = u62.f82909c;
                if (c10680f72 != c10680f7) {
                    u62.f82909c = c10680f7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10680f72;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void c(C10680f7 c10680f7, C10680f7 c10680f72) {
        c10680f7.f83125b = c10680f72;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void d(C10680f7 c10680f7, Thread thread) {
        c10680f7.f83124a = thread;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean e(U6 u62, Object obj, Object obj2) {
        synchronized (u62) {
            try {
                if (u62.f82907a != obj) {
                    return false;
                }
                u62.f82907a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean f(U6 u62, C10680f7 c10680f7, C10680f7 c10680f72) {
        synchronized (u62) {
            try {
                if (u62.f82909c != c10680f7) {
                    return false;
                }
                u62.f82909c = c10680f72;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
