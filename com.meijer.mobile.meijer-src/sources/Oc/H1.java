package Oc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7738bp;
import com.google.android.gms.internal.ads.C8697kp;
import com.google.android.gms.internal.ads.C9445rp;
import com.google.android.gms.internal.ads.InterfaceC7534Zo;
import com.google.android.gms.internal.ads.InterfaceC8164fp;
import com.google.android.gms.internal.ads.InterfaceC8590jp;

/* loaded from: classes4.dex */
public final class H1 extends AbstractBinderC7738bp {
    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void E3(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void Z7(N0 n02) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void a7(com.google.android.gms.dynamic.b bVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void k7(C9445rp c9445rp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void l1(K0 k02) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void n7(InterfaceC8164fp interfaceC8164fp) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void x2(C8697kp c8697kp) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final U0 zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final InterfaceC7534Zo zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final boolean zzo() throws RemoteException {
        return false;
    }

    private static void C9(final InterfaceC8590jp interfaceC8590jp) {
        Sc.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        Sc.g.f34490b.post(new Runnable() { // from class: Oc.G1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8590jp interfaceC8590jp2 = interfaceC8590jp;
                if (interfaceC8590jp2 != null) {
                    try {
                        interfaceC8590jp2.zze(1);
                    } catch (RemoteException e10) {
                        Sc.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void R6(Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        C9(interfaceC8590jp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void j6(Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        C9(interfaceC8590jp);
    }
}
