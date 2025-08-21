package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC10285zh;
import com.google.android.gms.internal.ads.AbstractBinderC6785Dh;
import com.google.android.gms.internal.ads.AbstractBinderC6921Hh;
import com.google.android.gms.internal.ads.AbstractBinderC7023Kh;
import com.google.android.gms.internal.ads.AbstractBinderC7941dk;
import com.google.android.gms.internal.ads.AbstractBinderC9643th;
import com.google.android.gms.internal.ads.AbstractBinderC9964wh;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C7088Mg;
import com.google.android.gms.internal.ads.C7364Uj;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC10071xh;
import com.google.android.gms.internal.ads.InterfaceC6717Bh;
import com.google.android.gms.internal.ads.InterfaceC6819Eh;
import com.google.android.gms.internal.ads.InterfaceC6955Ih;
import com.google.android.gms.internal.ads.InterfaceC7057Lh;
import com.google.android.gms.internal.ads.InterfaceC8047ek;
import com.google.android.gms.internal.ads.InterfaceC9750uh;

/* loaded from: classes4.dex */
public abstract class P extends BinderC8990nb implements Q {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        H f10 = null;
        C4413m0 c4413m0 = null;
        switch (i10) {
            case 1:
                N nZze = zze();
                parcel2.writeNoException();
                C9097ob.f(parcel2, nZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    f10 = iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
                }
                C9097ob.c(parcel);
                V6(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC9750uh interfaceC9750uhB9 = AbstractBinderC9643th.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                q1(interfaceC9750uhB9);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC10071xh interfaceC10071xhB9 = AbstractBinderC9964wh.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                P7(interfaceC10071xhB9);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                InterfaceC6819Eh interfaceC6819EhB9 = AbstractBinderC6785Dh.B9(parcel.readStrongBinder());
                InterfaceC6717Bh interfaceC6717BhB9 = AbstractBinderC10285zh.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                s7(string, interfaceC6819EhB9, interfaceC6717BhB9);
                parcel2.writeNoException();
                return true;
            case 6:
                C7088Mg c7088Mg = (C7088Mg) C9097ob.a(parcel, C7088Mg.CREATOR);
                C9097ob.c(parcel);
                t8(c7088Mg);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c4413m0 = iInterfaceQueryLocalInterface2 instanceof C4413m0 ? (C4413m0) iInterfaceQueryLocalInterface2 : new C4413m0(strongBinder2);
                }
                C9097ob.c(parcel);
                Q2(c4413m0);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC6955Ih interfaceC6955IhB9 = AbstractBinderC6921Hh.B9(parcel.readStrongBinder());
                d2 d2Var = (d2) C9097ob.a(parcel, d2.CREATOR);
                C9097ob.c(parcel);
                m4(interfaceC6955IhB9, d2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Jc.e eVar = (Jc.e) C9097ob.a(parcel, Jc.e.CREATOR);
                C9097ob.c(parcel);
                o1(eVar);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC7057Lh interfaceC7057LhB9 = AbstractBinderC7023Kh.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                e5(interfaceC7057LhB9);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C7364Uj c7364Uj = (C7364Uj) C9097ob.a(parcel, C7364Uj.CREATOR);
                C9097ob.c(parcel);
                w2(c7364Uj);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC8047ek interfaceC8047ekB9 = AbstractBinderC7941dk.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Q6(interfaceC8047ekB9);
                parcel2.writeNoException();
                return true;
            case 15:
                Jc.a aVar = (Jc.a) C9097ob.a(parcel, Jc.a.CREATOR);
                C9097ob.c(parcel);
                i8(aVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public P() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }
}
