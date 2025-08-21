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
public abstract class AbstractBinderC10188ym extends BinderC8990nb implements InterfaceC10295zm {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC6757Cm c6689Am = null;
        InterfaceC8584jm c8372hm = null;
        InterfaceC9546sm c9333qm = null;
        InterfaceC8905mm c8691km = null;
        InterfaceC9974wm c9653tm = null;
        InterfaceC9546sm c9333qm2 = null;
        InterfaceC9974wm c9653tm2 = null;
        InterfaceC9226pm c9012nm = null;
        InterfaceC8905mm c8691km2 = null;
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) C9097ob.a(parcel, creator);
            Bundle bundle2 = (Bundle) C9097ob.a(parcel, creator);
            Oc.d2 d2Var = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c6689Am = iInterfaceQueryLocalInterface instanceof InterfaceC6757Cm ? (InterfaceC6757Cm) iInterfaceQueryLocalInterface : new C6689Am(strongBinder);
            }
            C9097ob.c(parcel);
            d1(bVarA2, string, bundle, bundle2, d2Var, c6689Am);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            C7130Nm c7130NmZzf = zzf();
            parcel2.writeNoException();
            C9097ob.e(parcel2, c7130NmZzf);
        } else if (i10 == 3) {
            C7130Nm c7130NmZzg = zzg();
            parcel2.writeNoException();
            C9097ob.e(parcel2, c7130NmZzg);
        } else if (i10 == 5) {
            Oc.Y0 y0Zze = zze();
            parcel2.writeNoException();
            C9097ob.f(parcel2, y0Zze);
        } else if (i10 == 10) {
            b.a.a2(parcel.readStrongBinder());
            C9097ob.c(parcel);
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    Oc.Y1 y12 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c8691km2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC8905mm ? (InterfaceC8905mm) iInterfaceQueryLocalInterface2 : new C8691km(strongBinder2);
                    }
                    InterfaceC8905mm interfaceC8905mm = c8691km2;
                    InterfaceC6960Il interfaceC6960IlB9 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    Oc.d2 d2Var2 = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
                    C9097ob.c(parcel);
                    G1(string2, string3, y12, bVarA22, interfaceC8905mm, interfaceC6960IlB9, d2Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    Oc.Y1 y13 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        c9012nm = iInterfaceQueryLocalInterface3 instanceof InterfaceC9226pm ? (InterfaceC9226pm) iInterfaceQueryLocalInterface3 : new C9012nm(strongBinder3);
                    }
                    InterfaceC6960Il interfaceC6960IlB92 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    A1(string4, string5, y13, bVarA23, c9012nm, interfaceC6960IlB92);
                    parcel2.writeNoException();
                    break;
                case 15:
                    com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    boolean zD = D(bVarA24);
                    parcel2.writeNoException();
                    parcel2.writeInt(zD ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    Oc.Y1 y14 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c9653tm2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC9974wm ? (InterfaceC9974wm) iInterfaceQueryLocalInterface4 : new C9653tm(strongBinder4);
                    }
                    InterfaceC6960Il interfaceC6960IlB93 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    u2(string6, string7, y14, bVarA25, c9653tm2, interfaceC6960IlB93);
                    parcel2.writeNoException();
                    break;
                case 17:
                    com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    boolean zO0 = o0(bVarA26);
                    parcel2.writeNoException();
                    parcel2.writeInt(zO0 ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    Oc.Y1 y15 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c9333qm2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC9546sm ? (InterfaceC9546sm) iInterfaceQueryLocalInterface5 : new C9333qm(strongBinder5);
                    }
                    InterfaceC6960Il interfaceC6960IlB94 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    c6(string8, string9, y15, bVarA27, c9333qm2, interfaceC6960IlB94);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    C9097ob.c(parcel);
                    q0(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    Oc.Y1 y16 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c9653tm = iInterfaceQueryLocalInterface6 instanceof InterfaceC9974wm ? (InterfaceC9974wm) iInterfaceQueryLocalInterface6 : new C9653tm(strongBinder6);
                    }
                    InterfaceC6960Il interfaceC6960IlB95 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    e3(string11, string12, y16, bVarA28, c9653tm, interfaceC6960IlB95);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    Oc.Y1 y17 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c8691km = iInterfaceQueryLocalInterface7 instanceof InterfaceC8905mm ? (InterfaceC8905mm) iInterfaceQueryLocalInterface7 : new C8691km(strongBinder7);
                    }
                    InterfaceC8905mm interfaceC8905mm2 = c8691km;
                    InterfaceC6960Il interfaceC6960IlB96 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    Oc.d2 d2Var3 = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
                    C9097ob.c(parcel);
                    m1(string13, string14, y17, bVarA29, interfaceC8905mm2, interfaceC6960IlB96, d2Var3);
                    parcel2.writeNoException();
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    Oc.Y1 y18 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c9333qm = iInterfaceQueryLocalInterface8 instanceof InterfaceC9546sm ? (InterfaceC9546sm) iInterfaceQueryLocalInterface8 : new C9333qm(strongBinder8);
                    }
                    InterfaceC6960Il interfaceC6960IlB97 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C7088Mg c7088Mg = (C7088Mg) C9097ob.a(parcel, C7088Mg.CREATOR);
                    C9097ob.c(parcel);
                    g3(string15, string16, y18, bVarA210, c9333qm, interfaceC6960IlB97, c7088Mg);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    Oc.Y1 y19 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                    com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        c8372hm = iInterfaceQueryLocalInterface9 instanceof InterfaceC8584jm ? (InterfaceC8584jm) iInterfaceQueryLocalInterface9 : new C8372hm(strongBinder9);
                    }
                    InterfaceC6960Il interfaceC6960IlB98 = AbstractBinderC6926Hl.B9(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    x9(string17, string18, y19, bVarA211, c8372hm, interfaceC6960IlB98);
                    parcel2.writeNoException();
                    break;
                case 24:
                    com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                    C9097ob.c(parcel);
                    boolean zE = E(bVarA212);
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            C9097ob.c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }

    public AbstractBinderC10188ym() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static InterfaceC10295zm B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10295zm ? (InterfaceC10295zm) iInterfaceQueryLocalInterface : new C10081xm(iBinder);
    }
}
