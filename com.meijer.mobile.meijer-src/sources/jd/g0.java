package jd;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C6648e;
import id.C14719b;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g0 extends Td.d implements e.a, e.b {

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC1266a f140330h = Sd.e.f34540c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f140331a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f140332b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC1266a f140333c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f140334d;

    /* renamed from: e, reason: collision with root package name */
    private final C6648e f140335e;

    /* renamed from: f, reason: collision with root package name */
    private Sd.f f140336f;

    /* renamed from: g, reason: collision with root package name */
    private f0 f140337g;

    public g0(Context context, Handler handler, C6648e c6648e) {
        a.AbstractC1266a abstractC1266a = f140330h;
        this.f140331a = context;
        this.f140332b = handler;
        this.f140335e = (C6648e) com.google.android.gms.common.internal.r.m(c6648e, "ClientSettings must not be null");
        this.f140334d = c6648e.e();
        this.f140333c = abstractC1266a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Sd.f, com.google.android.gms.common.api.a$f] */
    public final void I2(f0 f0Var) {
        Sd.f fVar = this.f140336f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f140335e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC1266a abstractC1266a = this.f140333c;
        Context context = this.f140331a;
        Handler handler = this.f140332b;
        C6648e c6648e = this.f140335e;
        this.f140336f = abstractC1266a.buildClient(context, handler.getLooper(), c6648e, (C6648e) c6648e.f(), (e.a) this, (e.b) this);
        this.f140337g = f0Var;
        Set set = this.f140334d;
        if (set == null || set.isEmpty()) {
            this.f140332b.post(new d0(this));
        } else {
            this.f140336f.a();
        }
    }

    @Override // Td.f
    public final void Q4(Td.l lVar) {
        this.f140332b.post(new e0(this, lVar));
    }

    public final void Z3() {
        Sd.f fVar = this.f140336f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // jd.InterfaceC14981d
    public final void onConnected(Bundle bundle) {
        this.f140336f.b(this);
    }

    @Override // jd.InterfaceC14990m
    public final void onConnectionFailed(C14719b c14719b) {
        this.f140337g.c(c14719b);
    }

    @Override // jd.InterfaceC14981d
    public final void onConnectionSuspended(int i10) {
        this.f140337g.d(i10);
    }

    static /* bridge */ /* synthetic */ void c2(g0 g0Var, Td.l lVar) {
        C14719b c14719bB = lVar.B();
        if (c14719bB.I0()) {
            com.google.android.gms.common.internal.O o10 = (com.google.android.gms.common.internal.O) com.google.android.gms.common.internal.r.l(lVar.T());
            C14719b c14719bB2 = o10.B();
            if (!c14719bB2.I0()) {
                String strValueOf = String.valueOf(c14719bB2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                g0Var.f140337g.c(c14719bB2);
                g0Var.f140336f.disconnect();
                return;
            }
            g0Var.f140337g.a(o10.T(), g0Var.f140334d);
        } else {
            g0Var.f140337g.c(c14719bB);
        }
        g0Var.f140336f.disconnect();
    }
}
