package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC10632r0;

/* loaded from: classes6.dex */
public final class N5 extends AbstractC11261f2 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f85974c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85975d;

    /* renamed from: e, reason: collision with root package name */
    protected final M5 f85976e;

    /* renamed from: f, reason: collision with root package name */
    protected final L5 f85977f;

    /* renamed from: g, reason: collision with root package name */
    protected final I5 f85978g;

    @Override // com.google.android.gms.measurement.internal.AbstractC11261f2
    protected final boolean k() {
        return false;
    }

    final /* synthetic */ Handler r() {
        return this.f85974c;
    }

    N5(X2 x22) {
        super(x22);
        this.f85975d = true;
        this.f85976e = new M5(this);
        this.f85977f = new L5(this);
        this.f85978g = new I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void o() {
        f();
        if (this.f85974c == null) {
            this.f85974c = new HandlerC10632r0(Looper.getMainLooper());
        }
    }

    final void m(boolean z10) {
        f();
        this.f85975d = z10;
    }

    final boolean n() {
        f();
        return this.f85975d;
    }

    final /* synthetic */ void p(long j10) {
        f();
        o();
        X2 x22 = this.f85708a;
        x22.a().u().b("Activity resumed, time", Long.valueOf(j10));
        if (x22.u().F(null, C11245d2.f86281V0)) {
            if (x22.u().L() || this.f85975d) {
                this.f85977f.a(j10);
            }
        } else if (x22.u().L() || x22.v().f85828t.a()) {
            this.f85977f.a(j10);
        }
        this.f85978g.a();
        M5 m52 = this.f85976e;
        N5 n52 = m52.f85962a;
        n52.f();
        if (!n52.f85708a.e()) {
            return;
        }
        m52.b(n52.f85708a.zzaZ().a(), false);
    }

    final /* synthetic */ void q(long j10) {
        f();
        o();
        X2 x22 = this.f85708a;
        x22.a().u().b("Activity paused, time", Long.valueOf(j10));
        this.f85978g.b(j10);
        if (x22.u().L()) {
            this.f85977f.b(j10);
        }
    }
}
