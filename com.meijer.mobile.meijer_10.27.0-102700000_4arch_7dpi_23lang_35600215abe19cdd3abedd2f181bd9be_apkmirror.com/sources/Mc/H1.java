package Mc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7613bp;
import com.google.android.gms.internal.ads.C8572kp;
import com.google.android.gms.internal.ads.C9320rp;
import com.google.android.gms.internal.ads.InterfaceC7409Zo;
import com.google.android.gms.internal.ads.InterfaceC8039fp;
import com.google.android.gms.internal.ads.InterfaceC8465jp;

/* loaded from: classes4.dex */
public final class H1 extends AbstractBinderC7613bp {
    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void P5(N0 n02) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void Q6(com.google.android.gms.dynamic.b bVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void Z6(C9320rp c9320rp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void b7(InterfaceC8039fp interfaceC8039fp) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void f8(K0 k02) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void t3(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void v2(C8572kp c8572kp) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final U0 zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final InterfaceC7409Zo zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final boolean zzo() throws RemoteException {
        return false;
    }

    private static void C9(final InterfaceC8465jp interfaceC8465jp) {
        Qc.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        Qc.g.f29940b.post(new Runnable() { // from class: Mc.G1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8465jp interfaceC8465jp2 = interfaceC8465jp;
                if (interfaceC8465jp2 != null) {
                    try {
                        interfaceC8465jp2.zze(1);
                    } catch (RemoteException e10) {
                        Qc.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void Y7(Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        C9(interfaceC8465jp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void x9(Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        C9(interfaceC8465jp);
    }
}
