package com.google.android.gms.maps;

import Kd.InterfaceC3951i;
import Ld.InterfaceC4056i;
import Ld.l0;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
final class m implements com.google.android.gms.dynamic.c {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f84803a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4056i f84804b;

    /* renamed from: c, reason: collision with root package name */
    private View f84805c;

    @Override // com.google.android.gms.dynamic.c
    public final void H() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.c
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.c
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void c(InterfaceC3951i interfaceC3951i) {
        try {
            this.f84804b.L0(new l(this, interfaceC3951i));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            InterfaceC4056i interfaceC4056i = this.f84804b;
            interfaceC4056i.k(bundle2);
            l0.b(bundle2, bundle);
            this.f84805c = (View) com.google.android.gms.dynamic.d.b2(interfaceC4056i.getView());
            ViewGroup viewGroup = this.f84803a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f84805c);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            this.f84804b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f84804b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f84804b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f84804b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f84804b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f84804b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f84804b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public m(ViewGroup viewGroup, InterfaceC4056i interfaceC4056i) {
        this.f84804b = (InterfaceC4056i) com.google.android.gms.common.internal.r.l(interfaceC4056i);
        this.f84803a = (ViewGroup) com.google.android.gms.common.internal.r.l(viewGroup);
    }
}
