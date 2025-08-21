package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.U6;

/* renamed from: com.google.android.gms.internal.pal.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10737b7 extends V6 {
    /* synthetic */ C10737b7(U6.a aVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final Y6 a(U6 u62, Y6 y62) {
        Y6 y63;
        synchronized (u62) {
            try {
                y63 = u62.f83748b;
                if (y63 != y62) {
                    u62.f83748b = y62;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y63;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final C10805f7 b(U6 u62, C10805f7 c10805f7) {
        C10805f7 c10805f72;
        synchronized (u62) {
            try {
                c10805f72 = u62.f83749c;
                if (c10805f72 != c10805f7) {
                    u62.f83749c = c10805f7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10805f72;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void c(C10805f7 c10805f7, C10805f7 c10805f72) {
        c10805f7.f83965b = c10805f72;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void d(C10805f7 c10805f7, Thread thread) {
        c10805f7.f83964a = thread;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean e(U6 u62, Object obj, Object obj2) {
        synchronized (u62) {
            try {
                if (u62.f83747a != obj) {
                    return false;
                }
                u62.f83747a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean f(U6 u62, C10805f7 c10805f7, C10805f7 c10805f72) {
        synchronized (u62) {
            try {
                if (u62.f83749c != c10805f7) {
                    return false;
                }
                u62.f83749c = c10805f72;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
