package com.google.android.gms.maps;

import Md.InterfaceC4114g;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class MapFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final d f85603a = new d(this);

    public void a(InterfaceC4114g interfaceC4114g) {
        com.google.android.gms.common.internal.r.e("getMapAsync must be called on the main thread.");
        com.google.android.gms.common.internal.r.m(interfaceC4114g, "callback must not be null.");
        this.f85603a.w(interfaceC4114g);
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
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewE = this.f85603a.e(layoutInflater, viewGroup, bundle);
        viewE.setClickable(true);
        return viewE;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f85603a.f();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f85603a.g();
        super.onDestroyView();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f85603a.i();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f85603a.j();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = MapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f85603a.l(bundle);
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f85603a.n();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        d.v(this.f85603a, activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85603a.d(bundle);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            d dVar = this.f85603a;
            d.v(dVar, activity);
            GoogleMapOptions googleMapOptionsI0 = GoogleMapOptions.I0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsI0);
            dVar.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f85603a.k();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f85603a.m();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
