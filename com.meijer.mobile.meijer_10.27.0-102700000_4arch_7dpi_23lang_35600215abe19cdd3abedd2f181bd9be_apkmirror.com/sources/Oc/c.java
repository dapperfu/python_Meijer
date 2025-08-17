package Oc;

import Lc.v;
import Mc.A;
import Mc.InterfaceC4098a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC9423sn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.InterfaceC8201hG;

/* loaded from: classes4.dex */
public final class c extends AbstractBinderC9423sn {

    /* renamed from: a, reason: collision with root package name */
    private final AdOverlayInfoParcel f23525a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f23526b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23527c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23528d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23529e = false;

    private final synchronized void zzb() {
        try {
            if (this.f23528d) {
                return;
            }
            p pVar = this.f23525a.f64569c;
            if (pVar != null) {
                pVar.N3(4);
            }
            this.f23528d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void C2(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void O(com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final boolean f() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void j6(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzx() throws RemoteException {
        this.f23529e = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void F0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f23527c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void v3(Bundle bundle) {
        p pVar;
        if (((Boolean) A.c().a(C8659lf.f76063M8)).booleanValue() && !this.f23529e) {
            this.f23526b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23525a;
        if (adOverlayInfoParcel == null) {
            this.f23526b.finish();
            return;
        }
        if (z10) {
            this.f23526b.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC4098a interfaceC4098a = adOverlayInfoParcel.f64568b;
            if (interfaceC4098a != null) {
                interfaceC4098a.v();
            }
            InterfaceC8201hG interfaceC8201hG = this.f23525a.f64587u;
            if (interfaceC8201hG != null) {
                interfaceC8201hG.Z();
            }
            if (this.f23526b.getIntent() != null && this.f23526b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (pVar = this.f23525a.f64569c) != null) {
                pVar.F2();
            }
        }
        Activity activity = this.f23526b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23525a;
        v.l();
        l lVar = adOverlayInfoParcel2.f64567a;
        if (a.b(activity, lVar, adOverlayInfoParcel2.f64575i, lVar.f23538i, null, "")) {
            return;
        }
        this.f23526b.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzm() throws RemoteException {
        if (this.f23526b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzo() throws RemoteException {
        p pVar = this.f23525a.f64569c;
        if (pVar != null) {
            pVar.W5();
        }
        if (this.f23526b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzr() throws RemoteException {
        if (this.f23527c) {
            this.f23526b.finish();
            return;
        }
        this.f23527c = true;
        p pVar = this.f23525a.f64569c;
        if (pVar != null) {
            pVar.d7();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzu() throws RemoteException {
        if (this.f23526b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzv() throws RemoteException {
        p pVar = this.f23525a.f64569c;
        if (pVar != null) {
            pVar.A1();
        }
    }

    public c(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f23525a = adOverlayInfoParcel;
        this.f23526b = activity;
    }
}
