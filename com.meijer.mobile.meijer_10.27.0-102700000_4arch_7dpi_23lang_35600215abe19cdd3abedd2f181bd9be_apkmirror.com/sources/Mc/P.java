package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC10160zh;
import com.google.android.gms.internal.ads.AbstractBinderC6660Dh;
import com.google.android.gms.internal.ads.AbstractBinderC6796Hh;
import com.google.android.gms.internal.ads.AbstractBinderC6898Kh;
import com.google.android.gms.internal.ads.AbstractBinderC7816dk;
import com.google.android.gms.internal.ads.AbstractBinderC9518th;
import com.google.android.gms.internal.ads.AbstractBinderC9839wh;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C6963Mg;
import com.google.android.gms.internal.ads.C7239Uj;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6592Bh;
import com.google.android.gms.internal.ads.InterfaceC6694Eh;
import com.google.android.gms.internal.ads.InterfaceC6830Ih;
import com.google.android.gms.internal.ads.InterfaceC6932Lh;
import com.google.android.gms.internal.ads.InterfaceC7922ek;
import com.google.android.gms.internal.ads.InterfaceC9625uh;
import com.google.android.gms.internal.ads.InterfaceC9946xh;

/* loaded from: classes4.dex */
public abstract class P extends BinderC8865nb implements Q {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        H f10 = null;
        C4135m0 c4135m0 = null;
        switch (i10) {
            case 1:
                N nZze = zze();
                parcel2.writeNoException();
                C8972ob.f(parcel2, nZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    f10 = iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
                }
                C8972ob.c(parcel);
                W6(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC9625uh interfaceC9625uhB9 = AbstractBinderC9518th.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                k1(interfaceC9625uhB9);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC9946xh interfaceC9946xhB9 = AbstractBinderC9839wh.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                R7(interfaceC9946xhB9);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                InterfaceC6694Eh interfaceC6694EhB9 = AbstractBinderC6660Dh.B9(parcel.readStrongBinder());
                InterfaceC6592Bh interfaceC6592BhB9 = AbstractBinderC10160zh.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                l7(string, interfaceC6694EhB9, interfaceC6592BhB9);
                parcel2.writeNoException();
                return true;
            case 6:
                C6963Mg c6963Mg = (C6963Mg) C8972ob.a(parcel, C6963Mg.CREATOR);
                C8972ob.c(parcel);
                y8(c6963Mg);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c4135m0 = iInterfaceQueryLocalInterface2 instanceof C4135m0 ? (C4135m0) iInterfaceQueryLocalInterface2 : new C4135m0(strongBinder2);
                }
                C8972ob.c(parcel);
                U1(c4135m0);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC6830Ih interfaceC6830IhB9 = AbstractBinderC6796Hh.B9(parcel.readStrongBinder());
                d2 d2Var = (d2) C8972ob.a(parcel, d2.CREATOR);
                C8972ob.c(parcel);
                i7(interfaceC6830IhB9, d2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Hc.e eVar = (Hc.e) C8972ob.a(parcel, Hc.e.CREATOR);
                C8972ob.c(parcel);
                g7(eVar);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC6932Lh interfaceC6932LhB9 = AbstractBinderC6898Kh.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                O4(interfaceC6932LhB9);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C7239Uj c7239Uj = (C7239Uj) C8972ob.a(parcel, C7239Uj.CREATOR);
                C8972ob.c(parcel);
                t2(c7239Uj);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC7922ek interfaceC7922ekB9 = AbstractBinderC7816dk.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                F6(interfaceC7922ekB9);
                parcel2.writeNoException();
                return true;
            case 15:
                Hc.a aVar = (Hc.a) C8972ob.a(parcel, Hc.a.CREATOR);
                C8972ob.c(parcel);
                U2(aVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public P() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }
}
