package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sd.C17067f;

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6693Aq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f66028a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Rc.u0 f66029b;

    /* renamed from: c, reason: collision with root package name */
    private final C6829Eq f66030c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f66031d;

    /* renamed from: e, reason: collision with root package name */
    private Context f66032e;

    /* renamed from: f, reason: collision with root package name */
    private Sc.a f66033f;

    /* renamed from: g, reason: collision with root package name */
    private String f66034g;

    /* renamed from: h, reason: collision with root package name */
    private C9319qf f66035h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f66036i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f66037j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f66038k;

    /* renamed from: l, reason: collision with root package name */
    private final C10196yq f66039l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f66040m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.common.util.concurrent.q f66041n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f66042o;

    public final void A(String str) {
        this.f66034g = str;
    }

    public final Context e() {
        return this.f66032e;
    }

    public final C6829Eq i() {
        return this.f66030c;
    }

    public final String o() {
        return this.f66034g;
    }

    public final int b() {
        return this.f66038k.get();
    }

    public final int c() {
        return this.f66037j.get();
    }

    public final Resources f() {
        if (this.f66033f.f34482d) {
            return this.f66032e.getResources();
        }
        try {
            if (((Boolean) Oc.A.c().a(C8784lf.f76905Ma)).booleanValue()) {
                return Sc.s.a(this.f66032e).getResources();
            }
            Sc.s.a(this.f66032e).getResources();
            return null;
        } catch (zzr e10) {
            Sc.p.h("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final C9319qf h() {
        C9319qf c9319qf;
        synchronized (this.f66028a) {
            c9319qf = this.f66035h;
        }
        return c9319qf;
    }

    public final Rc.r0 j() {
        Rc.u0 u0Var;
        synchronized (this.f66028a) {
            u0Var = this.f66029b;
        }
        return u0Var;
    }

    public final com.google.common.util.concurrent.q l() {
        if (this.f66032e != null) {
            if (!((Boolean) Oc.A.c().a(C8784lf.f77037W2)).booleanValue()) {
                synchronized (this.f66040m) {
                    try {
                        com.google.common.util.concurrent.q qVar = this.f66041n;
                        if (qVar != null) {
                            return qVar;
                        }
                        com.google.common.util.concurrent.q qVarK0 = C7033Kq.f69014a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.vq
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f79980a.p();
                            }
                        });
                        this.f66041n = qVarK0;
                        return qVarK0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return Mj0.h(new ArrayList());
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.f66028a) {
            bool = this.f66036i;
        }
        return bool;
    }

    final /* synthetic */ ArrayList p() throws Exception {
        Context contextA = C6895Go.a(this.f66032e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = C17067f.a(contextA).f(contextA.getApplicationInfo().packageName, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void r() {
        this.f66039l.a();
    }

    public final void s() {
        this.f66037j.decrementAndGet();
    }

    public final void t() {
        this.f66038k.incrementAndGet();
    }

    public final void u() {
        this.f66037j.incrementAndGet();
    }

    @TargetApi(23)
    public final void v(Context context, Sc.a aVar) {
        C9319qf c9319qf;
        synchronized (this.f66028a) {
            try {
                if (!this.f66031d) {
                    this.f66032e = context.getApplicationContext();
                    this.f66033f = aVar;
                    Nc.v.e().c(this.f66030c);
                    this.f66029b.z(this.f66032e);
                    C7267Rn.d(this.f66032e, this.f66033f);
                    Nc.v.h();
                    if (((Boolean) Oc.A.c().a(C8784lf.f77162f2)).booleanValue()) {
                        c9319qf = new C9319qf();
                    } else {
                        Rc.p0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c9319qf = null;
                    }
                    this.f66035h = c9319qf;
                    if (c9319qf != null) {
                        C7134Nq.a(new C9982wq(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f66032e;
                    if (com.google.android.gms.common.util.n.g()) {
                        if (((Boolean) Oc.A.c().a(C8784lf.f77280n8)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new C10089xq(this));
                            } catch (RuntimeException e10) {
                                Sc.p.h("Failed to register network callback", e10);
                                this.f66042o.set(true);
                            }
                        }
                    }
                    this.f66031d = true;
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Nc.v.t().H(context, aVar.f34479a);
    }

    public final void w(Throwable th2, String str) {
        C7267Rn.d(this.f66032e, this.f66033f).a(th2, str, ((Double) C9855vg.f79949g.e()).floatValue());
    }

    public final void x(Throwable th2, String str) {
        C7267Rn.d(this.f66032e, this.f66033f).b(th2, str);
    }

    public final void y(Throwable th2, String str) {
        C7267Rn.f(this.f66032e, this.f66033f).b(th2, str);
    }

    public final void z(Boolean bool) {
        synchronized (this.f66028a) {
            this.f66036i = bool;
        }
    }

    public C6693Aq() {
        Rc.u0 u0Var = new Rc.u0();
        this.f66029b = u0Var;
        this.f66030c = new C6829Eq(C4447y.d(), u0Var);
        this.f66031d = false;
        this.f66035h = null;
        this.f66036i = null;
        this.f66037j = new AtomicInteger(0);
        this.f66038k = new AtomicInteger(0);
        this.f66039l = new C10196yq(null);
        this.f66040m = new Object();
        this.f66042o = new AtomicBoolean();
    }

    public final boolean a(Context context) {
        if (com.google.android.gms.common.util.n.g()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77280n8)).booleanValue()) {
                return this.f66042o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
