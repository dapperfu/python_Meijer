package com.google.android.gms.maps;

import Kd.InterfaceC3949g;
import Ld.InterfaceC4048e;
import Ld.l0;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
final class f implements com.google.android.gms.dynamic.c {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f84787a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4048e f84788b;

    /* renamed from: c, reason: collision with root package name */
    private View f84789c;

    @Override // com.google.android.gms.dynamic.c
    public final void H() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.c
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.c
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    public final void c(InterfaceC3949g interfaceC3949g) {
        try {
            this.f84788b.l0(new e(this, interfaceC3949g));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            InterfaceC4048e interfaceC4048e = this.f84788b;
            interfaceC4048e.k(bundle2);
            l0.b(bundle2, bundle);
            this.f84789c = (View) com.google.android.gms.dynamic.d.b2(interfaceC4048e.getView());
            ViewGroup viewGroup = this.f84787a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f84789c);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            this.f84788b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f84788b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f84788b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f84788b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f84788b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f84788b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f84788b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public f(ViewGroup viewGroup, InterfaceC4048e interfaceC4048e) {
        this.f84788b = (InterfaceC4048e) com.google.android.gms.common.internal.r.l(interfaceC4048e);
        this.f84787a = (ViewGroup) com.google.android.gms.common.internal.r.l(viewGroup);
    }
}
