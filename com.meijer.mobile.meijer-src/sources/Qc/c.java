package Qc;

import Nc.v;
import Oc.A;
import Oc.InterfaceC4376a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC9548sn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC8326hG;

/* loaded from: classes4.dex */
public final class c extends AbstractBinderC9548sn {

    /* renamed from: a, reason: collision with root package name */
    private final AdOverlayInfoParcel f28013a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f28014b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28015c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28016d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28017e = false;

    private final synchronized void zzb() {
        try {
            if (this.f28016d) {
                return;
            }
            p pVar = this.f28013a.f65409c;
            if (pVar != null) {
                pVar.Z3(4);
            }
            this.f28016d = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void F2(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void O(com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final boolean g() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void w6(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzx() throws RemoteException {
        this.f28017e = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void G3(Bundle bundle) {
        p pVar;
        if (((Boolean) A.c().a(C8784lf.f76903M8)).booleanValue() && !this.f28017e) {
            this.f28014b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f28013a;
        if (adOverlayInfoParcel == null) {
            this.f28014b.finish();
            return;
        }
        if (z10) {
            this.f28014b.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC4376a interfaceC4376a = adOverlayInfoParcel.f65408b;
            if (interfaceC4376a != null) {
                interfaceC4376a.v();
            }
            InterfaceC8326hG interfaceC8326hG = this.f28013a.f65427u;
            if (interfaceC8326hG != null) {
                interfaceC8326hG.Z();
            }
            if (this.f28014b.getIntent() != null && this.f28014b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (pVar = this.f28013a.f65409c) != null) {
                pVar.I2();
            }
        }
        Activity activity = this.f28014b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f28013a;
        v.l();
        l lVar = adOverlayInfoParcel2.f65407a;
        if (a.b(activity, lVar, adOverlayInfoParcel2.f65415i, lVar.f28026i, null, "")) {
            return;
        }
        this.f28014b.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void I0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f28015c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzm() throws RemoteException {
        if (this.f28014b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzo() throws RemoteException {
        p pVar = this.f28013a.f65409c;
        if (pVar != null) {
            pVar.m6();
        }
        if (this.f28014b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzr() throws RemoteException {
        if (this.f28015c) {
            this.f28014b.finish();
            return;
        }
        this.f28015c = true;
        p pVar = this.f28013a.f65409c;
        if (pVar != null) {
            pVar.o7();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzu() throws RemoteException {
        if (this.f28014b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzv() throws RemoteException {
        p pVar = this.f28013a.f65409c;
        if (pVar != null) {
            pVar.K1();
        }
    }

    public c(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f28013a = adOverlayInfoParcel;
        this.f28014b = activity;
    }
}
