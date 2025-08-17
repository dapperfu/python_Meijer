package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7884eI extends AbstractBinderC7201Tg {

    /* renamed from: a, reason: collision with root package name */
    private final C9914xI f73800a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f73801b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final void Q(com.google.android.gms.dynamic.b bVar) {
        this.f73801b = bVar;
    }

    private static float B9(com.google.android.gms.dynamic.b bVar) {
        Drawable drawable;
        if (bVar == null || (drawable = (Drawable) com.google.android.gms.dynamic.d.b2(bVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final void n7(C6728Fh c6728Fh) {
        if (this.f73800a.W() instanceof BinderC7114Qt) {
            ((BinderC7114Qt) this.f73800a.W()).H9(c6728Fh);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final float zze() throws RemoteException {
        if (this.f73800a.O() != 0.0f) {
            return this.f73800a.O();
        }
        if (this.f73800a.W() != null) {
            try {
                return this.f73800a.W().zze();
            } catch (RemoteException e10) {
                Qc.p.e("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        com.google.android.gms.dynamic.b bVar = this.f73801b;
        if (bVar != null) {
            return B9(bVar);
        }
        InterfaceC7334Xg interfaceC7334XgZ = this.f73800a.Z();
        if (interfaceC7334XgZ == null) {
            return 0.0f;
        }
        float fZzd = (interfaceC7334XgZ.zzd() == -1 || interfaceC7334XgZ.zzc() == -1) ? 0.0f : interfaceC7334XgZ.zzd() / interfaceC7334XgZ.zzc();
        return fZzd == 0.0f ? B9(interfaceC7334XgZ.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final float zzf() throws RemoteException {
        if (this.f73800a.W() != null) {
            return this.f73800a.W().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final float zzg() throws RemoteException {
        if (this.f73800a.W() != null) {
            return this.f73800a.W().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final Mc.Y0 zzh() throws RemoteException {
        return this.f73800a.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final com.google.android.gms.dynamic.b zzi() throws RemoteException {
        com.google.android.gms.dynamic.b bVar = this.f73801b;
        if (bVar != null) {
            return bVar;
        }
        InterfaceC7334Xg interfaceC7334XgZ = this.f73800a.Z();
        if (interfaceC7334XgZ == null) {
            return null;
        }
        return interfaceC7334XgZ.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final boolean zzk() throws RemoteException {
        return this.f73800a.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7235Ug
    public final boolean zzl() throws RemoteException {
        return this.f73800a.W() != null;
    }

    public BinderC7884eI(C9914xI c9914xI) {
        this.f73800a = c9914xI;
    }
}
