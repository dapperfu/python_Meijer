package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8009eI extends AbstractBinderC7326Tg {

    /* renamed from: a, reason: collision with root package name */
    private final C10039xI f74640a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f74641b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final void Q(com.google.android.gms.dynamic.b bVar) {
        this.f74641b = bVar;
    }

    private static float B9(com.google.android.gms.dynamic.b bVar) {
        Drawable drawable;
        if (bVar == null || (drawable = (Drawable) com.google.android.gms.dynamic.d.c2(bVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final void u7(C6853Fh c6853Fh) {
        if (this.f74640a.W() instanceof BinderC7239Qt) {
            ((BinderC7239Qt) this.f74640a.W()).H9(c6853Fh);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final float zze() throws RemoteException {
        if (this.f74640a.O() != 0.0f) {
            return this.f74640a.O();
        }
        if (this.f74640a.W() != null) {
            try {
                return this.f74640a.W().zze();
            } catch (RemoteException e10) {
                Sc.p.e("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        com.google.android.gms.dynamic.b bVar = this.f74641b;
        if (bVar != null) {
            return B9(bVar);
        }
        InterfaceC7459Xg interfaceC7459XgZ = this.f74640a.Z();
        if (interfaceC7459XgZ == null) {
            return 0.0f;
        }
        float fZzd = (interfaceC7459XgZ.zzd() == -1 || interfaceC7459XgZ.zzc() == -1) ? 0.0f : interfaceC7459XgZ.zzd() / interfaceC7459XgZ.zzc();
        return fZzd == 0.0f ? B9(interfaceC7459XgZ.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final float zzf() throws RemoteException {
        if (this.f74640a.W() != null) {
            return this.f74640a.W().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final float zzg() throws RemoteException {
        if (this.f74640a.W() != null) {
            return this.f74640a.W().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final Oc.Y0 zzh() throws RemoteException {
        return this.f74640a.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final com.google.android.gms.dynamic.b zzi() throws RemoteException {
        com.google.android.gms.dynamic.b bVar = this.f74641b;
        if (bVar != null) {
            return bVar;
        }
        InterfaceC7459Xg interfaceC7459XgZ = this.f74640a.Z();
        if (interfaceC7459XgZ == null) {
            return null;
        }
        return interfaceC7459XgZ.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final boolean zzk() throws RemoteException {
        return this.f74640a.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7360Ug
    public final boolean zzl() throws RemoteException {
        return this.f74640a.W() != null;
    }

    public BinderC8009eI(C10039xI c10039xI) {
        this.f74640a = c10039xI;
    }
}
