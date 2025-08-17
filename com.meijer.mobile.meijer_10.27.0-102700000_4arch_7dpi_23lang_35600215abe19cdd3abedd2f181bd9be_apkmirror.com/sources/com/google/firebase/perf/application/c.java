package com.google.firebase.perf.application;

import Vf.f;
import Zf.k;
import ag.C5599a;
import ag.g;
import ag.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class c extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private static final Uf.a f89001f = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Fragment, Trace> f89002a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final C5599a f89003b;

    /* renamed from: c, reason: collision with root package name */
    private final k f89004c;

    /* renamed from: d, reason: collision with root package name */
    private final a f89005d;

    /* renamed from: e, reason: collision with root package name */
    private final d f89006e;

    public String a(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }

    public c(C5599a c5599a, k kVar, a aVar, d dVar) {
        this.f89003b = c5599a;
        this.f89004c = kVar;
        this.f89005d = aVar;
        this.f89006e = dVar;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        Uf.a aVar = f89001f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f89002a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f89002a.get(fragment);
        this.f89002a.remove(fragment);
        g<f.a> gVarF = this.f89006e.f(fragment);
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
        f89001f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(a(fragment), this.f89004c, this.f89003b, this.f89005d);
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
        this.f89002a.put(fragment, trace);
        this.f89006e.d(fragment);
    }
}
