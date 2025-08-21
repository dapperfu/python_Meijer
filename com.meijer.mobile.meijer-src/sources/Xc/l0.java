package Xc;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.c;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9427rg;
import com.google.android.gms.internal.ads.CN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41973a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f41974b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Context f41975c;

    /* renamed from: d, reason: collision with root package name */
    private final CN f41976d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f41977e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z10);
                Map map = this.f41973a;
                Boolean boolValueOf = Boolean.valueOf(z10);
                n0 n0Var = (n0) map.get(boolValueOf);
                int iA = 0;
                if (z11 && n0Var != null) {
                    try {
                        iA = n0Var.a() + 1;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                int i10 = iA;
                n0 n0Var2 = (n0) this.f41973a.get(boolValueOf);
                final m0 m0Var = new m0(this, z10, i10, n0Var2 == null ? null : Boolean.valueOf(n0Var2.f()), this.f41976d);
                final com.google.android.gms.ads.c cVarG = new c.a().b(AdMobAdapter.class, bundle).g();
                if (((Boolean) Oc.A.c().a(C8784lf.f77045Wa)).booleanValue()) {
                    this.f41977e.submit(new Callable() { // from class: Xc.k0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f41969a.a(cVarG, m0Var);
                        }
                    });
                } else {
                    Zc.a.a(this.f41975c, Gc.b.BANNER, cVarG, m0Var);
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized void b() {
        h(true);
        h(false);
    }

    final /* synthetic */ void c(boolean z10) throws Throwable {
        d(z10, false);
    }

    final synchronized void f(final boolean z10, n0 n0Var) {
        try {
            Map map = this.f41973a;
            Boolean boolValueOf = Boolean.valueOf(z10);
            n0 n0Var2 = (n0) map.get(boolValueOf);
            if (n0Var2 == null || n0Var2.e() || n0Var2.b() == null || n0Var.b() != null) {
                this.f41973a.put(boolValueOf, n0Var);
            }
            long jLongValue = (n0Var.b() != null ? (Long) C9427rg.f78892d.e() : (Long) C9427rg.f78893e.e()).longValue();
            final boolean z11 = n0Var.b() == null;
            C7033Kq.f69017d.schedule(new Runnable() { // from class: Xc.i0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f41960a.d(z10, z11);
                }
            }, jLongValue, TimeUnit.SECONDS);
            List list = (List) this.f41974b.get(boolValueOf);
            this.f41974b.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i(n0Var, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void g(final Object obj, Zc.b bVar) {
        final Pair pair = new Pair(bVar, Long.valueOf(Nc.v.c().a()));
        C7033Kq.f69019f.execute(new Runnable() { // from class: Xc.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f41955a.e(obj, pair);
            }
        });
    }

    private final void h(final boolean z10) {
        Map map = this.f41974b;
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.f41974b.put(boolValueOf, new ArrayList());
        this.f41977e.submit(new Runnable() { // from class: Xc.j0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f41966a.c(z10);
            }
        });
    }

    final /* synthetic */ Object a(com.google.android.gms.ads.c cVar, m0 m0Var) throws Exception {
        Zc.a.a(this.f41975c, Gc.b.BANNER, cVar, m0Var);
        return Boolean.TRUE;
    }

    final /* synthetic */ void e(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerA = Nc.v.u().a(this.f41975c);
            if (cookieManagerA != null) {
                zAcceptThirdPartyCookies = cookieManagerA.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f41973a;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        n0 n0Var = (n0) map.get(boolValueOf);
        if (n0Var != null && !n0Var.e()) {
            i(n0Var, pair, true);
            return;
        }
        List arrayList = (List) this.f41974b.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f41974b.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    l0(Context context, CN cn2, ExecutorService executorService) {
        this.f41975c = context;
        this.f41976d = cn2;
        this.f41977e = executorService;
    }

    private final void i(n0 n0Var, Pair pair, boolean z10) {
        boolean z11;
        n0Var.d();
        Zc.a aVarB = n0Var.b();
        if (aVarB != null) {
            ((Zc.b) pair.first).b(aVarB);
        } else {
            ((Zc.b) pair.first).a(n0Var.c());
        }
        CN cn2 = this.f41976d;
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", Gc.b.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(Nc.v.c().a() - ((Long) pair.second).longValue()));
        Pair pair7 = new Pair("sgpc_h", Boolean.toString(z10));
        if (n0Var.b() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C5569c.d(cn2, null, "sgpcr", pair2, pair3, pair4, pair5, pair6, pair7, new Pair("sgpc_rs", Boolean.toString(z11)));
    }
}
