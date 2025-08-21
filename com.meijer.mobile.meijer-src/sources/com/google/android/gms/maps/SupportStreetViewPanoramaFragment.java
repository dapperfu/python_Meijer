package com.google.android.gms.maps;

import Md.InterfaceC4116i;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final t f85618a = new t(this);

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f85618a.e(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f85618a.f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f85618a.g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f85618a.i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f85618a.j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.f85618a.l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f85618a.n();
        super.onStop();
    }

    public void u0(InterfaceC4116i interfaceC4116i) {
        com.google.android.gms.common.internal.r.e("getStreetViewPanoramaAsync() must be called on the main thread");
        com.google.android.gms.common.internal.r.m(interfaceC4116i, "callback must not be null.");
        this.f85618a.w(interfaceC4116i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        t.v(this.f85618a, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f85618a.d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            t tVar = this.f85618a;
            t.v(tVar, activity);
            tVar.h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f85618a.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f85618a.m();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
