package com.google.android.gms.maps;

import Md.InterfaceC4116i;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final j f85605a = new j(this);

    public void a(InterfaceC4116i interfaceC4116i) {
        com.google.android.gms.common.internal.r.e("getStreetViewPanoramaAsync() must be called on the main thread");
        com.google.android.gms.common.internal.r.m(interfaceC4116i, "callback must not be null.");
        this.f85605a.w(interfaceC4116i);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f85605a.e(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f85605a.f();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f85605a.g();
        super.onDestroyView();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f85605a.i();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f85605a.j();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = StreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f85605a.l(bundle);
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f85605a.n();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        j.v(this.f85605a, activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85605a.d(bundle);
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            j jVar = this.f85605a;
            j.v(jVar, activity);
            jVar.h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f85605a.k();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f85605a.m();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
