package hd;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6523e;
import gd.C14243b;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g0 extends Rd.d implements e.a, e.b {

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC1257a f134641h = Qd.e.f29990c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f134642a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f134643b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC1257a f134644c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f134645d;

    /* renamed from: e, reason: collision with root package name */
    private final C6523e f134646e;

    /* renamed from: f, reason: collision with root package name */
    private Qd.f f134647f;

    /* renamed from: g, reason: collision with root package name */
    private f0 f134648g;

    public g0(Context context, Handler handler, C6523e c6523e) {
        a.AbstractC1257a abstractC1257a = f134641h;
        this.f134642a = context;
        this.f134643b = handler;
        this.f134646e = (C6523e) com.google.android.gms.common.internal.r.m(c6523e, "ClientSettings must not be null");
        this.f134645d = c6523e.e();
        this.f134644c = abstractC1257a;
    }

    @Override // Rd.f
    public final void A5(Rd.l lVar) {
        this.f134643b.post(new e0(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Qd.f, com.google.android.gms.common.api.a$f] */
    public final void F2(f0 f0Var) {
        Qd.f fVar = this.f134647f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f134646e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC1257a abstractC1257a = this.f134644c;
        Context context = this.f134642a;
        Handler handler = this.f134643b;
        C6523e c6523e = this.f134646e;
        this.f134647f = abstractC1257a.buildClient(context, handler.getLooper(), c6523e, (C6523e) c6523e.f(), (e.a) this, (e.b) this);
        this.f134648g = f0Var;
        Set set = this.f134645d;
        if (set == null || set.isEmpty()) {
            this.f134643b.post(new d0(this));
        } else {
            this.f134647f.b();
        }
    }

    public final void N3() {
        Qd.f fVar = this.f134647f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // hd.InterfaceC14403d
    public final void onConnected(Bundle bundle) {
        this.f134647f.a(this);
    }

    @Override // hd.InterfaceC14412m
    public final void onConnectionFailed(C14243b c14243b) {
        this.f134648g.a(c14243b);
    }

    @Override // hd.InterfaceC14403d
    public final void onConnectionSuspended(int i10) {
        this.f134648g.d(i10);
    }

    static /* bridge */ /* synthetic */ void b2(g0 g0Var, Rd.l lVar) {
        C14243b c14243bB = lVar.B();
        if (c14243bB.K0()) {
            com.google.android.gms.common.internal.O o10 = (com.google.android.gms.common.internal.O) com.google.android.gms.common.internal.r.l(lVar.T());
            C14243b c14243bB2 = o10.B();
            if (!c14243bB2.K0()) {
                String strValueOf = String.valueOf(c14243bB2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                g0Var.f134648g.a(c14243bB2);
                g0Var.f134647f.disconnect();
                return;
            }
            g0Var.f134648g.c(o10.T(), g0Var.f134645d);
        } else {
            g0Var.f134648g.a(c14243bB);
        }
        g0Var.f134647f.disconnect();
    }
}
