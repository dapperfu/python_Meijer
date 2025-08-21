package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC7615ah;
import com.google.android.gms.internal.ads.AbstractBinderC7738bp;
import com.google.android.gms.internal.ads.AbstractBinderC8380hq;
import com.google.android.gms.internal.ads.AbstractBinderC8693kn;
import com.google.android.gms.internal.ads.AbstractBinderC9548sn;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7828ch;
import com.google.android.gms.internal.ads.InterfaceC7844cp;
import com.google.android.gms.internal.ads.InterfaceC8486iq;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9655tn;

/* renamed from: Oc.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4404j0 extends C8883mb implements InterfaceC4410l0 {
    C4404j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // Oc.InterfaceC4410l0
    public final V B4(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, int i10) throws RemoteException {
        V t10;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        parcelK1.writeString(str);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(10, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC7844cp G2(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(12, parcelK1);
        InterfaceC7844cp interfaceC7844cpB9 = AbstractBinderC7738bp.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7844cpB9;
    }

    @Override // Oc.InterfaceC4410l0
    public final Q J7(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Q o10;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(3, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final V O7(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(2, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC7828ch P2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, bVar2);
        Parcel parcelA2 = a2(5, parcelK1);
        InterfaceC7828ch interfaceC7828chB9 = AbstractBinderC7615ah.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7828chB9;
    }

    @Override // Oc.InterfaceC4410l0
    public final Q0 Q1(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Q0 o02;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(17, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final V T2(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC8486iq U5(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(14, parcelK1);
        InterfaceC8486iq interfaceC8486iqB9 = AbstractBinderC8380hq.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC8486iqB9;
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC8800ln h8(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(15, parcelK1);
        InterfaceC8800ln interfaceC8800lnB9 = AbstractBinderC8693kn.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC8800lnB9;
    }

    @Override // Oc.InterfaceC4410l0
    public final V r2(com.google.android.gms.dynamic.b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        V t10;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, d2Var);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(13, parcelK1);
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

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC4439v0 x4(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        InterfaceC4439v0 c4433t0;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(9, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c4433t0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC4439v0) {
                c4433t0 = (InterfaceC4439v0) iInterfaceQueryLocalInterface;
            } else {
                c4433t0 = new C4433t0(strongBinder);
            }
        }
        parcelA2.recycle();
        return c4433t0;
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC9655tn y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        Parcel parcelA2 = a2(8, parcelK1);
        InterfaceC9655tn interfaceC9655tnB9 = AbstractBinderC9548sn.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC9655tnB9;
    }
}
