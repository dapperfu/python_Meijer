package com.google.android.gms.maps;

import Kd.InterfaceC3949g;
import Ld.InterfaceC4046d;
import Ld.l0;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes6.dex */
final class p implements com.google.android.gms.dynamic.c {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f84839a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4046d f84840b;

    @Override // com.google.android.gms.dynamic.c
    public final void H() {
        try {
            this.f84840b.H();
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
            this.f84840b.s6(com.google.android.gms.dynamic.d.F2(activity), googleMapOptions, bundle3);
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
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                com.google.android.gms.dynamic.b bVarX0 = this.f84840b.x0(com.google.android.gms.dynamic.d.F2(layoutInflater), com.google.android.gms.dynamic.d.F2(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                l0.b(bundle2, bundle);
                return (View) com.google.android.gms.dynamic.d.b2(bVarX0);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void c(InterfaceC3949g interfaceC3949g) {
        try {
            this.f84840b.l0(new o(this, interfaceC3949g));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            Bundle arguments = this.f84839a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                l0.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f84840b.k(bundle2);
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
            this.f84840b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f84840b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f84840b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f84840b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f84840b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f84840b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f84840b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public p(Fragment fragment, InterfaceC4046d interfaceC4046d) {
        this.f84840b = (InterfaceC4046d) com.google.android.gms.common.internal.r.l(interfaceC4046d);
        this.f84839a = (Fragment) com.google.android.gms.common.internal.r.l(fragment);
    }
}
