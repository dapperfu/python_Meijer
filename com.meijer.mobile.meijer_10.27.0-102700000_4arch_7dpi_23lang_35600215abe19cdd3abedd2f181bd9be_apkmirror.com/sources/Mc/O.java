package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C6963Mg;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6592Bh;
import com.google.android.gms.internal.ads.InterfaceC6694Eh;
import com.google.android.gms.internal.ads.InterfaceC6932Lh;

/* loaded from: classes4.dex */
public final class O extends C8758mb implements Q {
    @Override // Mc.Q
    public final N zze() throws RemoteException {
        N l10;
        Parcel parcelA2 = a2(1, A1());
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

    @Override // Mc.Q
    public final void O4(InterfaceC6932Lh interfaceC6932Lh) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC6932Lh);
        b2(10, parcelA1);
    }

    @Override // Mc.Q
    public final void W6(H h10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, h10);
        b2(2, parcelA1);
    }

    @Override // Mc.Q
    public final void l7(String str, InterfaceC6694Eh interfaceC6694Eh, InterfaceC6592Bh interfaceC6592Bh) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6694Eh);
        C8972ob.f(parcelA1, interfaceC6592Bh);
        b2(5, parcelA1);
    }

    @Override // Mc.Q
    public final void y8(C6963Mg c6963Mg) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6963Mg);
        b2(6, parcelA1);
    }
}
