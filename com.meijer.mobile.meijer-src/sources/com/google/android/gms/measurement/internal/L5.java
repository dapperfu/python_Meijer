package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes6.dex */
final class L5 {

    /* renamed from: a, reason: collision with root package name */
    protected long f85942a;

    /* renamed from: b, reason: collision with root package name */
    protected long f85943b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC11388x f85944c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ N5 f85945d;

    final void a(long j10) {
        this.f85945d.f();
        this.f85944c.d();
        this.f85942a = j10;
        this.f85943b = j10;
    }

    final void b(long j10) {
        this.f85944c.d();
    }

    final void c() {
        this.f85944c.d();
        long jC = this.f85945d.f85708a.zzaZ().c();
        this.f85942a = jC;
        this.f85943b = jC;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        N5 n52 = this.f85945d;
        n52.f();
        n52.h();
        if (n52.f85708a.e()) {
            X2 x22 = n52.f85708a;
            x22.v().f85825q.b(x22.zzaZ().a());
        }
        long j11 = j10 - this.f85942a;
        if (!z10 && j11 < 1000) {
            n52.f85708a.a().u().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f85943b;
            this.f85943b = j10;
        }
        X2 x23 = n52.f85708a;
        x23.a().u().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !x23.u().L();
        X2 x24 = n52.f85708a;
        z6.i0(x24.G().o(z12), bundle, true);
        if (!z11) {
            x24.z().r(CameraSettings.FOCUS_STRATEGY_AUTO, "_e", bundle);
        }
        this.f85942a = j10;
        AbstractC11388x abstractC11388x = this.f85944c;
        abstractC11388x.d();
        abstractC11388x.b(((Long) C11245d2.f86337r0.b(null)).longValue());
        return true;
    }

    public L5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f85945d = n52;
        this.f85944c = new J5(this, n52.f85708a);
        long jC = n52.f85708a.zzaZ().c();
        this.f85942a = jC;
        this.f85943b = jC;
    }
}
