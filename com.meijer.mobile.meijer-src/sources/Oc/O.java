package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C7088Mg;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6717Bh;
import com.google.android.gms.internal.ads.InterfaceC6819Eh;
import com.google.android.gms.internal.ads.InterfaceC7057Lh;

/* loaded from: classes4.dex */
public final class O extends C8883mb implements Q {
    @Override // Oc.Q
    public final N zze() throws RemoteException {
        N l10;
        Parcel parcelA2 = a2(1, K1());
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            l10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            l10 = iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new L(strongBinder);
        }
        parcelA2.recycle();
        return l10;
    }

    O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // Oc.Q
    public final void V6(H h10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, h10);
        c2(2, parcelK1);
    }

    @Override // Oc.Q
    public final void e5(InterfaceC7057Lh interfaceC7057Lh) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7057Lh);
        c2(10, parcelK1);
    }

    @Override // Oc.Q
    public final void s7(String str, InterfaceC6819Eh interfaceC6819Eh, InterfaceC6717Bh interfaceC6717Bh) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6819Eh);
        C9097ob.f(parcelK1, interfaceC6717Bh);
        c2(5, parcelK1);
    }

    @Override // Oc.Q
    public final void t8(C7088Mg c7088Mg) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7088Mg);
        c2(6, parcelK1);
    }
}
