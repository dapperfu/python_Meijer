package jd;

import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.C6649f;
import com.google.android.gms.common.internal.C6659p;
import com.google.android.gms.common.internal.C6661s;
import com.google.android.gms.common.internal.C6662t;
import id.C14719b;

/* loaded from: classes4.dex */
final class S implements InterfaceC5511e {

    /* renamed from: a, reason: collision with root package name */
    private final C14982e f140277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f140278b;

    /* renamed from: c, reason: collision with root package name */
    private final C14979b f140279c;

    /* renamed from: d, reason: collision with root package name */
    private final long f140280d;

    /* renamed from: e, reason: collision with root package name */
    private final long f140281e;

    @Override // Vd.InterfaceC5511e
    public final void onComplete(AbstractC5516j abstractC5516j) {
        H hS;
        int iI0;
        int i10;
        int i11;
        int iB;
        long j10;
        long j11;
        if (this.f140277a.d()) {
            C6662t c6662tA = C6661s.b().a();
            if ((c6662tA == null || c6662tA.b0()) && (hS = this.f140277a.s(this.f140279c)) != null && (hS.t() instanceof AbstractC6646c)) {
                AbstractC6646c abstractC6646c = (AbstractC6646c) hS.t();
                int i12 = 0;
                boolean zR0 = this.f140280d > 0;
                int gCoreServiceId = abstractC6646c.getGCoreServiceId();
                int iB0 = 100;
                if (c6662tA != null) {
                    zR0 &= c6662tA.r0();
                    int iB2 = c6662tA.B();
                    int iT = c6662tA.T();
                    iI0 = c6662tA.I0();
                    if (abstractC6646c.hasConnectionInfo() && !abstractC6646c.isConnecting()) {
                        C6649f c6649fB = b(hS, abstractC6646c, this.f140278b);
                        if (c6649fB == null) {
                            return;
                        }
                        boolean z10 = c6649fB.I0() && this.f140280d > 0;
                        iT = c6649fB.B();
                        zR0 = z10;
                    }
                    i11 = iB2;
                    i10 = iT;
                } else {
                    iI0 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C14982e c14982e = this.f140277a;
                int iElapsedRealtime = -1;
                if (abstractC5516j.r()) {
                    iB = 0;
                } else if (abstractC5516j.p()) {
                    i12 = iB0;
                    iB = -1;
                } else {
                    Exception excM = abstractC5516j.m();
                    if (excM instanceof ApiException) {
                        Status statusA = ((ApiException) excM).a();
                        iB0 = statusA.b0();
                        C14719b c14719bB = statusA.B();
                        if (c14719bB != null) {
                            iB = c14719bB.B();
                            i12 = iB0;
                        }
                        i12 = iB0;
                        iB = -1;
                    } else {
                        i12 = 101;
                        iB = -1;
                    }
                }
                if (zR0) {
                    long j12 = this.f140280d;
                    long j13 = this.f140281e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c14982e.E(new C6659p(this.f140278b, i12, iB, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iI0, i11, i10);
            }
        }
    }

    S(C14982e c14982e, int i10, C14979b c14979b, long j10, long j11, String str, String str2) {
        this.f140277a = c14982e;
        this.f140278b = i10;
        this.f140279c = c14979b;
        this.f140280d = j10;
        this.f140281e = j11;
    }

    static S a(C14982e c14982e, int i10, C14979b c14979b) {
        boolean zR0;
        long jCurrentTimeMillis;
        if (c14982e.d()) {
            C6662t c6662tA = C6661s.b().a();
            if (c6662tA != null) {
                if (c6662tA.b0()) {
                    zR0 = c6662tA.r0();
                    H hS = c14982e.s(c14979b);
                    if (hS != null) {
                        if (hS.t() instanceof AbstractC6646c) {
                            AbstractC6646c abstractC6646c = (AbstractC6646c) hS.t();
                            if (abstractC6646c.hasConnectionInfo() && !abstractC6646c.isConnecting()) {
                                C6649f c6649fB = b(hS, abstractC6646c, i10);
                                if (c6649fB != null) {
                                    hS.E();
                                    zR0 = c6649fB.I0();
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
                zR0 = true;
            }
            long jElapsedRealtime = 0;
            if (zR0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
            if (zR0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            return new S(c14982e, i10, c14979b, jCurrentTimeMillis, jElapsedRealtime, null, null);
        }
        return null;
    }

    private static C6649f b(H h10, AbstractC6646c abstractC6646c, int i10) {
        int[] iArrT;
        int[] iArrB0;
        C6649f telemetryConfiguration = abstractC6646c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.r0() || ((iArrT = telemetryConfiguration.T()) != null ? !com.google.android.gms.common.util.b.a(iArrT, i10) : !((iArrB0 = telemetryConfiguration.b0()) == null || !com.google.android.gms.common.util.b.a(iArrB0, i10))) || h10.q() >= telemetryConfiguration.B()) {
            return null;
        }
        return telemetryConfiguration;
    }
}
