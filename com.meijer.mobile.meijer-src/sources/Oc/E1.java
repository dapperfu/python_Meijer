package Oc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7195Pj;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class E1 extends AbstractBinderC4436u0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7195Pj f23330a;

    @Override // Oc.InterfaceC4439v0
    public final void J(boolean z10) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void M(float f10) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void N(String str) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void N3(L1 l12) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void a8(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void c1(InterfaceC6756Cl interfaceC6756Cl) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void m0(String str) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void t3(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void w(boolean z10) throws RemoteException {
    }

    @Override // Oc.InterfaceC4439v0
    public final void w9(H0 h02) {
    }

    @Override // Oc.InterfaceC4439v0
    public final void x5(String str) {
    }

    @Override // Oc.InterfaceC4439v0
    public final void zzi() {
    }

    @Override // Oc.InterfaceC4439v0
    public final boolean zzv() throws RemoteException {
        return false;
    }

    @Override // Oc.InterfaceC4439v0
    public final void v2(InterfaceC7195Pj interfaceC7195Pj) throws RemoteException {
        this.f23330a = interfaceC7195Pj;
    }

    final /* synthetic */ void zzb() {
        InterfaceC7195Pj interfaceC7195Pj = this.f23330a;
        if (interfaceC7195Pj != null) {
            try {
                interfaceC7195Pj.v4(Collections.EMPTY_LIST);
            } catch (RemoteException e10) {
                Sc.p.h("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // Oc.InterfaceC4439v0
    public final String zzf() {
        return "";
    }

    @Override // Oc.InterfaceC4439v0
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // Oc.InterfaceC4439v0
    public final void zzk() throws RemoteException {
        Sc.p.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        Sc.g.f34490b.post(new Runnable() { // from class: Oc.D1
            @Override // java.lang.Runnable
            public final void run() {
                this.f23327a.zzb();
            }
        });
    }
}
