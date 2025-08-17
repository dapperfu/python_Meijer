package com.google.android.gms.maps;

import Kd.InterfaceC3949g;
import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class MapFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final d f84763a = new d(this);

    public void a(InterfaceC3949g interfaceC3949g) {
        com.google.android.gms.common.internal.r.e("getMapAsync must be called on the main thread.");
        com.google.android.gms.common.internal.r.m(interfaceC3949g, "callback must not be null.");
        this.f84763a.w(interfaceC3949g);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewE = this.f84763a.e(layoutInflater, viewGroup, bundle);
        viewE.setClickable(true);
        return viewE;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f84763a.f();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f84763a.g();
        super.onDestroyView();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f84763a.i();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f84763a.j();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f84763a.l(bundle);
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f84763a.n();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        d.v(this.f84763a, activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84763a.d(bundle);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            d dVar = this.f84763a;
            d.v(dVar, activity);
            GoogleMapOptions googleMapOptionsK0 = GoogleMapOptions.K0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsK0);
            dVar.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f84763a.k();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f84763a.m();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
