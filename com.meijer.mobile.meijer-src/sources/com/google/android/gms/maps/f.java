package com.google.android.gms.maps;

import Md.InterfaceC4114g;
import Nd.InterfaceC4180e;
import Nd.l0;
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
    private final ViewGroup f85627a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4180e f85628b;

    /* renamed from: c, reason: collision with root package name */
    private View f85629c;

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

    public final void c(InterfaceC4114g interfaceC4114g) {
        try {
            this.f85628b.V(new e(this, interfaceC4114g));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void k(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            InterfaceC4180e interfaceC4180e = this.f85628b;
            interfaceC4180e.k(bundle2);
            l0.b(bundle2, bundle);
            this.f85629c = (View) com.google.android.gms.dynamic.d.c2(interfaceC4180e.getView());
            ViewGroup viewGroup = this.f85627a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f85629c);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void n(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            l0.b(bundle, bundle2);
            this.f85628b.n(bundle2);
            l0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onDestroy() {
        try {
            this.f85628b.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onLowMemory() {
        try {
            this.f85628b.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onPause() {
        try {
            this.f85628b.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onResume() {
        try {
            this.f85628b.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStart() {
        try {
            this.f85628b.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.c
    public final void onStop() {
        try {
            this.f85628b.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public f(ViewGroup viewGroup, InterfaceC4180e interfaceC4180e) {
        this.f85628b = (InterfaceC4180e) com.google.android.gms.common.internal.r.l(interfaceC4180e);
        this.f85627a = (ViewGroup) com.google.android.gms.common.internal.r.l(viewGroup);
    }
}
