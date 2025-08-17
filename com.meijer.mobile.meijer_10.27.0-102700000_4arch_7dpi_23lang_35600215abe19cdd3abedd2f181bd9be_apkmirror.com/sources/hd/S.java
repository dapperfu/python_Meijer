package hd;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.C6524f;
import com.google.android.gms.common.internal.C6534p;
import com.google.android.gms.common.internal.C6536s;
import com.google.android.gms.common.internal.C6537t;
import gd.C14243b;

/* loaded from: classes4.dex */
final class S implements InterfaceC5227e {

    /* renamed from: a, reason: collision with root package name */
    private final C14404e f134588a;

    /* renamed from: b, reason: collision with root package name */
    private final int f134589b;

    /* renamed from: c, reason: collision with root package name */
    private final C14401b f134590c;

    /* renamed from: d, reason: collision with root package name */
    private final long f134591d;

    /* renamed from: e, reason: collision with root package name */
    private final long f134592e;

    @Override // Td.InterfaceC5227e
    public final void onComplete(AbstractC5232j abstractC5232j) {
        H hS;
        int iK0;
        int i10;
        int i11;
        int iB;
        long j10;
        long j11;
        if (this.f134588a.d()) {
            C6537t c6537tA = C6536s.b().a();
            if ((c6537tA == null || c6537tA.c0()) && (hS = this.f134588a.s(this.f134590c)) != null && (hS.t() instanceof AbstractC6521c)) {
                AbstractC6521c abstractC6521c = (AbstractC6521c) hS.t();
                int i12 = 0;
                boolean zQ0 = this.f134591d > 0;
                int gCoreServiceId = abstractC6521c.getGCoreServiceId();
                int iC0 = 100;
                if (c6537tA != null) {
                    zQ0 &= c6537tA.q0();
                    int iB2 = c6537tA.B();
                    int iT = c6537tA.T();
                    iK0 = c6537tA.K0();
                    if (abstractC6521c.hasConnectionInfo() && !abstractC6521c.isConnecting()) {
                        C6524f c6524fB = b(hS, abstractC6521c, this.f134589b);
                        if (c6524fB == null) {
                            return;
                        }
                        boolean z10 = c6524fB.K0() && this.f134591d > 0;
                        iT = c6524fB.B();
                        zQ0 = z10;
                    }
                    i11 = iB2;
                    i10 = iT;
                } else {
                    iK0 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C14404e c14404e = this.f134588a;
                int iElapsedRealtime = -1;
                if (abstractC5232j.r()) {
                    iB = 0;
                } else if (abstractC5232j.p()) {
                    i12 = iC0;
                    iB = -1;
                } else {
                    Exception excM = abstractC5232j.m();
                    if (excM instanceof ApiException) {
                        Status statusA = ((ApiException) excM).a();
                        iC0 = statusA.c0();
                        C14243b c14243bB = statusA.B();
                        if (c14243bB != null) {
                            iB = c14243bB.B();
                            i12 = iC0;
                        }
                        i12 = iC0;
                        iB = -1;
                    } else {
                        i12 = 101;
                        iB = -1;
                    }
                }
                if (zQ0) {
                    long j12 = this.f134591d;
                    long j13 = this.f134592e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c14404e.E(new C6534p(this.f134589b, i12, iB, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iK0, i11, i10);
            }
        }
    }

    S(C14404e c14404e, int i10, C14401b c14401b, long j10, long j11, String str, String str2) {
        this.f134588a = c14404e;
        this.f134589b = i10;
        this.f134590c = c14401b;
        this.f134591d = j10;
        this.f134592e = j11;
    }

    static S a(C14404e c14404e, int i10, C14401b c14401b) {
        boolean zQ0;
        long jCurrentTimeMillis;
        if (c14404e.d()) {
            C6537t c6537tA = C6536s.b().a();
            if (c6537tA != null) {
                if (c6537tA.c0()) {
                    zQ0 = c6537tA.q0();
                    H hS = c14404e.s(c14401b);
                    if (hS != null) {
                        if (hS.t() instanceof AbstractC6521c) {
                            AbstractC6521c abstractC6521c = (AbstractC6521c) hS.t();
                            if (abstractC6521c.hasConnectionInfo() && !abstractC6521c.isConnecting()) {
                                C6524f c6524fB = b(hS, abstractC6521c, i10);
                                if (c6524fB != null) {
                                    hS.E();
                                    zQ0 = c6524fB.K0();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                zQ0 = true;
            }
            long jElapsedRealtime = 0;
            if (zQ0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
            if (zQ0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            return new S(c14404e, i10, c14401b, jCurrentTimeMillis, jElapsedRealtime, null, null);
        }
        return null;
    }

    private static C6524f b(H h10, AbstractC6521c abstractC6521c, int i10) {
        int[] iArrT;
        int[] iArrC0;
        C6524f telemetryConfiguration = abstractC6521c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.q0() || ((iArrT = telemetryConfiguration.T()) != null ? !com.google.android.gms.common.util.b.a(iArrT, i10) : !((iArrC0 = telemetryConfiguration.c0()) == null || !com.google.android.gms.common.util.b.a(iArrC0, i10))) || h10.q() >= telemetryConfiguration.B()) {
            return null;
        }
        return telemetryConfiguration;
    }
}
