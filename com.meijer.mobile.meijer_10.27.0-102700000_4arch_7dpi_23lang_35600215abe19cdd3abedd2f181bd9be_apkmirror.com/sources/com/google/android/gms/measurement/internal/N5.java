package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC10507r0;

/* loaded from: classes6.dex */
public final class N5 extends AbstractC11136f2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f85134c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85135d;

    /* renamed from: e, reason: collision with root package name */
    protected final M5 f85136e;

    /* renamed from: f, reason: collision with root package name */
    protected final L5 f85137f;

    /* renamed from: g, reason: collision with root package name */
    protected final I5 f85138g;

    @Override // com.google.android.gms.measurement.internal.AbstractC11136f2
    protected final boolean k() {
        return false;
    }

    final /* synthetic */ Handler r() {
        return this.f85134c;
    }

    N5(X2 x22) {
        super(x22);
        this.f85135d = true;
        this.f85136e = new M5(this);
        this.f85137f = new L5(this);
        this.f85138g = new I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void o() {
        f();
        if (this.f85134c == null) {
            this.f85134c = new HandlerC10507r0(Looper.getMainLooper());
        }
    }

    final void m(boolean z10) {
        f();
        this.f85135d = z10;
    }

    final boolean n() {
        f();
        return this.f85135d;
    }

    final /* synthetic */ void p(long j10) {
        f();
        o();
        X2 x22 = this.f84868a;
        x22.a().u().b("Activity resumed, time", Long.valueOf(j10));
        if (x22.u().F(null, C11120d2.f85441V0)) {
            if (x22.u().L() || this.f85135d) {
                this.f85137f.a(j10);
            }
        } else if (x22.u().L() || x22.v().f84988t.a()) {
            this.f85137f.a(j10);
        }
        this.f85138g.a();
        M5 m52 = this.f85136e;
        N5 n52 = m52.f85122a;
        n52.f();
        if (!n52.f84868a.e()) {
            return;
        }
        m52.b(n52.f84868a.zzaZ().a(), false);
    }

    final /* synthetic */ void q(long j10) {
        f();
        o();
        X2 x22 = this.f84868a;
        x22.a().u().b("Activity paused, time", Long.valueOf(j10));
        this.f85138g.b(j10);
        if (x22.u().L()) {
            this.f85137f.b(j10);
        }
    }
}
