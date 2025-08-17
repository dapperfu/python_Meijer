package com.google.android.gms.internal.ads;

import Mc.C4169y;
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
import qd.C16519f;

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6568Aq {

    /* renamed from: a, reason: collision with root package name */
    private final Object f65188a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Pc.u0 f65189b;

    /* renamed from: c, reason: collision with root package name */
    private final C6704Eq f65190c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f65191d;

    /* renamed from: e, reason: collision with root package name */
    private Context f65192e;

    /* renamed from: f, reason: collision with root package name */
    private Qc.a f65193f;

    /* renamed from: g, reason: collision with root package name */
    private String f65194g;

    /* renamed from: h, reason: collision with root package name */
    private C9194qf f65195h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f65196i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f65197j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f65198k;

    /* renamed from: l, reason: collision with root package name */
    private final C10071yq f65199l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f65200m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.common.util.concurrent.q f65201n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f65202o;

    public final void A(String str) {
        this.f65194g = str;
    }

    public final Context e() {
        return this.f65192e;
    }

    public final C6704Eq i() {
        return this.f65190c;
    }

    public final String o() {
        return this.f65194g;
    }

    public final int b() {
        return this.f65198k.get();
    }

    public final int c() {
        return this.f65197j.get();
    }

    public final Resources f() {
        if (this.f65193f.f29932d) {
            return this.f65192e.getResources();
        }
        try {
            if (((Boolean) Mc.A.c().a(C8659lf.f76065Ma)).booleanValue()) {
                return Qc.s.a(this.f65192e).getResources();
            }
            Qc.s.a(this.f65192e).getResources();
            return null;
        } catch (zzr e10) {
            Qc.p.h("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final C9194qf h() {
        C9194qf c9194qf;
        synchronized (this.f65188a) {
            c9194qf = this.f65195h;
        }
        return c9194qf;
    }

    public final Pc.r0 j() {
        Pc.u0 u0Var;
        synchronized (this.f65188a) {
            u0Var = this.f65189b;
        }
        return u0Var;
    }

    public final com.google.common.util.concurrent.q l() {
        if (this.f65192e != null) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76197W2)).booleanValue()) {
                synchronized (this.f65200m) {
                    try {
                        com.google.common.util.concurrent.q qVar = this.f65201n;
                        if (qVar != null) {
                            return qVar;
                        }
                        com.google.common.util.concurrent.q qVarI0 = C6908Kq.f68174a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.vq
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f79140a.p();
                            }
                        });
                        this.f65201n = qVarI0;
                        return qVarI0;
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
        synchronized (this.f65188a) {
            bool = this.f65196i;
        }
        return bool;
    }

    final /* synthetic */ ArrayList p() throws Exception {
        Context contextA = C6770Go.a(this.f65192e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = C16519f.a(contextA).f(contextA.getApplicationInfo().packageName, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
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
        this.f65199l.a();
    }

    public final void s() {
        this.f65197j.decrementAndGet();
    }

    public final void t() {
        this.f65198k.incrementAndGet();
    }

    public final void u() {
        this.f65197j.incrementAndGet();
    }

    @TargetApi(23)
    public final void v(Context context, Qc.a aVar) {
        C9194qf c9194qf;
        synchronized (this.f65188a) {
            try {
                if (!this.f65191d) {
                    this.f65192e = context.getApplicationContext();
                    this.f65193f = aVar;
                    Lc.v.e().c(this.f65190c);
                    this.f65189b.z(this.f65192e);
                    C7142Rn.d(this.f65192e, this.f65193f);
                    Lc.v.h();
                    if (((Boolean) Mc.A.c().a(C8659lf.f76322f2)).booleanValue()) {
                        c9194qf = new C9194qf();
                    } else {
                        Pc.p0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        c9194qf = null;
                    }
                    this.f65195h = c9194qf;
                    if (c9194qf != null) {
                        C7009Nq.a(new C9857wq(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f65192e;
                    if (com.google.android.gms.common.util.n.g()) {
                        if (((Boolean) Mc.A.c().a(C8659lf.f76440n8)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new C9964xq(this));
                            } catch (RuntimeException e10) {
                                Qc.p.h("Failed to register network callback", e10);
                                this.f65202o.set(true);
                            }
                        }
                    }
                    this.f65191d = true;
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Lc.v.t().H(context, aVar.f29929a);
    }

    public final void w(Throwable th2, String str) {
        C7142Rn.d(this.f65192e, this.f65193f).a(th2, str, ((Double) C9730vg.f79109g.e()).floatValue());
    }

    public final void x(Throwable th2, String str) {
        C7142Rn.d(this.f65192e, this.f65193f).b(th2, str);
    }

    public final void y(Throwable th2, String str) {
        C7142Rn.f(this.f65192e, this.f65193f).b(th2, str);
    }

    public final void z(Boolean bool) {
        synchronized (this.f65188a) {
            this.f65196i = bool;
        }
    }

    public C6568Aq() {
        Pc.u0 u0Var = new Pc.u0();
        this.f65189b = u0Var;
        this.f65190c = new C6704Eq(C4169y.d(), u0Var);
        this.f65191d = false;
        this.f65195h = null;
        this.f65196i = null;
        this.f65197j = new AtomicInteger(0);
        this.f65198k = new AtomicInteger(0);
        this.f65199l = new C10071yq(null);
        this.f65200m = new Object();
        this.f65202o = new AtomicBoolean();
    }

    public final boolean a(Context context) {
        if (com.google.android.gms.common.util.n.g()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76440n8)).booleanValue()) {
                return this.f65202o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
