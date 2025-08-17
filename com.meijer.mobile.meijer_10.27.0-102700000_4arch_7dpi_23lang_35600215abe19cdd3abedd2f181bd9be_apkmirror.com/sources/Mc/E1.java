package Mc;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7070Pj;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class E1 extends AbstractBinderC4158u0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7070Pj f19143a;

    @Override // Mc.InterfaceC4161v0
    public final void J(boolean z10) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void L7(H0 h02) {
    }

    @Override // Mc.InterfaceC4161v0
    public final void M(float f10) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void N(String str) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void Z0(InterfaceC6631Cl interfaceC6631Cl) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void d8(com.google.android.gms.dynamic.b bVar, String str) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void j0(String str) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void l3(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void p5(String str) {
    }

    @Override // Mc.InterfaceC4161v0
    public final void u1(L1 l12) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void w(boolean z10) throws RemoteException {
    }

    @Override // Mc.InterfaceC4161v0
    public final void zzi() {
    }

    @Override // Mc.InterfaceC4161v0
    public final boolean zzv() throws RemoteException {
        return false;
    }

    @Override // Mc.InterfaceC4161v0
    public final void s2(InterfaceC7070Pj interfaceC7070Pj) throws RemoteException {
        this.f19143a = interfaceC7070Pj;
    }

    final /* synthetic */ void zzb() {
        InterfaceC7070Pj interfaceC7070Pj = this.f19143a;
        if (interfaceC7070Pj != null) {
            try {
                interfaceC7070Pj.f4(Collections.EMPTY_LIST);
            } catch (RemoteException e10) {
                Qc.p.h("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // Mc.InterfaceC4161v0
    public final String zzf() {
        return "";
    }

    @Override // Mc.InterfaceC4161v0
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // Mc.InterfaceC4161v0
    public final void zzk() throws RemoteException {
        Qc.p.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        Qc.g.f29940b.post(new Runnable() { // from class: Mc.D1
            @Override // java.lang.Runnable
            public final void run() {
                this.f19140a.zzb();
            }
        });
    }
}
