package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.ym, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10063ym extends BinderC8865nb implements InterfaceC10170zm {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC6632Cm c6564Am = null;
        InterfaceC8459jm c8247hm = null;
        InterfaceC9421sm c9208qm = null;
        InterfaceC8780mm c8566km = null;
        InterfaceC9849wm c9528tm = null;
        InterfaceC9421sm c9208qm2 = null;
        InterfaceC9849wm c9528tm2 = null;
        InterfaceC9101pm c8887nm = null;
        InterfaceC8780mm c8566km2 = null;
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) C8972ob.a(parcel, creator);
            Bundle bundle2 = (Bundle) C8972ob.a(parcel, creator);
            Mc.d2 d2Var = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c6564Am = iInterfaceQueryLocalInterface instanceof InterfaceC6632Cm ? (InterfaceC6632Cm) iInterfaceQueryLocalInterface : new C6564Am(strongBinder);
            }
            C8972ob.c(parcel);
            u2(bVarA2, string, bundle, bundle2, d2Var, c6564Am);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            C7005Nm c7005NmZzf = zzf();
            parcel2.writeNoException();
            C8972ob.e(parcel2, c7005NmZzf);
        } else if (i10 == 3) {
            C7005Nm c7005NmZzg = zzg();
            parcel2.writeNoException();
            C8972ob.e(parcel2, c7005NmZzg);
        } else if (i10 == 5) {
            Mc.Y0 y0Zze = zze();
            parcel2.writeNoException();
            C8972ob.f(parcel2, y0Zze);
        } else if (i10 == 10) {
            b.a.a2(parcel.readStrongBinder());
            C8972ob.c(parcel);
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    Mc.Y1 y12 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c8566km2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC8780mm ? (InterfaceC8780mm) iInterfaceQueryLocalInterface2 : new C8566km(strongBinder2);
                    }
                    InterfaceC8780mm interfaceC8780mm = c8566km2;
                    InterfaceC6835Il interfaceC6835IlB9 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    Mc.d2 d2Var2 = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
                    C8972ob.c(parcel);
                    n2(string2, string3, y12, bVarA22, interfaceC8780mm, interfaceC6835IlB9, d2Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    Mc.Y1 y13 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        c8887nm = iInterfaceQueryLocalInterface3 instanceof InterfaceC9101pm ? (InterfaceC9101pm) iInterfaceQueryLocalInterface3 : new C8887nm(strongBinder3);
                    }
                    InterfaceC6835Il interfaceC6835IlB92 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    b1(string4, string5, y13, bVarA23, c8887nm, interfaceC6835IlB92);
                    parcel2.writeNoException();
                    break;
                case 15:
                    com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    boolean zD = D(bVarA24);
                    parcel2.writeNoException();
                    parcel2.writeInt(zD ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    Mc.Y1 y14 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c9528tm2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC9849wm ? (InterfaceC9849wm) iInterfaceQueryLocalInterface4 : new C9528tm(strongBinder4);
                    }
                    InterfaceC6835Il interfaceC6835IlB93 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    I7(string6, string7, y14, bVarA25, c9528tm2, interfaceC6835IlB93);
                    parcel2.writeNoException();
                    break;
                case 17:
                    com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    boolean zN0 = n0(bVarA26);
                    parcel2.writeNoException();
                    parcel2.writeInt(zN0 ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    Mc.Y1 y15 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c9208qm2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC9421sm ? (InterfaceC9421sm) iInterfaceQueryLocalInterface5 : new C9208qm(strongBinder5);
                    }
                    InterfaceC6835Il interfaceC6835IlB94 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    r5(string8, string9, y15, bVarA27, c9208qm2, interfaceC6835IlB94);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    C8972ob.c(parcel);
                    p0(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    Mc.Y1 y16 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c9528tm = iInterfaceQueryLocalInterface6 instanceof InterfaceC9849wm ? (InterfaceC9849wm) iInterfaceQueryLocalInterface6 : new C9528tm(strongBinder6);
                    }
                    InterfaceC6835Il interfaceC6835IlB95 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    b9(string11, string12, y16, bVarA28, c9528tm, interfaceC6835IlB95);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    Mc.Y1 y17 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c8566km = iInterfaceQueryLocalInterface7 instanceof InterfaceC8780mm ? (InterfaceC8780mm) iInterfaceQueryLocalInterface7 : new C8566km(strongBinder7);
                    }
                    InterfaceC8780mm interfaceC8780mm2 = c8566km;
                    InterfaceC6835Il interfaceC6835IlB96 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    Mc.d2 d2Var3 = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
                    C8972ob.c(parcel);
                    O1(string13, string14, y17, bVarA29, interfaceC8780mm2, interfaceC6835IlB96, d2Var3);
                    parcel2.writeNoException();
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    Mc.Y1 y18 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c9208qm = iInterfaceQueryLocalInterface8 instanceof InterfaceC9421sm ? (InterfaceC9421sm) iInterfaceQueryLocalInterface8 : new C9208qm(strongBinder8);
                    }
                    InterfaceC6835Il interfaceC6835IlB97 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C6963Mg c6963Mg = (C6963Mg) C8972ob.a(parcel, C6963Mg.CREATOR);
                    C8972ob.c(parcel);
                    h8(string15, string16, y18, bVarA210, c9208qm, interfaceC6835IlB97, c6963Mg);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    Mc.Y1 y19 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        c8247hm = iInterfaceQueryLocalInterface9 instanceof InterfaceC8459jm ? (InterfaceC8459jm) iInterfaceQueryLocalInterface9 : new C8247hm(strongBinder9);
                    }
                    InterfaceC6835Il interfaceC6835IlB98 = AbstractBinderC6801Hl.B9(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    Z2(string17, string18, y19, bVarA211, c8247hm, interfaceC6835IlB98);
                    parcel2.writeNoException();
                    break;
                case 24:
                    com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                    C8972ob.c(parcel);
                    boolean zE = E(bVarA212);
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            C8972ob.c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }

    public AbstractBinderC10063ym() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static InterfaceC10170zm B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10170zm ? (InterfaceC10170zm) iInterfaceQueryLocalInterface : new C9956xm(iBinder);
    }
}
