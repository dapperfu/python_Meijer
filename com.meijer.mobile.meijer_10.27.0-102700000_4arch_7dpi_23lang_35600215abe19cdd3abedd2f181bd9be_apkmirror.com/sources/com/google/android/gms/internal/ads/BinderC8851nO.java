package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.nO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC8851nO extends AbstractBinderC8359ip {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9065pO f77048a;

    BinderC8851nO(C9065pO c9065pO) {
        this.f77048a = c9065pO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void b(Mc.W0 w02) throws JSONException, RemoteException {
        C9065pO c9065pO = this.f77048a;
        c9065pO.f77575b.m(c9065pO.f77574a, w02.f19159a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zze(int i10) throws JSONException, RemoteException {
        C9065pO c9065pO = this.f77048a;
        c9065pO.f77575b.m(c9065pO.f77574a, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zzg() throws JSONException, RemoteException {
        C9065pO c9065pO = this.f77048a;
        c9065pO.f77575b.p(c9065pO.f77574a);
    }
}
