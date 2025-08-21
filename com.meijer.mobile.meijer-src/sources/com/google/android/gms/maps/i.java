package com.google.android.gms.maps;

import Md.InterfaceC4116i;
import Nd.InterfaceC4186h;
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
final class i implements com.google.android.gms.dynamic.c {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f85636a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4186h f85637b;

    @Override // com.google.android.gms.dynamic.c
    public final void H() {
        try {
            this.f85637b.H();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            Bundle bundle3 = new Bundle();
            l0.b(bundle2, bundle3);
            this.f85637b.q7(com.google.android.gms.dynamic.d.I2(activity), null, bundle3);
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
            com.google.android.gms.dynamic.b bVarA0 = this.f85637b.A0(com.google.android.gms.dynamic.d.I2(layoutInflater), com.google.android.gms.dynamic.d.I2(viewGroup), bundle2);
            l0.b(bundle2, bundle);
            return (View) com.google.android.gms.dynamic.d.c2(bVarA0);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void c(InterfaceC4116i interfaceC4116i) {
        try {
            this.f85637b.y0(new h(this, interfaceC4116i));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            Bundle arguments = this.f85636a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                l0.c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f85637b.k(bundle2);
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
            this.f85637b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f85637b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f85637b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f85637b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f85637b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f85637b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f85637b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public i(Fragment fragment, InterfaceC4186h interfaceC4186h) {
        this.f85637b = (InterfaceC4186h) com.google.android.gms.common.internal.r.l(interfaceC4186h);
        this.f85636a = (Fragment) com.google.android.gms.common.internal.r.l(fragment);
    }
}
