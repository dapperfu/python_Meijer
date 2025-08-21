package com.google.android.gms.maps;

import Md.InterfaceC4114g;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public class SupportMapFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final q f85617a = new q(this);

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewE = this.f85617a.e(layoutInflater, viewGroup, bundle);
        viewE.setClickable(true);
        return viewE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f85617a.f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f85617a.g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f85617a.i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f85617a.j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f85617a.l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f85617a.n();
        super.onStop();
    }

    public void u0(InterfaceC4114g interfaceC4114g) {
        com.google.android.gms.common.internal.r.e("getMapAsync must be called on the main thread.");
        com.google.android.gms.common.internal.r.m(interfaceC4114g, "callback must not be null.");
        this.f85617a.w(interfaceC4114g);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        q.v(this.f85617a, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.f85617a.d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            q qVar = this.f85617a;
            q.v(qVar, activity);
            GoogleMapOptions googleMapOptionsI0 = GoogleMapOptions.I0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsI0);
            qVar.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f85617a.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f85617a.m();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
