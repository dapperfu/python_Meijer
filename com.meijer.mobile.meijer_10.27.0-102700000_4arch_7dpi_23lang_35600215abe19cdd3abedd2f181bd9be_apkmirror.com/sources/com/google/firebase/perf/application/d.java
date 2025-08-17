package com.google.firebase.perf.application;

import Vf.f;
import ag.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.i;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final Uf.a f89007e = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Activity f89008a;

    /* renamed from: b, reason: collision with root package name */
    private final i f89009b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Fragment, f.a> f89010c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f89011d;

    public d(Activity activity) {
        this(activity, new i(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    d(Activity activity, i iVar, Map<Fragment, f.a> map) {
        this.f89011d = false;
        this.f89008a = activity;
        this.f89009b = iVar;
        this.f89010c = map;
    }

    private g<f.a> b() {
        if (!this.f89011d) {
            f89007e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f89009b.b();
        if (sparseIntArrayArrB == null) {
            f89007e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(f.a(sparseIntArrayArrB));
        }
        f89007e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f89011d) {
            f89007e.b("FrameMetricsAggregator is already recording %s", this.f89008a.getClass().getSimpleName());
        } else {
            this.f89009b.a(this.f89008a);
            this.f89011d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f89011d) {
            f89007e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f89010c.containsKey(fragment)) {
            f89007e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            this.f89010c.put(fragment, gVarB.c());
        } else {
            f89007e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g<f.a> e() {
        if (!this.f89011d) {
            f89007e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f89010c.isEmpty()) {
            f89007e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f89010c.clear();
        }
        g<f.a> gVarB = b();
        try {
            this.f89009b.c(this.f89008a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f89007e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            gVarB = g.a();
        }
        this.f89009b.d();
        this.f89011d = false;
        return gVarB;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f89011d) {
            f89007e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f89010c.containsKey(fragment)) {
            f89007e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        f.a aVarRemove = this.f89010c.remove(fragment);
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            return g.e(gVarB.c().a(aVarRemove));
        }
        f89007e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }
}
