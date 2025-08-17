package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes6.dex */
final class L5 {

    /* renamed from: a, reason: collision with root package name */
    protected long f85102a;

    /* renamed from: b, reason: collision with root package name */
    protected long f85103b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC11263x f85104c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ N5 f85105d;

    final void a(long j10) {
        this.f85105d.f();
        this.f85104c.d();
        this.f85102a = j10;
        this.f85103b = j10;
    }

    final void b(long j10) {
        this.f85104c.d();
    }

    final void c() {
        this.f85104c.d();
        long jC = this.f85105d.f84868a.zzaZ().c();
        this.f85102a = jC;
        this.f85103b = jC;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        N5 n52 = this.f85105d;
        n52.f();
        n52.h();
        if (n52.f84868a.e()) {
            X2 x22 = n52.f84868a;
            x22.v().f84985q.b(x22.zzaZ().a());
        }
        long j11 = j10 - this.f85102a;
        if (!z10 && j11 < 1000) {
            n52.f84868a.a().u().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f85103b;
            this.f85103b = j10;
        }
        X2 x23 = n52.f84868a;
        x23.a().u().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !x23.u().L();
        X2 x24 = n52.f84868a;
        z6.i0(x24.G().o(z12), bundle, true);
        if (!z11) {
            x24.z().r(CameraSettings.FOCUS_STRATEGY_AUTO, "_e", bundle);
        }
        this.f85102a = j10;
        AbstractC11263x abstractC11263x = this.f85104c;
        abstractC11263x.d();
        abstractC11263x.b(((Long) C11120d2.f85497r0.b(null)).longValue());
        return true;
    }

    public L5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f85105d = n52;
        this.f85104c = new J5(this, n52.f84868a);
        long jC = n52.f84868a.zzaZ().c();
        this.f85102a = jC;
        this.f85103b = jC;
    }
}
