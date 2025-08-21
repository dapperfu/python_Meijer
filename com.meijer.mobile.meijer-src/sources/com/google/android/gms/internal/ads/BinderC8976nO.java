package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.nO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC8976nO extends AbstractBinderC8484ip {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9190pO f77888a;

    BinderC8976nO(C9190pO c9190pO) {
        this.f77888a = c9190pO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void b(Oc.W0 w02) throws JSONException, RemoteException {
        C9190pO c9190pO = this.f77888a;
        c9190pO.f78415b.m(c9190pO.f78414a, w02.f23346a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zze(int i10) throws JSONException, RemoteException {
        C9190pO c9190pO = this.f77888a;
        c9190pO.f78415b.m(c9190pO.f78414a, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zzg() throws JSONException, RemoteException {
        C9190pO c9190pO = this.f77888a;
        c9190pO.f78415b.p(c9190pO.f78414a);
    }
}
