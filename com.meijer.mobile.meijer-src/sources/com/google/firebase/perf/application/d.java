package com.google.firebase.perf.application;

import Xf.f;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.i;
import androidx.fragment.app.Fragment;
import cg.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final Wf.a f89849e = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Activity f89850a;

    /* renamed from: b, reason: collision with root package name */
    private final i f89851b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Fragment, f.a> f89852c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f89853d;

    public d(Activity activity) {
        this(activity, new i(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    d(Activity activity, i iVar, Map<Fragment, f.a> map) {
        this.f89853d = false;
        this.f89850a = activity;
        this.f89851b = iVar;
        this.f89852c = map;
    }

    private g<f.a> b() {
        if (!this.f89853d) {
            f89849e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] sparseIntArrayArrB = this.f89851b.b();
        if (sparseIntArrayArrB == null) {
            f89849e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (sparseIntArrayArrB[0] != null) {
            return g.e(f.a(sparseIntArrayArrB));
        }
        f89849e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f89853d) {
            f89849e.b("FrameMetricsAggregator is already recording %s", this.f89850a.getClass().getSimpleName());
        } else {
            this.f89851b.a(this.f89850a);
            this.f89853d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f89853d) {
            f89849e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f89852c.containsKey(fragment)) {
            f89849e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            this.f89852c.put(fragment, gVarB.c());
        } else {
            f89849e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g<f.a> e() {
        if (!this.f89853d) {
            f89849e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f89852c.isEmpty()) {
            f89849e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f89852c.clear();
        }
        g<f.a> gVarB = b();
        try {
            this.f89851b.c(this.f89850a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f89849e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            gVarB = g.a();
        }
        this.f89851b.d();
        this.f89853d = false;
        return gVarB;
    }

    public g<f.a> f(Fragment fragment) {
        if (!this.f89853d) {
            f89849e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f89852c.containsKey(fragment)) {
            f89849e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        f.a aVarRemove = this.f89852c.remove(fragment);
        g<f.a> gVarB = b();
        if (gVarB.d()) {
            return g.e(gVarB.c().a(aVarRemove));
        }
        f89849e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }
}
