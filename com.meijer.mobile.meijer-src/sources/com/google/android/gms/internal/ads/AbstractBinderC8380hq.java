package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8380hq extends BinderC8990nb implements InterfaceC8486iq {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC8166fq c7952dq = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8913mq c8913mq = (C8913mq) C9097ob.a(parcel, C8913mq.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c7952dq = iInterfaceQueryLocalInterface instanceof InterfaceC8166fq ? (InterfaceC8166fq) iInterfaceQueryLocalInterface : new C7952dq(strongBinder);
                }
                C9097ob.c(parcel);
                d5(bVarA2, c8913mq, c7952dq);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                O(bVarA22);
                parcel2.writeNoException();
                return true;
            case 3:
                b.a.a2(parcel.readStrongBinder());
                b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 4:
                b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6962In interfaceC6962InB9 = AbstractBinderC6928Hn.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                q9(arrayListCreateTypedArrayList, bVarA23, interfaceC6962InB9);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6962In interfaceC6962InB92 = AbstractBinderC6928Hn.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                L8(arrayListCreateTypedArrayList2, bVarA24, interfaceC6962InB92);
                parcel2.writeNoException();
                return true;
            case 7:
                C7097Mn c7097Mn = (C7097Mn) C9097ob.a(parcel, C7097Mn.CREATOR);
                C9097ob.c(parcel);
                D5(c7097Mn);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Q(bVarA25);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6962In interfaceC6962InB93 = AbstractBinderC6928Hn.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                B7(arrayListCreateTypedArrayList3, bVarA26, interfaceC6962InB93);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6962In interfaceC6962InB94 = AbstractBinderC6928Hn.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Y6(arrayListCreateTypedArrayList4, bVarA27, interfaceC6962InB94);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                String string = parcel.readString();
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                com.google.android.gms.dynamic.b bVarZ2 = Z2(bVarA28, bVarA29, string, bVarA210);
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZ2);
                return true;
            default:
                return false;
        }
    }

    public AbstractBinderC8380hq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC8486iq B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8486iq ? (InterfaceC8486iq) iInterfaceQueryLocalInterface : new C8273gq(iBinder);
    }
}
