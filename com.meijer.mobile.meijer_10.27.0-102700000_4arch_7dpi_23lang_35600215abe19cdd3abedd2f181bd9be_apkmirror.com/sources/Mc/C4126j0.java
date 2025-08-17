package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7490ah;
import com.google.android.gms.internal.ads.AbstractBinderC7613bp;
import com.google.android.gms.internal.ads.AbstractBinderC8255hq;
import com.google.android.gms.internal.ads.AbstractBinderC8568kn;
import com.google.android.gms.internal.ads.AbstractBinderC9423sn;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7703ch;
import com.google.android.gms.internal.ads.InterfaceC7719cp;
import com.google.android.gms.internal.ads.InterfaceC8361iq;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9530tn;

/* renamed from: Mc.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4126j0 extends C8758mb implements InterfaceC4132l0 {
    C4126j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC7719cp D2(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(12, parcelA1);
        InterfaceC7719cp interfaceC7719cpB9 = AbstractBinderC7613bp.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7719cpB9;
    }

    @Override // Mc.InterfaceC4132l0
    public final V D4(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(13, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof V) {
                t10 = (V) iInterfaceQueryLocalInterface;
            } else {
                t10 = new T(strongBinder);
            }
        }
        parcelA2.recycle();
        return t10;
    }

    @Override // Mc.InterfaceC4132l0
    public final Q F7(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Q o10;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(3, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            o10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (iInterfaceQueryLocalInterface instanceof Q) {
                o10 = (Q) iInterfaceQueryLocalInterface;
            } else {
                o10 = new O(strongBinder);
            }
        }
        parcelA2.recycle();
        return o10;
    }

    @Override // Mc.InterfaceC4132l0
    public final Q0 J1(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Q0 o02;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(17, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            o02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (iInterfaceQueryLocalInterface instanceof Q0) {
                o02 = (Q0) iInterfaceQueryLocalInterface;
            } else {
                o02 = new O0(strongBinder);
            }
        }
        parcelA2.recycle();
        return o02;
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC7703ch K2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, bVar2);
        Parcel parcelA2 = a2(5, parcelA1);
        InterfaceC7703ch interfaceC7703chB9 = AbstractBinderC7490ah.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7703chB9;
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC8361iq L5(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(14, parcelA1);
        InterfaceC8361iq interfaceC8361iqB9 = AbstractBinderC8255hq.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC8361iqB9;
    }

    @Override // Mc.InterfaceC4132l0
    public final V S4(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof V) {
                t10 = (V) iInterfaceQueryLocalInterface;
            } else {
                t10 = new T(strongBinder);
            }
        }
        parcelA2.recycle();
        return t10;
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC4161v0 j4(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        InterfaceC4161v0 c4155t0;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(9, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c4155t0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4161v0) {
                c4155t0 = (InterfaceC4161v0) iInterfaceQueryLocalInterface;
            } else {
                c4155t0 = new C4155t0(strongBinder);
            }
        }
        parcelA2.recycle();
        return c4155t0;
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC8675ln k8(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(15, parcelA1);
        InterfaceC8675ln interfaceC8675lnB9 = AbstractBinderC8568kn.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC8675lnB9;
    }

    @Override // Mc.InterfaceC4132l0
    public final V w3(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(2, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof V) {
                t10 = (V) iInterfaceQueryLocalInterface;
            } else {
                t10 = new T(strongBinder);
            }
        }
        parcelA2.recycle();
        return t10;
    }

    @Override // Mc.InterfaceC4132l0
    public final V x3(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, int i10) throws RemoteException {
        V t10;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, d2Var);
        parcelA1.writeString(str);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(10, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof V) {
                t10 = (V) iInterfaceQueryLocalInterface;
            } else {
                t10 = new T(strongBinder);
            }
        }
        parcelA2.recycle();
        return t10;
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC9530tn y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(8, parcelA1);
        InterfaceC9530tn interfaceC9530tnB9 = AbstractBinderC9423sn.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC9530tnB9;
    }
}
