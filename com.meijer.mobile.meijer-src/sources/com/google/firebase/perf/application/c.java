package com.google.firebase.perf.application;

import Xf.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bg.k;
import cg.C6505a;
import cg.g;
import cg.j;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class c extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private static final Wf.a f89843f = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f89844a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final C6505a f89845b;

    /* renamed from: c, reason: collision with root package name */
    private final k f89846c;

    /* renamed from: d, reason: collision with root package name */
    private final a f89847d;

    /* renamed from: e, reason: collision with root package name */
    private final d f89848e;

    public String a(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }

    public c(C6505a c6505a, k kVar, a aVar, d dVar) {
        this.f89845b = c6505a;
        this.f89846c = kVar;
        this.f89847d = aVar;
        this.f89848e = dVar;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        Wf.a aVar = f89843f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f89844a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f89844a.get(fragment);
        this.f89844a.remove(fragment);
        g<f.a> gVarF = this.f89848e.f(fragment);
        if (!gVarF.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, gVarF.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        super.onFragmentResumed(fragmentManager, fragment);
        f89843f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(a(fragment), this.f89846c, this.f89845b, this.f89847d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f89844a.put(fragment, trace);
        this.f89848e.d(fragment);
    }
}
