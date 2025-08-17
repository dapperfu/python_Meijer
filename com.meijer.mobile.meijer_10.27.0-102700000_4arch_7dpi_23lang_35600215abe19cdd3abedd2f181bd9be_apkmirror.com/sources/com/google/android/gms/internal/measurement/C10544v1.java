package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10544v1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C10544v1 f82433j;

    /* renamed from: a, reason: collision with root package name */
    private final String f82434a = "FA";

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.f f82435b = com.google.android.gms.common.util.i.d();

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f82436c;

    /* renamed from: d, reason: collision with root package name */
    private final Nd.a f82437d;

    /* renamed from: e, reason: collision with root package name */
    private final List f82438e;

    /* renamed from: f, reason: collision with root package name */
    private int f82439f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f82440g;

    /* renamed from: h, reason: collision with root package name */
    private final String f82441h;

    /* renamed from: i, reason: collision with root package name */
    private volatile InterfaceC10543v0 f82442i;

    public final String g() {
        return this.f82441h;
    }

    final /* synthetic */ String k() {
        return this.f82434a;
    }

    final /* synthetic */ boolean l() {
        return this.f82440g;
    }

    final /* synthetic */ InterfaceC10543v0 m() {
        return this.f82442i;
    }

    final /* synthetic */ void n(InterfaceC10543v0 interfaceC10543v0) {
        this.f82442i = interfaceC10543v0;
    }

    public final void v(String str, Bundle bundle) {
        q(null, str, bundle, false, true, null);
    }

    public final void w(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i(AbstractRunnableC10446k1 abstractRunnableC10446k1) {
        this.f82436c.execute(abstractRunnableC10446k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(Exception exc, boolean z10, boolean z11) {
        C10544v1 c10544v1;
        Exception exc2;
        this.f82440g |= z10;
        if (z10) {
            FS.log_w(this.f82434a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c10544v1 = this;
            exc2 = exc;
            c10544v1.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c10544v1 = this;
            exc2 = exc;
        }
        FS.log_w(c10544v1.f82434a, "Error with data collection. Data lost.", exc2);
    }

    private final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        i(new C10437j1(this, l10, str, str2, bundle, z10, z11));
    }

    public final List A(String str, String str2) {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new O0(this, str, str2, binderC10516s0));
        List list = (List) BinderC10516s0.N3(binderC10516s0.F2(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void B(String str) {
        i(new P0(this, str));
    }

    public final void C(J0 j02, String str, String str2) {
        i(new Q0(this, j02, str, str2));
    }

    public final void D(String str) {
        i(new S0(this, str));
    }

    public final void E(String str) {
        i(new T0(this, str));
    }

    public final void F(Runnable runnable) {
        i(new V0(this, runnable));
    }

    public final String G() {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new W0(this, binderC10516s0));
        return binderC10516s0.a2(500L);
    }

    public final String H() {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new X0(this, binderC10516s0));
        return binderC10516s0.a2(50L);
    }

    public final long I() {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new Y0(this, binderC10516s0));
        Long lB2 = binderC10516s0.b2(500L);
        if (lB2 != null) {
            return lB2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f82435b.a()).nextLong();
        int i10 = this.f82439f + 1;
        this.f82439f = i10;
        return jNextLong + i10;
    }

    public final String a() {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new Z0(this, binderC10516s0));
        return binderC10516s0.a2(500L);
    }

    public final String b() {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new C10365b1(this, binderC10516s0));
        return binderC10516s0.a2(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new C10374c1(this, str, str2, z10, binderC10516s0));
        Bundle bundleF2 = binderC10516s0.F2(5000L);
        if (bundleF2 == null || bundleF2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleF2.size());
        for (String str3 : bundleF2.keySet()) {
            Object obj = bundleF2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        i(new C10383d1(this, false, 5, str, obj, null, null));
    }

    public final Bundle e(Bundle bundle, boolean z10) {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new C10401f1(this, bundle, binderC10516s0));
        if (z10) {
            return binderC10516s0.F2(5000L);
        }
        return null;
    }

    public final int f(String str) {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        i(new C10410g1(this, str, binderC10516s0));
        Integer num = (Integer) BinderC10516s0.N3(binderC10516s0.F2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void h(boolean z10) {
        i(new C10419h1(this, z10));
    }

    public final Nd.a s() {
        return this.f82437d;
    }

    protected final InterfaceC10543v0 t(Context context, boolean z10) {
        try {
            return AbstractBinderC10534u0.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f64999e : DynamiteModule.f64997c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            j(e10, true, false);
            return null;
        }
    }

    public final void x(String str, String str2, Object obj, boolean z10) {
        i(new L0(this, str, str2, obj, z10));
    }

    public final void y(Bundle bundle) {
        i(new M0(this, bundle));
    }

    public final void z(String str, String str2, Bundle bundle) {
        i(new N0(this, str, str2, bundle));
    }

    protected C10544v1(Context context, Bundle bundle) throws ClassNotFoundException {
        C10499q0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC10392e1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f82436c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f82437d = new Nd.a(this);
        this.f82438e = new ArrayList();
        try {
            if (Od.H.a(context, "google_app_id", Od.o.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C10544v1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f82441h = null;
                    this.f82440g = true;
                    FS.log_w(this.f82434a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f82441h = "fa";
        i(new R0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            FS.log_w(this.f82434a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C10535u1(this));
        }
    }

    public static C10544v1 r(Context context, Bundle bundle) {
        com.google.android.gms.common.internal.r.l(context);
        if (f82433j == null) {
            synchronized (C10544v1.class) {
                try {
                    if (f82433j == null) {
                        f82433j = new C10544v1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f82433j;
    }

    public final void u(Od.A a10) {
        com.google.android.gms.common.internal.r.l(a10);
        List list = this.f82438e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (a10.equals(((Pair) list.get(i10)).first)) {
                        FS.log_w(this.f82434a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            BinderC10455l1 binderC10455l1 = new BinderC10455l1(a10);
            list.add(new Pair(a10, binderC10455l1));
            if (this.f82442i != null) {
                try {
                    this.f82442i.registerOnMeasurementEventListener(binderC10455l1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    FS.log_w(this.f82434a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i(new C10428i1(this, binderC10455l1));
        }
    }
}
