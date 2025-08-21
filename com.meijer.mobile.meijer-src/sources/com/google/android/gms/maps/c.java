package com.google.android.gms.maps;

import Md.InterfaceC4114g;
import Nd.InterfaceC4178d;
import Nd.l0;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
final class c implements com.google.android.gms.dynamic.c {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f85620a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4178d f85621b;

    @Override // com.google.android.gms.dynamic.c
    public final void H() {
        try {
            this.f85621b.H();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            l0.b(bundle2, bundle3);
            this.f85621b.H6(com.google.android.gms.dynamic.d.I2(activity), googleMapOptions, bundle3);
            l0.b(bundle3, bundle2);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            com.google.android.gms.dynamic.b bVarA0 = this.f85621b.A0(com.google.android.gms.dynamic.d.I2(layoutInflater), com.google.android.gms.dynamic.d.I2(viewGroup), bundle2);
            l0.b(bundle2, bundle);
            return (View) com.google.android.gms.dynamic.d.c2(bVarA0);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void c(InterfaceC4114g interfaceC4114g) {
        try {
            this.f85621b.V(new b(this, interfaceC4114g));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            Bundle arguments = this.f85620a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                l0.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f85621b.k(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            this.f85621b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f85621b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f85621b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f85621b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f85621b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f85621b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f85621b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public c(Fragment fragment, InterfaceC4178d interfaceC4178d) {
        this.f85621b = (InterfaceC4178d) com.google.android.gms.common.internal.r.l(interfaceC4178d);
        this.f85620a = (Fragment) com.google.android.gms.common.internal.r.l(fragment);
    }
}
