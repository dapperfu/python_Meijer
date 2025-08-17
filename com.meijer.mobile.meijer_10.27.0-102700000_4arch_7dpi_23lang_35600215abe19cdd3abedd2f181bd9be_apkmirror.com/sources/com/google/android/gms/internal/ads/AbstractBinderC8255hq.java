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
public abstract class AbstractBinderC8255hq extends BinderC8865nb implements InterfaceC8361iq {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC8041fq c7827dq = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8788mq c8788mq = (C8788mq) C8972ob.a(parcel, C8788mq.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c7827dq = iInterfaceQueryLocalInterface instanceof InterfaceC8041fq ? (InterfaceC8041fq) iInterfaceQueryLocalInterface : new C7827dq(strongBinder);
                }
                C8972ob.c(parcel);
                N4(bVarA2, c8788mq, c7827dq);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                O(bVarA22);
                parcel2.writeNoException();
                return true;
            case 3:
                b.a.a2(parcel.readStrongBinder());
                b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 4:
                b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6837In interfaceC6837InB9 = AbstractBinderC6803Hn.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                q9(arrayListCreateTypedArrayList, bVarA23, interfaceC6837InB9);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6837In interfaceC6837InB92 = AbstractBinderC6803Hn.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Q8(arrayListCreateTypedArrayList2, bVarA24, interfaceC6837InB92);
                parcel2.writeNoException();
                return true;
            case 7:
                C6972Mn c6972Mn = (C6972Mn) C8972ob.a(parcel, C6972Mn.CREATOR);
                C8972ob.c(parcel);
                w5(c6972Mn);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Q(bVarA25);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6837In interfaceC6837InB93 = AbstractBinderC6803Hn.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                v7(arrayListCreateTypedArrayList3, bVarA26, interfaceC6837InB93);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6837In interfaceC6837InB94 = AbstractBinderC6803Hn.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                M6(arrayListCreateTypedArrayList4, bVarA27, interfaceC6837InB94);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                String string = parcel.readString();
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                com.google.android.gms.dynamic.b bVarT2 = T2(bVarA28, bVarA29, string, bVarA210);
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarT2);
                return true;
            default:
                return false;
        }
    }

    public AbstractBinderC8255hq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC8361iq B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8361iq ? (InterfaceC8361iq) iInterfaceQueryLocalInterface : new C8148gq(iBinder);
    }
}
